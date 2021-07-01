package com.tonghs.java.jdbc_project;

import com.tonghs.java.jdbc_demo.JDBCUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * LoginDemo class
 *
 * @author tonghs
 * @date 2021/07/01
 */
public class LoginDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("username: ");
        String username = sc.nextLine();

        System.out.println("password: ");
        String password = sc.nextLine();

        boolean flag = new LoginDemo().login(username, password);
        if (flag) {
            System.out.println("ok");
        } else {
            System.out.println("invalid username or password");
        }

    }

    public boolean login(String username, String password) {
        if (username == null || password == null) {
            return false;
        }

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtil.getConnection();
            String sql = "select * from user where username='" + username + "' and password = '" + password + "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            JDBCUtil.close(stmt, rs, conn);
        }
    }
}
