package com.tonghs.java.jdbc_project;

import com.tonghs.java.jdbc_demo.JDBCUtil;

import java.sql.*;
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
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtil.getConnection();
            String sql = "select * from user where username= ? and password = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);

            rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            JDBCUtil.close(stmt, rs, conn);
        }
    }
}
