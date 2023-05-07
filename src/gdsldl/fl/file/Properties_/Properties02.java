package gdsldl.fl.file.Properties_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) throws IOException {
//        使用Properties读取配置文件
        Properties properties = new Properties();
//        加载
        properties.load(new FileReader("src\\mysql.properties"));
//        显示
        properties.list(System.out);
//        根据key获取
        String user = properties.getProperty("user");
        System.out.println("用户名："+user);

    }
}
