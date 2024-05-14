import java.sql.*;

public class EventManager {
    private Connection connection;

    public EventManager() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/your_database_name", "your_username","your_password");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addEvent(String name, String location, Date date) {
        try {
            String query = "INSERT INTO events (name, location, date) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, name);
            statement.setString(2, location);
            statement.setDate(3, date);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateEvent(String name, String location, Date date) {
        try {
            String query = "UPDATE events SET location = ?, date = ? WHERE name = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, location);
            statement.setDate(2, date);
            statement.setString(3, name);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void searchEventByDate(Date date) {
        try {
            String query = "SELECT * FROM events WHERE date = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setDate(1, date);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString("name") +
                        ", Location: " + resultSet.getString("location") +
                        ", Date: " + resultSet.getDate("date"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void searchEventByLocation(String location) {
        try {
            String query = "SELECT * FROM events WHERE location = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, location);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString("name") +
                        ", Location: " + resultSet.getString("location") +
                        ", Date: " + resultSet.getDate("date"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteEvent(String name) {
        try {
            String query = "DELETE FROM events WHERE name = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, name);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
