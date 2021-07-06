package com.tonghs.java.jdbc_template;

import com.tonghs.java.conn_pool.JDBCUtil;
import com.tonghs.java.jdbc_template.model.Account;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * JDBCTemplateSample class
 *
 * @author tonghs
 * @date 2021/07/06
 */
public class JDBCTemplateSample {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtil.getDataSourse());
    /**
     * update
     */
    @Test
    public void test1() {
        int count = template.update("update account set balance = ? where name = ?", 200, "wangwu");
        Assert.assertEquals(count, 1);
    }

    /**
     * add
     */
    @Test
    public void test2() {
        int count = template.update("insert into account values(null, ?, ?)", "maliu", 300);
        Assert.assertEquals(count, 1);
    }

    /**
     * delete
     */
    @Test
    public void test3() {
        int count = template.update("delete from account where name = ?", "maliu");
        Assert.assertEquals(count, 1);
    }

    /**
     * get one
     */
    @Test
    public void test4() {
        String sql = "select * from account where id = ?";
        Map<String, Object> account = template.queryForMap(sql, 1);
        System.out.println(account);
    }

    /**
     * query list
     */
    @Test
    public void test5() {
        String sql = "select * from account";
        List<Map<String, Object>> objs = template.queryForList(sql);
//        System.out.println(objs);
        for (Map<String, Object> obj : objs) {
            System.out.println(obj);
        }
    }

    /**
     * query result to model
     */
    @Test
    public void test6() {
        List<Account> accounts = template.query("select * from account", new RowMapper<Account>() {

            @Override
            public Account mapRow(ResultSet rs, int i) throws SQLException {
                Account account = new Account();
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double balance = rs.getDouble("balance");
                account.setId(id);
                account.setName(name);
                account.setBalance(balance);

                return account;
            }
        });

        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    /**
     * query to model
     */
    @Test
    public void test7() {
        List<Account> accounts = template.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    /**
     * get record count
     */
    @Test
    public void test8() {
        Long cnt = template.queryForObject("select count(0) from account", Long.class);
        System.out.println(cnt);
    }
}
