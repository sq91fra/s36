package gdsldl.fl.generic;

//import org.junit.jupiter.api.Test;//导错包了

import org.junit.Test;

import java.util.*;

@SuppressWarnings({"all"})
public class Generic_Ex4 {
    @Test
    public void test(){
        DAO<User> userDAO = new DAO<>();
        userDAO.save("zs",new User(1,18,"张三"));
        userDAO.save("ls",new User(2,19,"李四"));
        userDAO.save("ww",new User(3,20,"王五"));

        userDAO.get("ww");

        userDAO.update("ww",new User(3,18,"呜呜"));

        userDAO.list();

        userDAO.delete("zs");

        System.out.println(userDAO);
    }
}
/**
 * 定义个泛型类 DAO＜T＞，在其中定义一个Map 成员变量，Map的键为 String 类型，值为T 类型。分别创建以下方法：
 * （1） public void save（String id，T entity）：保存T类型的对象到 Map 成员变量中
 * （2） public T get（String id）：从 map 中获取 id 对应的对象
 * （3） public void update（String id，T entity）：替换 map 中key为id的内容，改为 entity 对象
 * （4） public List＜T＞list（）：返回 map 中存放的所有T对象
 * （5） public void delete（String id）：删除指定 id 对象
 * 定义一个User类：
 * 该类包含：private成员变量（int类型）id，age；（String 类型）name。
 * 创建 DAO 类的对象， 分别调用其 save、get、update、list、delete 方法来操作 User 对象， 使用 Junit 单元测试类进行测试。
 */
class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class DAO<T>{
    private Map<String,T> map = new HashMap<>();

    public void save(String id, T entity){
//        map = new HashMap<String,T>();
        map.put(id,entity);
    }

    public T get(String id){
        return map.get(id);
    }

    public void update(String id,T entity){
        map.replace(id,entity);
    }

    public List<T> list(){
//        int len = map.size();
//        ArrayList<T> list = new ArrayList<>();
//        for (int i = 0; i < len; i++) {
//            list.add(map.get(i));
//        }
        List<T> list = new ArrayList<>();

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            list.add(get(key));//可以直接使用前面的get()
        }

        return list;
    }

    @Test
    public void delete(String id){
        map.remove(id);
    }

    @Override
    public String toString() {
        return "DAO{" +
                "map=" + map +
                '}';
    }
}