package gdsldl.fl.inclass;
/**
 * @author FL
 * @version 2023��3��23������8:55:31
 */
import javax.swing.*;
import java.awt.*;
public class JFrame_02 {
	public static void main(String[] args) {
		JFrame window1=new JFrame("��һ������");
		JFrame window2=new JFrame("�ڶ�������");
		Container con=window1.getContentPane();
		con.setBackground(Color.yellow);        //���ô��ڱ���ɫ
		window1.setBounds(60,100,188,108);      //���ô�������Ļ�ϵ�λ�úʹ�С
		window2.setBounds(260,100,188,108);
		window1.setVisible(true);
		window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  //�ͷŵ�ǰ����
		window2.setVisible(true);
		window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //�˳�����
	}
}
