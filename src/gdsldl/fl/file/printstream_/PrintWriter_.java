package gdsldl.fl.file.printstream_;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter("d:\\printWriter.txt"));
        printWriter.print("你好，世界");
        printWriter.close();// close 等于 close+flush
//        不只是输出到文件，就算是打印到控制台也是要 flush 刷新一下
    }
}
