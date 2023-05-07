package gdsldl.fl.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//服务端(字符流)
public class TCPCharServer01 {
    public static void main(String[] args) throws IOException {
//	1. 在本机 9999 端口接听，等待连接
//	9999端口需要没有其他服务在监听!
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器在9999监听，等待连接...");
//	2. 当没有客户端链接，程序会阻塞
//	如果有，就会返回一个socket对象
        Socket socket = serverSocket.accept();
//	3.通过socket获取输入流(接收信息)
        InputStream inputStream = socket.getInputStream();
//        转换成字符流
//	4. 通过输入流，读取并写入数据到数据通道
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);
//   5. 通过socket获取输出流(回发信息)
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("Hello,this is server.");
        bufferedWriter.newLine();
        bufferedWriter.flush();
//        socket.shutdownOutput();
//	5. 关闭流和socket
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端结束运行...");
    }
}
