package gdsldl.fl.socket.udp;

import java.io.*;
import java.net.*;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        int serverPort = 12345;

        DatagramSocket socket = new DatagramSocket(serverPort);
        System.out.println("Server listening on port " + serverPort);

        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        socket.receive(receivePacket);
        String request = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("Client request: " + request);

        byte[] sendData = "Hello, client!".getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receivePacket.getAddress(), receivePacket.getPort());
        socket.send(sendPacket);

        socket.close();
    }
}