package com.tonghs.java.inet_address;

import java.io.IOException;
import java.net.*;

/**
 * UDPDemo class
 *
 * @author tonghs
 * @date 2021/06/26
 */
public class UDPSenderDemo {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();

            byte[] data = "hello".getBytes();
            ds.send(new DatagramPacket(data, data.length, InetAddress.getByName("127.0.0.1"), 10086));
            ds.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
