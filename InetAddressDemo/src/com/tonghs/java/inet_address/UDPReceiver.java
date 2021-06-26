package com.tonghs.java.inet_address;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * UDPReceiver class
 *
 * @author tonghs
 * @date 2021/06/26
 */
public class UDPReceiver {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(10086);

            byte[] data = new byte[1024];
            DatagramPacket dp = new DatagramPacket(data, data.length);
            ds.receive(dp);

            String datas = new String(dp.getData(), 0, dp.getLength());
            System.out.println("数据是：" + datas);

            ds.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
