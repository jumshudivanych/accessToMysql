package sandbox50572;

import java.sql.*;

public class JDBC {

    String message;

    public JDBC(String message) {
        this.message = message;
    }

    public void connectMySql() {


        String url = "jdbc:mysql://localhost:3306/mess";
        String user = "mess";
        String pass = "1234cani";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                Connection connection = DriverManager.getConnection(url, user, pass);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM messages");
                while (resultSet.next()) {
                    System.out.println(resultSet.getString(2));
                }
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
