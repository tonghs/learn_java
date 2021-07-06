package com.tonghs.java.conn_pool;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Properties;

/**
 * DruidConnPoolDemo class
 *
 * @author tonghs
 * @date 2021/07/06
 */
public class DruidConnPoolDemo {
    public static void main(String[] args) throws Exception {
        Properties pro = new Properties();
        ClassLoader cl = DruidConnPoolDemo.class.getClassLoader();
        pro.load(cl.getResourceAsStream("druid.properties"));
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
