package gdsldl.fl.file.inputsteam_;

import gdsldl.fl.file.outputsteam_.Dog;//引用Dog类

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        指定反序列化文件
        String filePath = "d:\\data.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
//        文件类型要一致
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Object dog = ois.readObject();
        System.out.println(dog.getClass());
        System.out.println(dog);

//        如果希望调用Dog的方法，需要向下转型
//        且需要将Dog的定义，放在可以引用的地方
        Dog d = (Dog)dog;
        System.out.println(d.getName());
//关闭流
        ois.close();
    }
}
