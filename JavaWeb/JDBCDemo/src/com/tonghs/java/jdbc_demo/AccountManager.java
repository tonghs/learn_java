package com.tonghs.java.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * AccountManager class
 *
 * @author tonghs
 * @date 2021/06/29
 */
public class AccountManager {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.251:3306/learn_java?useUnicode=true&characterEncoding=utf-8", "tonghs", "OhMyGod20!@");
        Statement stmt = conn.createStatement();

        String sql = "insert into account (name, balance) value ('张三', 300)";
        int cnt = stmt.executeUpdate(sql);
        System.out.println(cnt);

        stmt.close();
        conn.close();
    }
}
