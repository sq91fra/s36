package gdsldl.fl.collection_;
/**
 * @author:FL
 * @version: 2023年4月5日上午11:22:52
*/
import java.util.ArrayList;
import java.util.Collections;
@SuppressWarnings({"all"})
public class Collctions_02 {
   public static void main(String[] args) {
      ArrayList list = new ArrayList();
      list.add(3);
      list.add(-2);
      list.add(9);
      list.add(5);
      list.add(-1);
      list.add(6);
      //[3, -2, 9, 5, -1, 6]
      System.out.println(list);
       
      //输出最大元素9
      System.out.println(Collections.max(list));
       
      //输出最小元素：-2
      System.out.println(Collections.min(list));
       
      //将list中的-2用1来代替
      System.out.println(Collections.replaceAll(list, -2, 1));
      //[3, 1, 9, 5, -1, 6]
      System.out.println(list);
      list.add(9);
       
      //判断9在集合中出现的次数，返回2
      System.out.println(Collections.frequency(list, 9));
       
      //对集合进行排序
      Collections.sort(list);
      //[-1, 1, 3, 5, 6, 9, 9]
      System.out.println(list);
       
     //只有排序后的List集合才可用二分法查询，输出2
      System.out.println(Collections.binarySearch(list, 3));
   }
}

