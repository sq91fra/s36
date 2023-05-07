package gdsldl.fl.file;

import org.junit.Test;

import java.io.File;

public class Directory_ {
//    删除d:\news1.txt
    @Test
    public void m1(){
        String filePath = "d:\\news1.txt";
        File file = new File(filePath);
        if (file.exists()){
            if (file.delete()){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("该文件不存在...");
        }
    }

//判断d:\demo02是否存在，存在就删除
//    在java中，目录也被当做文件
@Test
public void m2(){
    String filePath = "d:\\demo02";
    File file = new File(filePath);
    if (file.exists()){
        if (file.delete()){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }else {
        System.out.println("该目录不存在...");
    }
}

//判断d:\\demo\\a\\b\\c 目录是否存在，不存在就创建
    @Test
    public void m3(){
        String filepath = "d:\\demo\\a\\b\\c";
        File file = new File(filepath);
        if (file.exists()){
            System.out.println(filepath+"已存在...");
        }else{
            if (file.mkdirs()){
                System.out.println(filepath+"创建成功...");
            }else {
                System.out.println(filepath+"创建失败...");
            }
        }
    }
}
