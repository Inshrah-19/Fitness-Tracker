package fitnesstrackerproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class DatabaseConnection {
  private static final String DB_URL = "jdbc:ucanaccess://C:/Users/HP/Desktop/Fitness Tracker.accdb"; // Path to your Access database
    private static final String DB_USER = ""; // Leave empty if no user is required for Access
    private static final String DB_PASSWORD = ""; // Leave empty if no password is required for Access

    // Method to establish a connection to the database
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL); // For Access, typically no need for username/password
    }

    // Validate user by checking username and password
    public static boolean validateUser(String username, String password) {
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";
        try (Connection conn = getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(query)) {
             
            stmt.setString(1, username);  // Set the username parameter
            stmt.setString(2, password);  // Set the password parameter
            
            ResultSet rs = stmt.executeQuery();
            return rs.next(); // Returns true if a matching user is found
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Returns false if there is an exception
        }
    }

    // Register a new user by inserting their username and password into the database
    public static boolean registerUser(String username, String password, String email) {
        String query = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
        try (Connection conn = getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, username);  // Set the username parameter
            stmt.setString(2, password);  // Set the password parameter
            stmt.setString(3, email);
            
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;  // Return true if the user is successfully registered
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Return false if an error occurs
        }
    }
}