package gdsldl.fl.file;

import org.junit.Test;

import java.io.File;

public class FileInformation {
    @Test
    public void info(){
//        先创建文件对象
        File file = new File("d:/news1.txt");

        System.out.println("The file name is "+file.getName());
        System.out.println("AbsolutePath is "+file.getAbsolutePath());
        System.out.println("ParentPath is "+file.getParent());
        System.out.println("File size(bit) is "+ file.length());
        System.out.println("Exists or not:"+file.exists());
        System.out.println("Is File :"+file.isFile());
        System.out.println("Is Directory :"+ file.isDirectory());


    }
}
