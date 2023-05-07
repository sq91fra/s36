package gdsldl.fl.file.printstream_;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
//        PrintStream默认输出位置是显示器
//        可以修改输出位置
        out.print("Hello world");
        System.out.println();
//        print底层使用write，也可以直接调用write
        out.write("apple".getBytes());

        out.close();
        //        修改打印位置
        System.setOut(new PrintStream("d:\\hello.txt"));//修改了输出位置
        System.out.println("Hello world");
    }
}
