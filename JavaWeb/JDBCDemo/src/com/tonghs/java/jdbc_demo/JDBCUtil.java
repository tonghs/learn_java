package com.tonghs.java.jdbc_demo;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * JDBCUtil jdbc 工具类
 *
 * @author tonghs
 * @date 2021/07/01
 */
public class JDBCUtil {
    private static String url;
    private static String user;
    private static String password;

    static {
        Properties pro = new Properties();

        ClassLoader cl = JDBCUtil.class.getClassLoader();
        URL res = cl.getResource("jdbc.properties");
        String path = res.getPath();

        try {
            pro.load(new FileReader(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        url = pro.getProperty("url");
        user = pro.getProperty("user");
        password = pro.getProperty("password");

        try {
            Class.forName(pro.getProperty("driver"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取链接
     * @return 链接对象
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public static void close(Statement stmt, Connection conn) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Statement stmt, ResultSet rs, Connection conn) {
        close(stmt, conn);
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
