import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TarunTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tarundatabase"; // Replace with your database name
        String user = "root";
        String password = "shahzil"; // Replace with your MySQL password

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            // SQL query to create a sample table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS employees (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "first_name VARCHAR(50)," +
                "last_name VARCHAR(50)," +
                "email VARCHAR(100)" +
                ")";

            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'employees' created successfully.");

            // SQL query to insert dummy values into the table
            String insertDataSQL = "INSERT INTO employees (first_name, last_name, email) VALUES " +
                "('John', 'Doe', 'john.doe@example.com'), " +
                "('Jane', 'Smith', 'jane.smith@example.com'), " +
                "('Bob', 'Johnson', 'bob.johnson@example.com')";

            statement.executeUpdate(insertDataSQL);
            System.out.println("Dummy data inserted into the table.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}