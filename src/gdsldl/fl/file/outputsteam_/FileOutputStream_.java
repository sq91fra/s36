package gdsldl.fl.file.outputsteam_;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {
//    在文件中写入信息，如果文件不存在，就先创建
    @Test
    public void write01() throws IOException {
        String filePath = "d:\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {
//            new FileOutputStream(filePath)会覆盖原来的文件
//            new FileOutputStream(filePath,true)不会覆盖原来的文件，会从文末追加
            fileOutputStream = new FileOutputStream(filePath);
            //写入一个字节
//            fileOutputStream.write('a');//char ->int
            //写入字符串
            String s = "Hello,world!";
//            s.getBytes()可以把字符串->字节数组
            fileOutputStream.write(s.getBytes());
            fileOutputStream.write(s.getBytes(),0,s.length());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            fileOutputStream.close();
        }
    }
}
