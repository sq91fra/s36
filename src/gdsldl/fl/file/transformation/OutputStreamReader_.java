package gdsldl.fl.file.transformation;

import java.io.*;

public class OutputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\hello.txt";
        String charSet = "utf-8";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), charSet);
        osw.write("张三是法外狂徒");
        osw.close();
        System.out.println("按照"+charSet+"保存文件成功...");

    }
}
