package gdsldl.fl.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//�����(�ַ���)
public class TCPCharServer01 {
    public static void main(String[] args) throws IOException {
//	1. �ڱ��� 9999 �˿ڽ������ȴ�����
//	9999�˿���Ҫû�����������ڼ���!
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("��������9999�������ȴ�����...");
//	2. ��û�пͻ������ӣ����������
//	����У��ͻ᷵��һ��socket����
        Socket socket = serverSocket.accept();
//	3.ͨ��socket��ȡ������(������Ϣ)
        InputStream inputStream = socket.getInputStream();
//        ת�����ַ���
//	4. ͨ������������ȡ��д�����ݵ�����ͨ��
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);
//   5. ͨ��socket��ȡ�����(�ط���Ϣ)
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("Hello,this is server.");
        bufferedWriter.newLine();
        bufferedWriter.flush();
//        socket.shutdownOutput();
//	5. �ر�����socket
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
        System.out.println("����˽�������...");
    }
}
