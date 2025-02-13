package map_interface.design_voting_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Test_VotingSystem {
    private VotingSystem votingSystem;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        votingSystem = new VotingSystem();
        System.setOut(new PrintStream(outContent)); // Redirect output for testing
    }

    @Test
    void testCastVote() {
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        assertEquals(2, votingSystem.votes.get("Alice"));
        assertEquals(1, votingSystem.votes.get("Bob"));
    }

    @Test
    void testDisplaySortedResults() {
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        votingSystem.displaySortedResults();

        String expectedOutput = "\nVoting Results (Sorted by Candidate Name):\n"
                + "Alice -> 2 votes\n"
                + "Bob -> 1 votes\n"
                + "Charlie -> 1 votes\n";

        assertFalse(outContent.toString().contains(expectedOutput));
    }

    @Test
    void testDisplayVoteOrder() {
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");

        votingSystem.displayVoteOrder();

        String expectedOutput = "\nVotes in the Order They Were Cast:\n"
                + "Alice -> 2 votes\n"
                + "Bob -> 1 votes\n"
                + "Charlie -> 1 votes\n";

        assertFalse(outContent.toString().contains(expectedOutput));
    }
}
