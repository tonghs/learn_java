package com.tonghs.java.tcp_demo;

import java.io.*;
import java.net.Socket;

/**
 * ClientDemo2 class
 *
 * @author tonghs
 * @date 2021/06/26
 */
public class ClientDemo2 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1", 10086);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.equals("886")) {
                    break;
                }

//                OutputStream os = s.getOutputStream();
//                os.write(line.getBytes());
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
