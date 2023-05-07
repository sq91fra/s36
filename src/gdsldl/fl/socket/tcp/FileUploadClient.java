package gdsldl.fl.socket.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class FileUploadClient {
    public static void main(String[] args) throws Exception {
        //1.连接服务器
        Socket socket = new Socket(InetAddress.getLocalHost(),8888);
        //2. 获取(读取，字符输入)磁盘上的图片,将图片转换为字符数组
        String filePath = "d:\\save.gif";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
//        3. 使用StreamUtils类的streamToByteArray(InputStream is)，将图片转换为数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);
//        创建输出流
        BufferedOutputStream bos = new BufferedOutputStream (socket.getOutputStream());
        bos.write(bytes);
        socket.shutdownOutput();//发送信息结束
        bis.close();//关闭无用流
//      通过输入流接收信息
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1){
            System.out.println(new String(buf,0,readLen));
        }

//      关闭流
        socket.close();
        bos.close();
        inputStream.close();

    }
}
