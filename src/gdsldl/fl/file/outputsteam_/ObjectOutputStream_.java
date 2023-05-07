package gdsldl.fl.file.outputsteam_;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception {
//        将数据序列化
//        保存的文件格式不是纯文本
        String filePath = "d:\\data.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
//        序列化数据
        oos.writeInt(100);//以下都实现了Serializable接口
        oos.writeBoolean(true);
        oos.writeChar('a');
        oos.writeDouble(1.1);
        oos.writeUTF("Hello world");
        oos.writeObject(new Dog("Tom",6));

        oos.close();
        System.out.println("Serialize success");
    }
}

