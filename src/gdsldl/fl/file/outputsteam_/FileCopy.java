package gdsldl.fl.file.outputsteam_;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//将d:\\save.gif 拷贝到 c:\\
public class FileCopy {
    @Test
    public void copy() {
//        1. 创建文件输入流，将文件读入程序
//        2. 创建文件输出流，将读取到的文件数据，写入到指定位置

        String srcFilePath = "d:\\save.gif";
        String destFilePath = "d:\\save2.gif";
        FileInputStream fileInputStream = null;
        FileOutputStream outputStream = null;

        try {
            fileInputStream = new FileInputStream(srcFilePath);
            outputStream = new FileOutputStream(destFilePath);

//        定义字节数组提高读取速度
            byte[] buf = new byte[1024];
            int readLen = 0;
                while ((readLen = fileInputStream.read(buf)) != -1) {
//                边读边写
                    outputStream.write(buf, 0, readLen);//write(buf)会出现文件损失
                }
                System.out.println("拷贝成功...");
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
            try {
                if (fileInputStream !=null){
                    fileInputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
