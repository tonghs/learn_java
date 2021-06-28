package com.tonghs.java.tcp_demo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCPReceiverDemo class
 *
 * @author tonghs
 * @date 2021/06/26
 */
public class TCPReceiverDemo {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(10000);
            Socket s = ss.accept();
            InputStream is = s.getInputStream();

            byte[] bs = new byte[1024];
            int len = is.read(bs);
            System.out.println(new String(bs, 0, len));

            s.close();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
