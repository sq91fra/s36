package gdsldl.fl.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
//客户端
public class TCPByteClient02 {
    public static void main(String[] args) throws Exception {
        //1.连接服务器
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        //2.连接上后，生成Socket，得到Socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //3.通过输出流，写入数据到数据通道
        outputStream.write("Hello,this is client.".getBytes());
//        发送信息后，需要有结束标记(设置写入结束标记)
        socket.shutdownOutput();
        //4.  通过socket获取输如流(接收回发信息)
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];//建立缓冲
        int readLen = 0;
        while((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf,0,readLen));
        }
        //5. 关闭流和Socket对象
        outputStream.close();
        inputStream.close();
        socket.close();
    }
}

