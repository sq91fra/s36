package gdsldl.fl.reflection;

import java.lang.reflect.Field;

public class ReflectAccessProperty {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
//       1. 得到Class类
        Class<?> cls = Class.forName("gdsldl.fl.reflection.Student");
//        2. 创建对象
        Object o = cls.newInstance();//o运行类型就是Student
//      3. 反射获取公有属性对象
        Field age = cls.getField("age");
        System.out.println(age.get(o));//直接获取属性
        age.set(o,88);
        System.out.println(o);
//      4. 使用反射获取私有属性
//        私有属性不能直接操作，需要先暴破
        Field name = cls.getDeclaredField("name");
        name.setAccessible(true);//对私有属性进行暴破
        name.set(null,"Mark");//私有属性，对象可以为null
        System.out.println(o);

    }
}

class Student{
    public int age = 6;
    private static String name = "Lily";

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +",name="+name+
                '}';
    }
}
