package gdsldl.fl.inclass;
/**
 * @author FL
 * @version 2023��3��31������3:53:06
 */
public class CpuNum {
public static void main(String[] args) {
	Runtime runtime = Runtime.getRuntime();
	int cpuNum = runtime.availableProcessors();
	System.out.println("�ɻ�ȡ�Ĵ�����������"+cpuNum);
}
}
