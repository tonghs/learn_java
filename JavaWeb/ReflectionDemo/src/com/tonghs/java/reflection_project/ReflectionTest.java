package com.tonghs.java.reflection_project;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * ReflectionTest class
 *
 * @author tonghs
 * @date 2021/06/28
 */
public class ReflectionTest {
    public static void main(String[] args) throws Exception {
        // 执行任意类的任意方法
        // 家在配置文件
        Properties pro = new Properties();

        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("pro.properties");
        pro.load(resourceAsStream);

        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        Class cls = Class.forName(className);
        Object obj = cls.getConstructor().newInstance();

        Method method = cls.getMethod(methodName);
        method.invoke(obj);
    }
}
