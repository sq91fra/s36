package gdsldl.fl.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;

public class Ex_Server {
    public static void main(String[] args) throws IOException {
        int serverPort = 8888;

        DatagramSocket socket = new DatagramSocket(serverPort);
        System.out.println("Server listening on port " + serverPort);

        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        socket.receive(receivePacket);
        String request = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("Client request: " + request);
        byte[] sendData = "".getBytes();
        if (request.equals("中国四大名著是那些?")){
            sendData = "《红楼梦》《水浒传》《西游记》《三国演义》".getBytes();
        }else {
            sendData = "What?".getBytes();
        }

        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receivePacket.getAddress(), receivePacket.getPort());
        socket.send(sendPacket);

        socket.close();
    }
}