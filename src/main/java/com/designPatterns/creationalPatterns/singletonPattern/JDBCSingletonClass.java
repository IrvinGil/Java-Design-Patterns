package com.designPatterns.creationalPatterns.singletonPattern;

import java.sql.*;

public class JDBCSingletonClass {
    //DONE TODO: create a singleton class
    //static member holds only one instance of the JDBCSingleton class.

    private static JDBCSingletonClass JDBCsingleton;

    //by creating this constructor, it prevents the instantiation from any other class
    public JDBCSingletonClass() {
    }

    //providing the global point of access by using a static factory method
    public static JDBCSingletonClass getInstance() {
        if (JDBCsingleton == null) {
            JDBCsingleton = new JDBCSingletonClass();
        }

        return JDBCsingleton;
    }

    // >>>>>>>>>>>

    //to get the connection from methods like insert, view etc.
    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ashwanirajput", "root", "ashwani");
        return connection;
    }

    //to insert the record into the database
    public int insert(String name, String password) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int recordCounter = 0;
        try {
            connection = this.getConnection();
            preparedStatement = connection.prepareStatement("insert into userdata(uname, upassword)values(?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, password);
            recordCounter = preparedStatement.executeUpdate();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
            return recordCounter;
        }
    }

    //to view data from the database
    public void view(String name) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = this.getConnection();

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    //to update the password for given username
    public int update(String name, String password) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        int recordCounter = 0;
        try {
            connection = this.getConnection();
            preparedStatement = connection.prepareStatement("update userdata set upassword=? where uname=" + name);
            preparedStatement.setString(1, password);
            recordCounter = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }

            return recordCounter;
        }
    }

    //to delete the data from the database
    public int delete(int userID) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int recordCounter = 0;
        try {
            connection = this.getConnection();
            preparedStatement = connection.prepareStatement("delete from userdata where Uid=" + userID);
            recordCounter = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return recordCounter;
    }

}
