package gdsldl.fl.file.outputsteam_;

import java.io.Serializable;

//必须实现Serializable接口才能序列化
public class Dog implements Serializable {
    private String name;
    private int age ;
//    序列化版本号，提高兼容性
    private static final long serialVersionUID = 1L;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
