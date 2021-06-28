package com.tonghs.java.inet_address;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * inet_address class
 *
 * @author tonghs
 * @date 2021/06/26
 */
public class InetAddressDemo {
    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getByName("192.168.0.22");
            System.out.println(ia.getHostName());
            System.out.println(ia.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
