package assign_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdateDemo {
	public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/sampledb";
        String username = "root";
        String password = "Test123@";
 
        try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
 
            String sql = "UPDATE Users SET password=?, fullname=?, email=? WHERE username=?";
 
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "4123geetha");
            statement.setString(2, "java");
            statement.setString(3, "java@gatesfoundation.org");
            statement.setString(4, "geetha23");
 
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing user was updated successfully!");
            }
 

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


}
