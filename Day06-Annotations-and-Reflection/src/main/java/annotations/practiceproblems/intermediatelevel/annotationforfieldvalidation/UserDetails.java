package annotations.practiceproblems.intermediatelevel.annotationforfieldvalidation;

public class UserDetails {
    public static void main(String[] args) {
        try {
            User validUser = new User("Ojas"); // username with valid length
            System.out.println("Valid username: " + validUser.getUsername());

            User invalidUser = new User("Ojasjohar123"); // username with invalid length
            System.out.println("Invalid username: " + invalidUser.getUsername());

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
