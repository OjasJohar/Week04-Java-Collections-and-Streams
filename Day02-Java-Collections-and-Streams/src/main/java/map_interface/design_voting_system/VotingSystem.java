package map_interface.design_voting_system;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class VotingSystem {
    final HashMap<String, Integer> votes;           // Stores candidate votes
    private final LinkedHashMap<String, Integer> voteOrder; // Maintains order of voting
    private final TreeMap<String, Integer> sortedResults;   // Displays sorted results

    public VotingSystem() {
        votes = new HashMap<>();
        voteOrder = new LinkedHashMap<>();
        sortedResults = new TreeMap<>();
    }

    // Method to cast a vote
    public void castVote(String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, votes.get(candidate)); // Updates order of votes
    }

    // Method to display results sorted by candidate name
    public void displaySortedResults() {
        sortedResults.clear();
        sortedResults.putAll(votes);

        System.out.println("\nVoting Results (Sorted by Candidate Name):");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
        }
    }

    // Method to display votes in the order they were cast
    public void displayVoteOrder() {
        System.out.println("\nVotes in the Order They Were Cast:");
        for (Map.Entry<String, Integer> entry : voteOrder.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
        }
    }

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Simulating votes
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");

        // Display results
        votingSystem.displaySortedResults();
        votingSystem.displayVoteOrder();
    }
}
