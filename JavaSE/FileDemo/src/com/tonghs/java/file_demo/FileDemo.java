package com.tonghs.java.file_demo;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileDemo class
 *
 * @author tonghs
 * @date 2021/06/03
 */
public class FileDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/Users/tonghs/Dev/learn_java/FileDemo/src/com/tonghs/java/file_demo/fos.txt");
            int by = 0;
            while((by = fis.read()) != -1) {
                System.out.print((char)by);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
