package gdsldl.fl.search;

public class LinearSelect {
public static void main(String[] args) {
	
//	查找数组中是否存在9这个元素，如果存在就返回索引。否则返回-1
	int array[] = new int[] {2,4,6,8,9,0};
	
	int temp = show(array, 0);
	System.out.println(temp);
}

public static int show(int[] array, int target) {
	for (int i = 0; i < array.length; i++) {
		if (array[i] == target) {
			return i;
		}
	}
	
	return -1;
}
}
