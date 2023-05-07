package gdsldl.fl.socket.udp;

import java.io.*;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        String serverHostname = "localhost";
        int serverPort = 12345;

        DatagramSocket socket = new DatagramSocket();

        byte[] sendData = "Hello, server!".getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, InetAddress.getByName(serverHostname), serverPort);
        socket.send(sendPacket);

        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        socket.receive(receivePacket);
        String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("Server response: " + response);

        socket.close();
    }
}
