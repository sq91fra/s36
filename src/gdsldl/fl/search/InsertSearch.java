package gdsldl.fl.search;

public class InsertSearch {
public static void main(String[] args) {
	
	int[] array = {10, 11, 12, 13, 14, 15, 16, 17};
	int right = array.length-1;
	int temp = search(array, 0, right , 11);
	System.out.println(temp);
}

public static int search(int[] array ,int left, int right, int target) {

	if (left >right || target <array[0] || target > array[array.length-1]) {
		return -1;
	}
	
	int mid = left + (right - left) * (target - array[left]) / (array[right] - array[left]);
	
	
	if (array[mid] < target) {
		return search(array, left, right-1,target);
	}
	
	else if(array[mid] > target) {
		return search(array, left+1, right,target);
	}
	else  {
		return mid;
	}
}
}
