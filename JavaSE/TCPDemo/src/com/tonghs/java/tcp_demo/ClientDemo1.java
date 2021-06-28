package com.tonghs.java.tcp_demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * ClientDemo1 class
 *
 * @author tonghs
 * @date 2021/06/26
 */
public class ClientDemo1 {
    public static void main(String[] args) {
        // client
        Socket s = null;
        try {
            s = new Socket("127.0.0.1", 10086);
            OutputStream os = s.getOutputStream();
            os.write("hello world".getBytes());

            InputStream is = s.getInputStream();
            byte[] bys = new byte[1024];
            int len = is.read(bys);
            String data = new String(bys, 0, len);

            System.out.println("服务器反馈：" + data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
