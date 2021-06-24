package com.tonghs.java.file_demo;

import java.io.*;

/**
 * BufferedOutputStreamDemo class
 *
 * @author tonghs
 * @date 2021/06/08
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        String fileName = "/Users/tonghs/Desktop/1.txt";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileName));
        bos.write("hello\nworld".getBytes());
        bos.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName));

//        int by;
//        while ((by = bis.read()) != -1) {
//            System.out.print((char) by);
//        }

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            System.out.println(new String(bys, 0, len));
        }

        bis.close();
    }
}
