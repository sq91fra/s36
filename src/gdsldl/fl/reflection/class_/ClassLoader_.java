package gdsldl.fl.reflection.class_;

import gdsldl.fl.enumeration.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassLoader_ {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你的操作：");
        int key = sc.nextInt();
        switch (key){
            case 1://静态加载
//                PerSon p = new Person();
//                p.hi();
                break;
            case 2:
                Class<?> cls = Class.forName("Person");
                Object o = cls.newInstance();
                Method method = cls.getMethod("hi");
                method.invoke(o);
                break;
            default:
                System.out.println("...");

//因为new Dog(）是静态加载，因此必须存在Person
//Person类是动态加载，所以，没有存在Person类也不会报
        }
    }
}
