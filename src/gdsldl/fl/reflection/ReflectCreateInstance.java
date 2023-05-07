package gdsldl.fl.reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class ReflectCreateInstance {
    @Test
    public void m1() throws Exception{
//        1. �Ȼ�ȡUser���Class����
        String classFullPath = "gdsldl.fl.reflection.User";
        Class<?> cls = Class.forName(classFullPath);
//        2. ͨ��public���޲ι���������ʵ��
        User user = (User) cls.newInstance();
        System.out.println(user);
//        3. ͨ��public���вι���������ʵ��
//        3.1 �Ȼ�ȡ������
        Constructor<?> constructor = cls.getConstructor(String.class);
        /*
            constructor�������
             public User(String name) {
                   this.name = name;
               }
        */
//        3.2 �ٴ���ʵ�Σ�����ʵ��
        Object li = constructor.newInstance("����");
        System.out.println(li);
//        4. ͨ����public���вι���������ʵ��
//        4.1 �Ȼ�ȡ˽�й�����
        Constructor<?> constructor1 = cls.getDeclaredConstructor(int.class, String.class);
        constructor1.setAccessible(true);//�����ƽ⣬ʹ˽�й�����/����/���Կ��Ա�����
        Object li2 = constructor1.newInstance(100, "����");
        System.out.println(li2);
    }
}

class User{
    private int age = 10;
    private String name = "����";

    public User() {//�޲Σ�����
    }

    public User(String name) {
        this.name = name;
    }

    private User(int age, String name) {//�вΣ�˽��
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
