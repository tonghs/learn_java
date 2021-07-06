package com.tonghs.java.conn_pool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * JDBCTest class
 *
 * @author tonghs
 * @date 2021/07/06
 */
public class JDBCTest {
    public static void main(String[] args) throws SQLException {
        Connection conn = JDBCUtil.getConnection();

        PreparedStatement pstmt = conn.prepareStatement("insert into account values (null, ?, ?)");
        pstmt.setString(1, "wangwu");
        pstmt.setDouble(2, 1500);
        int cnt = pstmt.executeUpdate();
        System.out.println(cnt);

        JDBCUtil.close(pstmt, conn);
    }
}
