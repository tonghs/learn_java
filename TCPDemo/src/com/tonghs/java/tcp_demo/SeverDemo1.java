package com.tonghs.java.tcp_demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * SeverDemo1 class
 *
 * @author tonghs
 * @date 2021/06/26
 */
public class SeverDemo1 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(10086);
            Socket s = ss.accept();
            InputStream is = s.getInputStream();

            byte[] bys = new byte[1024];
            int len = is.read(bys);
            System.out.println("服务器收到：" + new String(bys, 0, len));

            // 反馈
            OutputStream os = s.getOutputStream();
            os.write("收到反馈".getBytes());

            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
