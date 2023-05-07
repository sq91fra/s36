package gdsldl.fl.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

//�ͻ���
public class TCPCharClient01 {
    public static void main(String[] args) throws Exception {
        //1.���ӷ�����
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        //2.�����Ϻ�����Socket���õ�Socket������������������
        OutputStream outputStream = socket.getOutputStream();
//        ת����,��outputStreamת�����ַ���
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        //3.ͨ���������д�����ݵ�����ͨ��
        bufferedWriter.write("Hello,this is client.");
        bufferedWriter.newLine();
        bufferedWriter.flush();//��Ҫ�ֶ�ˢ��
//        ������Ϣ����Ҫ�н������(����д��������)
//        socket.shutdownOutput();//����newLine,�Ͳ���ҪshutdownOutput������ֻ��ͨ��readLine��ȡ
        //4.  ͨ��socket��ȡ������(���ջط���Ϣ)
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//	4. ͨ������������ȡ��д�����ݵ�����ͨ��
        String s = bufferedReader.readLine();
        System.out.println(s);
        //5. �ر�����Socket����
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        System.out.println("�ͻ��˽�������...");
    }
}

