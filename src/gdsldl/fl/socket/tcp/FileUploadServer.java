package gdsldl.fl.socket.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileUploadServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("��������9999�������ȴ�����...");
        //����ͼƬ
        Socket socket = serverSocket.accept();
//        ��ȡ������
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
//        ��ȡ������ͼƬ
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        String destPath = "d:\\save1.gif";
//        ���������
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath));
        bos.write(bytes);
        bos.close();//�ر�������
//        ͨ�������������Ϣ"�յ�ͼƬ"
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("���յ�ͼƬ...".getBytes());
        socket.shutdownOutput();//����������Ϣ����
//        �ر�����socket
        serverSocket.close();
        socket.close();
        bis.close();
        outputStream.close();
    }
}
