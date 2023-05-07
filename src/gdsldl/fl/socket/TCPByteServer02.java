package gdsldl.fl.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//�����
public class TCPByteServer02 {
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
//	4. ͨ������������ȡ��д�����ݵ�����ͨ��
        byte[] buf = new byte[1024];//��������
        int readLen = 0;
        while((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf,0,readLen));
        }
//   5. ͨ��socket��ȡ�����(�ط���Ϣ)
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Hello,this is server.".getBytes());
        socket.shutdownOutput();
//	5. �ر�����socket
        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();
    }
}
