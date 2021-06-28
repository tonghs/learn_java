package com.tonghs.java.tcp_demo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * TCPDemo class
 *
 * @author tonghs
 * @date 2021/06/26
 */
public class TCPSenderDemo {
    public static void main(String[] args) {
        try {
//            Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 10000);
            Socket s = new Socket("127.0.0.1", 10000);

            OutputStream os = s.getOutputStream();
            os.write("hello".getBytes());

            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
