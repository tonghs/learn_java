package com.tonghs.java.file_demo;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * BatchReadFile class
 *
 * @author tonghs
 * @date 2021/06/08
 */
public class BatchReadFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/tonghs/Dev/learn_java/FileDemo/src/com/tonghs/java/file_demo/fos.txt");
//        byte[] bys = new byte[100];
//        int len = fis.read(bys);
//        System.out.println(len);
//        System.out.println(new String(bys, 0, len));
        int bufferSize = 1024;
        byte[] bys = new byte[bufferSize];
        int len;

        while ((len = fis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }


        fis.close();
    }
}
