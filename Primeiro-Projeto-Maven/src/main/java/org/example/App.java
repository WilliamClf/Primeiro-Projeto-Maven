package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/databaseprojetomaven";
        String user = "root";
        String password = "sdb162sw";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);
            System.out.println("Conexão estabelecida!"+ url);
            String insert = "insert into EMPRESA values(1, 'M&W ltda.')";
            Statement statement = connection.createStatement();
            statement.execute(insert);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
