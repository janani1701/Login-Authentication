import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }

        Database database = new Database();
        Registration registration = new Registration(database);
        SignIn signIn = new SignIn(database);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Register\n2. Sign In\n3. Reset Password\n4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    registration.registerUser(email, username, password);
                    break;
                case 2:
                    System.out.print("Enter email: ");
                    email = scanner.nextLine();
                    System.out.print("Enter password: ");
                    password = scanner.nextLine();
                    User user = signIn.signIn(email, password);
                    if (user != null) {
                        System.out.println("Sign-in successful. Welcome, " + user.getUsername() + "!");
                    } else {
                        System.out.println("Sign-in failed. Check your email and password.");
                    }
                    break;
                case 3:
                    System.out.print("Enter email to reset password: ");
                    email = scanner.nextLine();
                    System.out.print("Enter new password: ");
                    password = scanner.nextLine();
                    signIn.resetPassword(email, password);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}


