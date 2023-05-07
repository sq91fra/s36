package gdsldl.fl.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
//�ͻ���
public class TCPByteClient02 {
    public static void main(String[] args) throws Exception {
        //1.���ӷ�����
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        //2.�����Ϻ�����Socket���õ�Socket������������������
        OutputStream outputStream = socket.getOutputStream();
        //3.ͨ���������д�����ݵ�����ͨ��
        outputStream.write("Hello,this is client.".getBytes());
//        ������Ϣ����Ҫ�н������(����д��������)
        socket.shutdownOutput();
        //4.  ͨ��socket��ȡ������(���ջط���Ϣ)
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];//��������
        int readLen = 0;
        while((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf,0,readLen));
        }
        //5. �ر�����Socket����
        outputStream.close();
        inputStream.close();
        socket.close();
    }
}

