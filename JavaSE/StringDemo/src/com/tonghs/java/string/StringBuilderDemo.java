package com.tonghs.java.string;

/**
 * com.tonghs.java.string.StringBuilderDemo class
 *
 * @author tonghs
 * @date 2021/05/29
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("sb: " + sb);
        System.out.println("sb length: " + sb.length());

        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println("sb2: " + sb2);

        sb2.append("world");
        System.out.println("sb2: " + sb2);

        System.out.println("sb2 reverse: " + sb2.reverse());

        // StringBuilder to String
        String str = sb.toString();
    }
}
