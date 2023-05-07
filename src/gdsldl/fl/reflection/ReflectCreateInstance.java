package gdsldl.fl.reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class ReflectCreateInstance {
    @Test
    public void m1() throws Exception{
//        1. 先获取User类的Class对象
        String classFullPath = "gdsldl.fl.reflection.User";
        Class<?> cls = Class.forName(classFullPath);
//        2. 通过public的无参构造器创建实例
        User user = (User) cls.newInstance();
        System.out.println(user);
//        3. 通过public的有参构造器创建实例
//        3.1 先获取构造器
        Constructor<?> constructor = cls.getConstructor(String.class);
        /*
            constructor对象就是
             public User(String name) {
                   this.name = name;
               }
        */
//        3.2 再传入实参，创建实例
        Object li = constructor.newInstance("李四");
        System.out.println(li);
//        4. 通过非public的有参构造器创建实例
//        4.1 先获取私有构造器
        Constructor<?> constructor1 = cls.getDeclaredConstructor(int.class, String.class);
        constructor1.setAccessible(true);//暴力破解，使私有构造器/方法/属性可以被访问
        Object li2 = constructor1.newInstance(100, "李四");
        System.out.println(li2);
    }
}

class User{
    private int age = 10;
    private String name = "张三";

    public User() {//无参，共有
    }

    public User(String name) {
        this.name = name;
    }

    private User(int age, String name) {//有参，私有
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
