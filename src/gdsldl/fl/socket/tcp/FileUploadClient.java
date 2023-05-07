package gdsldl.fl.socket.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class FileUploadClient {
    public static void main(String[] args) throws Exception {
        //1.���ӷ�����
        Socket socket = new Socket(InetAddress.getLocalHost(),8888);
        //2. ��ȡ(��ȡ���ַ�����)�����ϵ�ͼƬ,��ͼƬת��Ϊ�ַ�����
        String filePath = "d:\\save.gif";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
//        3. ʹ��StreamUtils���streamToByteArray(InputStream is)����ͼƬת��Ϊ����
        byte[] bytes = StreamUtils.streamToByteArray(bis);
//        ���������
        BufferedOutputStream bos = new BufferedOutputStream (socket.getOutputStream());
        bos.write(bytes);
        socket.shutdownOutput();//������Ϣ����
        bis.close();//�ر�������
//      ͨ��������������Ϣ
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1){
            System.out.println(new String(buf,0,readLen));
        }

//      �ر���
        socket.close();
        bos.close();
        inputStream.close();

    }
}
