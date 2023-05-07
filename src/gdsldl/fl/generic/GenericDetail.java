package gdsldl.fl.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:FL
 * @version: 2023年4月10日上午11:50:17
*/
@SuppressWarnings({"all"})
public class GenericDetail {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();//ok
//	List<int> list2 = new ArrayList<int>();//error
	
	List<GD01> list3 = new ArrayList<GD01>();
	list3.add(new GD001());
}
}

class GD01{
	
}
class GD001 extends GD01{
	
}
