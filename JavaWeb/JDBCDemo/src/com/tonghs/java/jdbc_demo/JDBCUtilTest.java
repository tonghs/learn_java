package com.tonghs.java.jdbc_demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBCUtilTest class
 *
 * @author tonghs
 * @date 2021/07/01
 */
public class JDBCUtilTest {
    public static void main(String[] args) throws SQLException {
        Connection conn = JDBCUtil.getConnection();
        String sql = "select * from account";

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            String name = rs.getString("name");
            System.out.println(name);
        }

        JDBCUtil.close(stmt, rs, conn);
    }
}
