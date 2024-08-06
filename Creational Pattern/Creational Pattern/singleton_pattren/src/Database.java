public class Database {
    private static Database instance;
    private Connection connection;

    private Database() {
        // Initialize the database connection here
        this.connection = initializeConnection();
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    private Connection initializeConnection() {
        // Pseudo code for database connection
        return new Connection("Database Connection Established");
    }

    public Connection getConnection() {
        return connection;
    }
}
