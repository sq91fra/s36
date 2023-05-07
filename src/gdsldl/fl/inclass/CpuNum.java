package gdsldl.fl.inclass;
/**
 * @author FL
 * @version 2023年3月31日下午3:53:06
 */
public class CpuNum {
public static void main(String[] args) {
	Runtime runtime = Runtime.getRuntime();
	int cpuNum = runtime.availableProcessors();
	System.out.println("可获取的处理其数量是"+cpuNum);
}
}
