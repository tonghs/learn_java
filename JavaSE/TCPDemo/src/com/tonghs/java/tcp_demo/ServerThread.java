package com.tonghs.java.tcp_demo;

import java.io.*;
import java.net.Socket;

/**
 * ServerThread class
 *
 * @author tonghs
 * @date 2021/06/26
 */
public class ServerThread implements Runnable {
    private Socket s;
    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(this.s.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new FileWriter("server_msg" + Thread.currentThread().getName() + ".txt"));

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            // 给出反馈
            BufferedWriter rbw = new BufferedWriter(new OutputStreamWriter(this.s.getOutputStream()));
            rbw.write("ok，文件上传");
            rbw.newLine();
            rbw.flush();

            s.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
