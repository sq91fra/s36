package gdsldl.fl.file.outputsteam_;

import java.io.*;

public class BufferedCopy02 {
    public static void main(String[] args) {
//        拷贝二进制文件
        String srcPath = "d:\\save.gif";
        String destPath = "d:\\save2.gif";
//声明流
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream(srcPath));
            bos = new BufferedOutputStream(new FileOutputStream(destPath));

//            建立缓冲
            byte[] buff = new byte[1024];
            int readLen = 0;
//当返回-1，表示文件读取完毕
            while ((readLen = bis.read(buff)) != -1){
                bos.write(buff,0,readLen);
            }
            System.out.println("copy success");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
//            关闭流
            try {
                if (bos != null) bos.close();
                if (bis != null) bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
