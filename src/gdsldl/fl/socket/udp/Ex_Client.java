package gdsldl.fl.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Ex_Client {
    public static void main(String[] args) throws IOException {
        String serverHostname = "localhost";
        int serverPort = 8888;

        DatagramSocket socket = new DatagramSocket();

        byte[] sendData = "�й��Ĵ���������Щ?".getBytes();//��������
//        ������Ϣ
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, InetAddress.getByName(serverHostname), serverPort);
        socket.send(sendPacket);

        byte[] receiveData = new byte[1024];
        //      ������Ϣ
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        socket.receive(receivePacket);
        String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("Server response: " + response);

        socket.close();
    }
}
