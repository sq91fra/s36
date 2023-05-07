package gdsldl.fl.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectAccessMethod {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("gdsldl.fl.reflection.Boss");
        Object o = cls.newInstance();
//        获取公有方法
        Method hi = cls.getMethod("hi",String.class);
        hi.invoke(o,"world");
//        获取私有方法
        Method say = cls.getDeclaredMethod("say", int.class, String.class, char.class);
        say.setAccessible(true);//暴破
        System.out.println(say.invoke(null,1,"day",'i'));
//      反射返回值为Object,运行类型是String
        Object returnValue = say.invoke(null, 6, "ww", 'm');

    }
}

class Boss{
    public int age;
    private static String name;

    public Boss() {
    }

    private static String say(int n, String s, char c){
        return n +" "+ s + " "+ c;
    }

    public void hi(String s){
        System.out.println("hi,"+s);
    }
}
