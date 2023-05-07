package gdsldl.fl.file.processFlow;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriter_ {
//    使用BufferWriter将"Today is Monday."写入"d:\\monday.txt"
    public static void main(String[] args) throws Exception {
        String filePath = "d:\\monday.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));

        String m = "Today is Monday.";
        bufferedWriter.write(m,0,m.length());
//        关闭
        bufferedWriter.close();

    }
}
