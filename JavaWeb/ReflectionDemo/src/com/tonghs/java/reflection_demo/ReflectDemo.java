package com.tonghs.java.reflection_demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ReflectDemo class
 *
 * @author tonghs
 * @date 2021/06/28
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        // 1. Class.forName，多用于配置文件，将类名写到配置文件中
        Class cls = Class.forName("com.tonghs.java.reflection_demo.Person");

        String name1 = cls.getName();
        // com.tonghs.java.reflection_demo.Person 全类名
        System.out.println(name1);
//        System.out.println(cls);
//
//        // 2. 类名.class，多用于传参数
//        Class cls2 = Person.class;
//        System.out.println(cls2);
//
//        // 3. 对象.getClass()，多用于对象的获取字节码
//        Class cls3 = new Person().getClass();
//        System.out.println(cls3);
//
//        // true
//        System.out.println(cls == cls2);
//        // true
//        System.out.println(cls == cls3);

        // 获取所有 public 修饰的成员变量
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        Field gender = cls.getField("gender");
        System.out.println(gender);
        Person p = new Person();
        gender.set(p, "male");
        Object pv = gender.get(p);
        System.out.println(pv);

        // 获取所有成员变量
        Field[] declaredField = cls.getDeclaredFields();
        for (Field field : declaredField) {
            System.out.println(field);
        }

        Field name = cls.getDeclaredField("name");
        // 忽略权限修饰符的安全检查，暴力反射
        name.setAccessible(true);
        name.set(p, "hello");
        Object value = name.get(p);
        System.out.println(value);

        System.out.println("===============");
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        Constructor declaredConstructor = cls.getDeclaredConstructor();
        System.out.println(declaredConstructor);
        Object person1 = declaredConstructor.newInstance();
        System.out.println(person1);

        Constructor declaredConstructor1 = cls.getDeclaredConstructor(String.class, int.class);
        System.out.println(declaredConstructor1);
        Object person = declaredConstructor1.newInstance("zhangsan", 23);
        System.out.println(person);

        System.out.println("===============");

        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        Method eat = cls.getDeclaredMethod("eat");
        eat.invoke(p);

        Method eat1 = cls.getDeclaredMethod("eat", String.class);
        Object ret = eat1.invoke(p, "apple");
        System.out.println(ret);

        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getName());
        }
    }
}
