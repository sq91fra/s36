package gdsldl.fl.socket.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

//编写一个TCP编程
// 当客户端提问name,回答"KUN"；当提问hobby，回答"sing,jump,rap"
//拓展：聊天系统
public class Ex1_Client {
    public static void main(String[] args) throws IOException {
//获取客户端的socket
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
//        发送信息（字符输出流）
        OutputStream outputStream = socket.getOutputStream();//可以用Buffered包装类，但是需要flush，newLine
        System.out.print("quest to server:");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        outputStream.write(s.getBytes());
//        提示输出结束
        socket.shutdownOutput();//表明发送信息结束
//        接收回发信息(字符输入流)
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String readLine = bufferedReader.readLine();
        System.out.println(readLine);

//        关闭流和socket
        socket.close();
        sc.close();
        outputStream.close();
        bufferedReader.close();
    }
}
