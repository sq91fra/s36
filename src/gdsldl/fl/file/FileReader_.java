package gdsldl.fl.file;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader_ {
    @Test
    public void m1() {
        String srcFilePath = "d:\\story.txt";
        FileReader fileReader = null;
        int data = 0;
//        创建fileReader对象
        try {
            fileReader = new FileReader(srcFilePath);
//            使用fileReader循环读取
//            单字符读取
            while ((data = fileReader.read()) != -1){
                System.out.print((char) data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void m2(){
        String filePath = "d:\\story.txt";
        FileReader fileReader = null;
        int readLen = 0;
        char[] buf = new char[64];
//        创建fileReader对象
        try {
            fileReader = new FileReader(filePath);
//            使用fileReader循环读取
//            字符数组读取
//            read(buf),返回实际读取到的字符数
            while ((readLen = fileReader.read(buf)) != -1){
                System.out.print(new String(buf,0,readLen));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
