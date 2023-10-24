public class Registration {
    private Database database;

    public Registration(Database database) {
        this.database = database;
    }

    public void registerUser(String email, String username, String password) {
        User existingUser = database.getUserByEmail(email);
        if (existingUser != null) {
            System.out.println("User already exists. Please sign in.");
        } else {
            User newUser = new User(email, username, password);
            database.addUser(newUser);
            System.out.println("Registration successful. You can now sign in.");
        }
    }
}

