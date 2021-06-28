package com.tonghs.java.tcp_demo;

import java.io.*;
import java.net.Socket;

/**
 * ClientDemo3 class
 *
 * @author tonghs
 * @date 2021/06/26
 */
public class ClientDemo3 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 10086);

        //从文件中读取数据
        BufferedReader br = new BufferedReader(new FileReader("client_msg.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        // 这里有解释：https://blog.csdn.net/weixin_44021343/article/details/96482524
        s.shutdownOutput();

        // 接收反馈
        BufferedReader sbr = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String resp = sbr.readLine();
        System.out.println("服务器返回：" + resp);

        br.close();
        s.close();
    }
}
