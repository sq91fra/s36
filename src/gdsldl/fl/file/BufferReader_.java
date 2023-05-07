package gdsldl.fl.file;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader_ {
    public static void main(String[] args) throws Exception {
        String filePath = "d:\\story.txt";
//        create
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
//        读取
        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.print(line);
        }

//        关闭
        bufferedReader.close();
    }
}
