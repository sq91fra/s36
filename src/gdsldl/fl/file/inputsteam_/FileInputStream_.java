package gdsldl.fl.file.inputsteam_;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

//FileInputStream的使用(直接输入流 文件-->程序)
public class FileInputStream_ {
//    读取文件
//    单个字节的读取，效率较低
    @Test
    public void read01() throws IOException {
        String filePath = "d:\\hello.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream(filePath);
            while ((readData = fileInputStream.read())!= -1){
                System.out.print((char)readData);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            fileInputStream.close();
        }
    }

//    使用read(byte[] b)进行读取
@Test
public void read02() throws IOException {
    String filePath = "d:\\hello.txt";
    int readLen = 0;
    byte[] buf = new byte[8];
    FileInputStream fileInputStream = null;
    try{
        fileInputStream = new FileInputStream(filePath);
//如果返回-1，表示读取完毕；如果读取正常，返回实际读取字节数
        while ((readLen = fileInputStream.read(buf))!= -1){
            System.out.print(new String(buf,0,readLen));
        }
    }catch (IOException e){
        e.printStackTrace();
    }finally {
        fileInputStream.close();
    }
}
}
