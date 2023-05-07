package gdsldl.fl.search;

public class BinarySearch {
public static void main(String[] args) {
	
	int[] array = {10, 11, 12, 13, 14, 15, 16, 17};
	
	int temp = search(array, 12);
	System.out.println(temp);
	
}

public static int search(int[] array , int target) {
//	��С����ָ�� 
	int min = 0;
//	�������ָ��
	int max = array.length - 1;
	
	while (min <= max) {
//		�м�����ָ��
		int mid = (min + max) / 2;
		if (array[mid] == target) {
			return mid;
		}
		
		if (array[mid] < target) {
			min = mid++;
		}
		
		if(array[mid] > target) {
			max = mid--;
		}
		
	}
	return -1;
}
}

