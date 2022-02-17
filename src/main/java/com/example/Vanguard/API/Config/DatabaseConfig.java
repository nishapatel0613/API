package com.example.Vanguard.API.Config;

import java.sql.*;

public class DatabaseConfig {

    public Connection getMyDBConnection(){
        registerJDBCDriver();
        Connection myConnection = getConnection("h2");
        return myConnection;
    }
    public static void executeStatement(Connection connection, String h2Statement) {
        try{
            Statement statement = getScrollableStatement(connection);
            statement.execute(h2Statement);

        }catch (SQLException e){
            throw new Error(e);
        }
    }

    static Statement getScrollableStatement(Connection connection){
        int resultSetType = ResultSet.TYPE_SCROLL_INSENSITIVE;
        int resultSetConcurrency = ResultSet.CONCUR_READ_ONLY;
        try{
            return connection.createStatement(resultSetType,resultSetConcurrency);
        }catch (SQLException e){
            throw new Error(e);
        }
    }

    public Connection getConnection(String h2) {
        String username = "myuser";
        String password = "mypwd";
        String url = new StringBuilder()
                .append("jdbc:")
                .append(h2)
                .append("://localhost:8080/")
                .append("?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC")
                .toString();
        try{
            return DriverManager.getConnection(url,username,password);
        }catch (SQLException e) {
            throw new Error(e);
        }

    }

    private void registerJDBCDriver() {
        try{
            DriverManager.registerDriver(Driver.class.newInstance());
        }catch (InstantiationException | IllegalAccessException | SQLException e1){
            throw new RuntimeException(e1);

        }
    }
}
