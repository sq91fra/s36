package gdsldl.fl.reflection;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflection01 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();

//        反射机制解决
//        1. 加载类，返回Class类型的对象
        Class aClass = Class.forName(classfullpath);
//        2. 通过aClass得到你加载的类的对象实例
        Object o = aClass.newInstance();
        System.out.println(o.getClass());//看看o的运行类型：Cat
//         3. 通过aClass得到你加载的类的对象方法
        System.out.println("-------");
        Method method1 = aClass.getMethod(method);
//        通过method1调用方法
        // 反射机制: 方法.invoke(对象)
        //        调用的方法必须是public的
        method1.invoke(o);
        System.out.println("-------");

//        通过加载的类的对象实例aClass得到属性ageField
        //      必须是public的
        Field ageField = aClass.getField("age");
//        反射机制: 属性.get(对象)
        System.out.println(ageField.get(o));
        System.out.println("-------");
//        通过加载的类的对象实例aClass得到无参构造器
        Constructor constructor1 = aClass.getConstructor();
        System.out.println(constructor1);
//        通过加载的类的对象实例aClass得到有参构造器
        Constructor constructor2 = aClass.getConstructor(String.class,int.class);
//传入String类的Class对象和int的Class对象
        System.out.println(constructor2);
    }
}
