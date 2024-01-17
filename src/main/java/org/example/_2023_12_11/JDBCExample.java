package org.example._2023_12_11;

import net.bytebuddy.dynamic.scaffold.MethodRegistry;

import java.sql.*;

public class JDBCExample {

    private static final String URL = "jdbc:mysql://localhost:3306/library";
    private static final String USER = "root";
    private static final String PASSWORD = "123123";

    private Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public void getAllAuthors() {
        String sql = "SELECT author_id, name, birthdate FROM authors";
        try (Connection connection = this.connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("author_id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("birthdate"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        JDBCExample jdbcExample = new JDBCExample();
        jdbcExample.getAllAuthors();
    }
}