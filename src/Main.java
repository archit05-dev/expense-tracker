import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        // Database URL
        String url = "jdbc:mysql://localhost:3306/expense_tracker";

        // MySQL username
        String username = "root";

        // Your MySQL password
        String password = "Arch@909";

        try {

            // Try to establish a connection
            Connection connection =
                    DriverManager.getConnection(url, username, password);

            System.out.println("Connection Successful!");

            // Always close the connection when done
            connection.close();

        } catch (SQLException e) {

            System.out.println("Connection Failed!");

            e.printStackTrace();
        }
    }
}