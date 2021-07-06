package com.tonghs.java.test;

import com.tonghs.java.junit_demo.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * CalculatorTest class
 *
 * @author tonghs
 * @date 2021/06/28
 */
public class CalculatorTest {
    Calculator cal;

    @Before
    public void init() {
        cal = new Calculator();
    }

    @After
    public void close() {
        System.out.println("done");
    }

    @Test
    public void testAdd() {
        int ret = cal.add(1, 2);
        Assert.assertEquals(ret, 3);
    }

    @Test
    public void testSub() {
        int ret = cal.sub(1, 2);
        Assert.assertEquals(ret, -1);
    }
}
