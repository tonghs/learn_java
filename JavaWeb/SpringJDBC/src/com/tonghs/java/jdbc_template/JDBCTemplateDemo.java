package com.tonghs.java.jdbc_template;

import org.springframework.jdbc.core.JdbcTemplate;
import com.tonghs.java.conn_pool.JDBCUtil;

/**
 * JDBCTemplateDemo class
 *
 * @author tonghs
 * @date 2021/07/06
 */
public class JDBCTemplateDemo {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtil.getDataSourse());
        String sql = "update account set balance = 100 where name = ?";
        int count = template.update(sql, "wangwu");
        System.out.println(count);
    }
}
