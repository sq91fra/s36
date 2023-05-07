package gdsldl.fl.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

//客户端
public class TCPCharClient01 {
    public static void main(String[] args) throws Exception {
        //1.连接服务器
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        //2.连接上后，生成Socket，得到Socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
//        转换流,将outputStream转换成字符流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        //3.通过输出流，写入数据到数据通道
        bufferedWriter.write("Hello,this is client.");
        bufferedWriter.newLine();
        bufferedWriter.flush();//需要手动刷新
//        发送信息后，需要有结束标记(设置写入结束标记)
//        socket.shutdownOutput();//有了newLine,就不需要shutdownOutput，但是只能通过readLine读取
        //4.  通过socket获取输如流(接收回发信息)
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//	4. 通过输入流，读取并写入数据到数据通道
        String s = bufferedReader.readLine();
        System.out.println(s);
        //5. 关闭流和Socket对象
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        System.out.println("客户端结束运行...");
    }
}

