package gdsldl.fl.file.transformation;

import java.io.*;

public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
//        将字节流包装成InputStreamReader，按照特定编码读取
    String filePath = "d:\\hello.txt";

        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath),"gbk");
        BufferedReader br = new BufferedReader(isr);

        String s = br.readLine();
        System.out.println(s);

    }
}
