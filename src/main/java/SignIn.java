public class SignIn {
    private Database database;

    public SignIn(Database database) {
        this.database = database;
    }

    public User signIn(String email, String password) {
        User user = database.getUserByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public void resetPassword(String email, String newPassword) {
        User user = database.getUserByEmail(email);
        if (user != null) {
            user = new User(email, user.getUsername(), newPassword);
            System.out.println("Password reset successful.");
        } else {
            System.out.println("User not found.");
        }
    }
}

