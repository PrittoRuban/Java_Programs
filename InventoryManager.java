import java.sql.*;

public class InventoryManager {
    private Connection connection;

    public InventoryManager() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/your_database_name", "your_username","your_password");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addProduct(String name, String category, int quantity) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO inventory (name, category, quantity) VALUES (?, ?, ?)");
            statement.setString(1, name);
            statement.setString(2, category);
            statement.setInt(3, quantity);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateProduct(String name, String category, int quantity) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE inventory SET category = ?, quantity = ? WHERE name = ?");
            statement.setString(1, category);
            statement.setInt(2, quantity);
            statement.setString(3, name);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void searchProductByName(String name) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM inventory WHERE name = ?");
            statement.setString(1, name);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString("name") +
                        ", Category: " + resultSet.getString("category") +
                        ", Quantity: " + resultSet.getInt("quantity"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void searchProductByCategory(String category) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM inventory WHERE category = ?");
            statement.setString(1, category);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString("name") +
                        ", Category: " + resultSet.getString("category") +
                        ", Quantity: " + resultSet.getInt("quantity"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
