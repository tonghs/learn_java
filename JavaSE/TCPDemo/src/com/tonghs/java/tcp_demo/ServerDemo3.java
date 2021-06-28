package com.tonghs.java.tcp_demo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ServerDemo3 class
 *
 * @author tonghs
 * @date 2021/06/26
 */
public class ServerDemo3 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);

        while (true) {
            Socket s = ss.accept();
            new Thread(new ServerThread(s)).start();
        }
    }
}
