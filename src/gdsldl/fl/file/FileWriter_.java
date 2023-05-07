package gdsldl.fl.file;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileWriter_ {
//    将"Hello,world!"使用FileWriter写入d://hello.txt
    String filePath = "d://hello.txt";
    FileWriter fileWriter = null;
    @Test
    public void m1(){

        try {
            fileWriter = new FileWriter(filePath,true);
//            写入单个字符
            fileWriter.write('c');
//           写入字符数组
            char[] chars = {'a','b','c'};
            fileWriter.write(chars);
            fileWriter.write("123456789".toCharArray(),0,3);
            //写入字符串
            String s = "Hello,world!";
            fileWriter.write(s);
            fileWriter.write(s,0,3);

            System.out.println("文件写入成功...");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
//                fileWriter一定要关闭流或flush，否则文件没有内容
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
