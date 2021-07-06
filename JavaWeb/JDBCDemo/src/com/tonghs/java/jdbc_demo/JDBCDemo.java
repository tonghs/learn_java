package com.tonghs.java.jdbc_demo;

import java.sql.*;

/**
 * JDBCDemo class
 *
 * @author tonghs
 * @date 2021/06/29
 */
public class JDBCDemo {
    public static void main(String[] args) throws Exception {
//        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.0.251:3306/jarvis", "tonghs", "OhMyGod20!@");
        Statement stmt = connection.createStatement();
        String sql = "select * from ec_item limit 100";
        boolean execute = stmt.execute(sql);
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()) {
            int id = rs.getInt(1);
            String url = rs.getString(4);
            String name = rs.getString("name");
            System.out.println(id + " " + url + " " + name);
        }

        System.out.println(execute);
        stmt.close();
        connection.close();
    }
}
