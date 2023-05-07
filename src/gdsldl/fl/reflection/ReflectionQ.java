package gdsldl.fl.reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectionQ {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();

        System.out.println("classfullpath = "+ classfullpath);//com.fl.Cat
        System.out.println("method = "+ method);//hi
//        没有反射机制，java就不是动态语言
//        反射机制是框架的灵魂，是底层机制的基石

//        反射机制解决
//        1. 加载类，返回Class类型的对象
        Class aClass = Class.forName(classfullpath);
//        2. 通过aClass得到你加载的类的对象实例
        Object o = aClass.newInstance();
        System.out.println(o.getClass());//看看o的运行类型：Cat
//         3. 通过aClass得到你加载的类的对象方法
        Method method1 = aClass.getMethod(method);
//        通过method1调用方法
        System.out.println("-------");
        method1.invoke(o);
//传统方法： 对象.方法()
// 反射机制: 方法.invoke(对象)
//        调用的方法必须是public的

    }
}
