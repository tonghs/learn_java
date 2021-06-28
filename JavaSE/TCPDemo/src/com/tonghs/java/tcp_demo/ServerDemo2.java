package com.tonghs.java.tcp_demo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ServerDemo2 class
 *
 * @author tonghs
 * @date 2021/06/26
 */
public class ServerDemo2 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(10086);
            Socket s = ss.accept();

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String line;

            BufferedWriter fbw = new BufferedWriter(new FileWriter("msg.txt"));
            while ((line = br.readLine()) != null) {
                // print msg
                System.out.println(line);

                // write msg to file
                fbw.write(line);
                fbw.newLine();
                fbw.flush();
            }
            fbw.close();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
