package gdsldl.fl.exam;

public class exam02 {
	/**
	 * С�������������ٳ֡����ӵ�x��վ�����ʽ�
	 * С����֪ÿ�춼�зɴ��������򣬵���Ҫ108Ԫ�Ĵ�Ʊ������ȴ���޷��ġ�
	��������x��ս�򹤡����ĵ��ϰ��Ӧ��ʳ�ޣ���1�����1ԪǮ��
	���ң��Ժ��ÿһ�춼��ǰһ���2ԪǮ��ֱ�������㹻��Ǯ��Ʊ��
	�����һ�£�С���ڵڼ�����ܴչ�108Ԫ�����ص���
	Ҫ���ύ����һ����������ʾ�ڼ��졣�벻Ҫ�ύ�κζ�������ݡ�
	 */
public static void main(String[] args) {
	int money = 0;
	int day = 1;
	
	while (true) {
		money = day+(day-1)*2;
		day++;
		if(money >=108) {
			break;
		}
	}
	System.out.println(day);
}
}
