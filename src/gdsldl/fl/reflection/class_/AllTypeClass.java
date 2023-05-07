package gdsldl.fl.reflection.class_;

import java.io.Serializable;

public class AllTypeClass {
    public static void main(String[] args) {
//        1. 外部类，成员内部类，静态内部类，局部内部类，匿名内部类
        Class<String> cls1 = String.class;
//        2. interface．接口
        Class<Serializable> cls2 = Serializable.class;
//        3. enum
        Class<Thread.State> cls3 = Thread.State.class;
//        4. 数组
        Class<int[][]> cls4 = int[][].class;
//        5. annotation注解
        Class<Deprecated> cls5 = Deprecated.class;
//        6. 基本数据类型
        Class<Integer> cls6 = int.class;
//        7. void
        Class<Void> cls7 = void.class;
        Class<Class> cls8 = Class.class;

    }
}
