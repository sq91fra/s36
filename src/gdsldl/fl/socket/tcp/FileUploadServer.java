package gdsldl.fl.socket.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileUploadServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务器在9999监听，等待连接...");
        //接收图片
        Socket socket = serverSocket.accept();
//        获取输入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
//        读取并保存图片
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        String destPath = "d:\\save1.gif";
//        创建输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath));
        bos.write(bytes);
        bos.close();//关闭无用流
//        通过输出流发送信息"收到图片"
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("已收到图片...".getBytes());
        socket.shutdownOutput();//表明发送信息结束
//        关闭流和socket
        serverSocket.close();
        socket.close();
        bis.close();
        outputStream.close();
    }
}
