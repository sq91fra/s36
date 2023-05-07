package gdsldl.fl.socket.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex1_Server {
    public static void main(String[] args) throws IOException {
        System.out.println("Server listening at point 8888...");
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
//接收信息(字符输入流)
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = bufferedReader.readLine();
        System.out.println("receive quest from client:"+s);
//        根据接收到的信息回答(字符输出流)
        OutputStream outputStream = socket.getOutputStream();
        switch (s){
            case "name":
                outputStream.write("KUN".getBytes());
                break;
            case "hobby":
                outputStream.write("sing,jump,rap".getBytes());
                break;
            default:
                outputStream.write("I don't know what you say.".getBytes());
                break;

        }
        socket.shutdownOutput();
//        关闭流和资源
        serverSocket.close();
        socket.close();
        bufferedReader.close();
    }
}
