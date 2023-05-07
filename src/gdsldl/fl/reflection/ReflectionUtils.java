package gdsldl.fl.reflection;

import org.junit.Test;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtils {

    @Test
    public void api_01() throws ClassNotFoundException {
        Class<?> personCls = Class.forName("gdsldl.fl.reflection.Person");
//        getName：获取全类名
        System.out.println(personCls.getName());
//        getSimpleName:获取简单类名
        System.out.println(personCls.getSimpleName());
        System.out.println("------");
//        getFields：获取所有public修饰的属性，包含本类以及父类的
        Field[] fields1 = personCls.getFields();
        for (Field field :fields1) {
            System.out.println("属性："+field.getName());
        }
        System.out.println("------");
//        getDeclaredFields:获取本类中所有属性
        Field[] fields2 = personCls.getDeclaredFields();
        for (Field field :fields2) {
            System.out.println("属性："+field.getName());
        }
        System.out.println("------");
//        getMethods:获取所有public"的方法，包含本类以及父类的
        Method[] methods1 = personCls.getMethods();
        for (Method method :methods1) {
            System.out.println("方法："+method.getName());
        }
        System.out.println("------");
//        getDeclaredMethods:获取本类中所有方法
        Method[] methods2 = personCls.getDeclaredMethods();
        for (Method method :methods2) {
            System.out.println("方法："+method.getName());
        }
        System.out.println("------");
//        getConstructors:获取所有pub修饰的构造器，包含本类以及父类的
        Constructor<?>[] constructors1 = personCls.getConstructors();
        for (Constructor constructor :constructors1) {
            System.out.println("构造器"+constructor.getName());
        }
        System.out.println("------");
//        getDeclaredConstructors:获取本类中所有构造器
        Constructor<?>[] constructors2 = personCls.getDeclaredConstructors();
        for (Constructor constructor :constructors2) {
            System.out.println("构造器"+constructor.getName());
        }
//        getPackage:以Package形式返回包信息
        System.out.println(personCls.getPackage());
        System.out.println("------");
        Class<?>[] interfaces = personCls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("接口信息="+anInterface);
        }
        System.out.println("------");
//        getAnnotations:以Annotation[]形式返回注解信息
        AnnotatedType[] annotatedInterfaces = personCls.getAnnotatedInterfaces();
        for (AnnotatedType annotatedInterface : annotatedInterfaces) {
            System.out.println("注解信息="+annotatedInterface);
        }
    }

    @Test
    public void api_02() throws ClassNotFoundException {
        Class<?> personCls = Class.forName("gdsldl.fl.reflection.Person");
        //        getDeclaredFields:获取本类中所有属性
        Field[] fields2 = personCls.getDeclaredFields();
        for (Field field :fields2) {
            System.out.println("属性:"+field.getName()
                    +",该属性的修饰符:"+field.getModifiers()
                    +",该属性的类型:"+field.getType());
        }
    }

    @Test
    public void api_03() throws ClassNotFoundException {
        Class<?> personCls = Class.forName("gdsldl.fl.reflection.Person");
//        getDeclaredMethods:获取本类中所有方法
        Method[] methods2 = personCls.getDeclaredMethods();
        for (Method method :methods2) {
            System.out.println("属性:"+method.getName()
                    +",该属性的修饰符:"+method.getModifiers()
                    +",该属性的返回类型:"+method.getReturnType());
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该属性的参数类型:" +parameterType);
            }

        }
    }
}

class Person implements IA,IB{
    public String name;
    protected int age;
    char gender;
    private double sal;

    public Person(String name, int age, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.sal = sal;
    }

    public void hi1(){
    }
    protected void hi2(int n){
    }
    void hi3(){
    }
    private void hi4(String name){
    }
}

interface IA{

}
interface IB{

}
