package gdsldl.fl.exam;


public class Exam04 {
	public static void main(String[] args) {
		int[] arr = {1,2,4,4,5,6,7,8};
//		普通for
		System.out.println("普通for:");
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.println("增强for:");
		for (int i : arr) {
			System.out.print(i+"\t");
		}
		
	}

}
