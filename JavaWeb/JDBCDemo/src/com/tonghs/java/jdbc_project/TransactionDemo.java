package com.tonghs.java.jdbc_project;

import com.tonghs.java.jdbc_demo.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * TransactionDemo class
 *
 * @author tonghs
 * @date 2021/07/06
 */
public class TransactionDemo {
    public static void main(String[] args) {
        double cnt = 100;
        Connection conn = null;
        PreparedStatement stmt1 = null;
        PreparedStatement stmt2 = null;

        try {
            conn = JDBCUtil.getConnection();
            String sql1 = "update account set balance = balance - ? where name = ?";
            String sql2 = "update account set balance = balance + ? where name = ?";

            stmt1 = conn.prepareStatement(sql1);
            stmt1.setDouble(1, cnt);
            stmt1.setString(2, "zhangsan");

            stmt2 = conn.prepareStatement(sql2);
            stmt2.setDouble(1, cnt);
            stmt2.setString(2, "lisi");

//            stmt1.executeUpdate();
//            int a = 3 / 0;
//            stmt2.executeUpdate();

            conn.setAutoCommit(false);
            stmt1.executeUpdate();
//            int a = 3 / 0;
            stmt2.executeUpdate();
            conn.commit();

        } catch (Exception e) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            JDBCUtil.close(stmt1, conn);
            JDBCUtil.close(stmt2, null);
        }
    }
}
