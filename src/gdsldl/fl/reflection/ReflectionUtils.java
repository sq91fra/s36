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
//        getName����ȡȫ����
        System.out.println(personCls.getName());
//        getSimpleName:��ȡ������
        System.out.println(personCls.getSimpleName());
        System.out.println("------");
//        getFields����ȡ����public���ε����ԣ����������Լ������
        Field[] fields1 = personCls.getFields();
        for (Field field :fields1) {
            System.out.println("���ԣ�"+field.getName());
        }
        System.out.println("------");
//        getDeclaredFields:��ȡ��������������
        Field[] fields2 = personCls.getDeclaredFields();
        for (Field field :fields2) {
            System.out.println("���ԣ�"+field.getName());
        }
        System.out.println("------");
//        getMethods:��ȡ����public"�ķ��������������Լ������
        Method[] methods1 = personCls.getMethods();
        for (Method method :methods1) {
            System.out.println("������"+method.getName());
        }
        System.out.println("------");
//        getDeclaredMethods:��ȡ���������з���
        Method[] methods2 = personCls.getDeclaredMethods();
        for (Method method :methods2) {
            System.out.println("������"+method.getName());
        }
        System.out.println("------");
//        getConstructors:��ȡ����pub���εĹ����������������Լ������
        Constructor<?>[] constructors1 = personCls.getConstructors();
        for (Constructor constructor :constructors1) {
            System.out.println("������"+constructor.getName());
        }
        System.out.println("------");
//        getDeclaredConstructors:��ȡ���������й�����
        Constructor<?>[] constructors2 = personCls.getDeclaredConstructors();
        for (Constructor constructor :constructors2) {
            System.out.println("������"+constructor.getName());
        }
//        getPackage:��Package��ʽ���ذ���Ϣ
        System.out.println(personCls.getPackage());
        System.out.println("------");
        Class<?>[] interfaces = personCls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("�ӿ���Ϣ="+anInterface);
        }
        System.out.println("------");
//        getAnnotations:��Annotation[]��ʽ����ע����Ϣ
        AnnotatedType[] annotatedInterfaces = personCls.getAnnotatedInterfaces();
        for (AnnotatedType annotatedInterface : annotatedInterfaces) {
            System.out.println("ע����Ϣ="+annotatedInterface);
        }
    }

    @Test
    public void api_02() throws ClassNotFoundException {
        Class<?> personCls = Class.forName("gdsldl.fl.reflection.Person");
        //        getDeclaredFields:��ȡ��������������
        Field[] fields2 = personCls.getDeclaredFields();
        for (Field field :fields2) {
            System.out.println("����:"+field.getName()
                    +",�����Ե����η�:"+field.getModifiers()
                    +",�����Ե�����:"+field.getType());
        }
    }

    @Test
    public void api_03() throws ClassNotFoundException {
        Class<?> personCls = Class.forName("gdsldl.fl.reflection.Person");
//        getDeclaredMethods:��ȡ���������з���
        Method[] methods2 = personCls.getDeclaredMethods();
        for (Method method :methods2) {
            System.out.println("����:"+method.getName()
                    +",�����Ե����η�:"+method.getModifiers()
                    +",�����Եķ�������:"+method.getReturnType());
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("�����ԵĲ�������:" +parameterType);
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
