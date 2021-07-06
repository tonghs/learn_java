package com.tonghs.java.conn_pool;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * C3P0ConnPoolDemo class
 *
 * @author tonghs
 * @date 2021/07/06
 */
public class C3P0ConnPoolDemo {
    public static void main(String[] args) throws SQLException {
        DataSource ds = new ComboPooledDataSource();
//        DataSource ds = new ComboPooledDataSource("mySource");
        Connection conn = ds.getConnection();
        System.out.println(conn);
        for(int i = 0; i <= 20; i ++ ){
            conn = ds.getConnection();
            System.out.println(conn);

            if (i == 5) {
                conn.close();
            }
        }
    }
}
