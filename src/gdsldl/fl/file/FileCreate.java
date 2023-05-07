package gdsldl.fl.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
//        在d盘下，用三种不同方式创建文件news1.txt,news2.txt,news3.txt

    }
    //1. 根据路径创建一个File对象
    @Test
    public void create01()  {
        String fullPath = "d:\\news1.txt";
        File file1 = new File(fullPath);
        try {
            file1.createNewFile();
            System.out.println("news1.txt创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //2. 根据父目录文件+子路径构建
    @Test
    public void create02(){
        File parent = new File("d:\\");
        String fileName = "news2.txt";
        File file2 = new File(parent, fileName);
        try {
            file2.createNewFile();
//            只有执行了createNewFile，才会真正的在磁盘中创建文件
            System.out.println("news2.txt创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //3. 根据父目录+子路径构建
    @Test
    public void create03(){
        String parentPath = "d:\\";//"d:/"也可
        String filePath = "news3.txt";
        File file3 = new File(parentPath, filePath);
        try {
            file3.createNewFile();
            System.out.println("news3.txt创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
