import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {

    // Database URL
    static final String DB_URL = "jdbc:mysql://localhost:3306/iss";
    // Database credentials
    static final String USER = "root";
    static final String PASS = "password";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        
        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Create a statement
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            // Create table
            String sql = "CREATE TABLE IF NOT EXISTS users (" +
                         "user_id INT AUTO_INCREMENT PRIMARY KEY, " +
                         "username VARCHAR(50) UNIQUE NOT NULL, " +
                         "password VARCHAR(255) NOT NULL, " +
                         "email VARCHAR(100), " +
                         "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP)";
            stmt.executeUpdate(sql);

            // Insert data
            sql = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "john_doe");
            pstmt.setString(2, "password123");
            pstmt.setString(3, "john@example.com");
            pstmt.executeUpdate();

            pstmt.setString(1, "jane_smith");
            pstmt.setString(2, "securepassword");
            pstmt.setString(3, "jane@example.com");
            pstmt.executeUpdate();

            // Read data
            sql = "SELECT user_id, username, email, created_at FROM users";
            ResultSet rs = stmt.executeQuery(sql);

            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                int userId = rs.getInt("user_id");
                String username = rs.getString("username");
                String email = rs.getString("email");
                String createdAt = rs.getString("created_at");

                // Display values
                System.out.print("User ID: " + userId);
                System.out.print(", Username: " + username);
                System.out.print(", Email: " + email);
                System.out.println(", Created At: " + createdAt);
            }
            rs.close();

            // Update data
            sql = "UPDATE users SET email = ? WHERE username = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "john_new@example.com");
            pstmt.setString(2, "john_doe");
            pstmt.executeUpdate();

            // Delete data
            sql = "DELETE FROM users WHERE username = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "jane_smith");
            pstmt.executeUpdate();

            // Clean-up environment
            pstmt.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // Finally block used to close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            } // Nothing we can do
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } // End finally try
        } // End try
        System.out.println("Goodbye!");
    }
}
