package com.tonghs.java.file_demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * CopyUtil class
 *
 * @author tonghs
 * @date 2021/06/08
 */
public class CopyUtil {
    public static void main(String[] args) throws IOException {
        copyImg();
    }

    public static void copyImg() throws IOException {
        String inputImgFile = "/Users/tonghs/Desktop/1111.jpg";
        String outputImgFile = "/Users/tonghs/Desktop/2222.jpg";

        FileInputStream fis = new FileInputStream(inputImgFile);
        FileOutputStream fos = new FileOutputStream(outputImgFile);

        int len;
        int bufferSize = 1024 * 2;
        byte[] bys = new byte[bufferSize];

        while ((len = fis.read(bys)) != -1) {
            fos.write(bys);
        }

        fis.close();
        fos.close();
    }

    public static void copyFile() {
        String inputFileName = "/Users/tonghs/Dev/learn_java/FileDemo/src/com/tonghs/java/file_demo/fos.txt";
        String outputFileName = "/Users/tonghs/Dev/learn_java/FileDemo/src/com/tonghs/java/file_demo/fis.txt";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(inputFileName);
            fos = new FileOutputStream(outputFileName);

            int by;
            while ((by = fis.read()) != -1) {
                fos.write(by);
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

            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
