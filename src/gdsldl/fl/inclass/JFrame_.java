package gdsldl.fl.inclass;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class JFrame_ {
public static void main(String[] args) {
	MainFrm jf = new MainFrm();
	jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
}
}

class MainFrm extends JFrame{
	public MainFrm() {
		getContentPane().setBackground(Color.blue);//���ô�����ɫ
//		���ô���ͼ��
		ImageIcon img = new ImageIcon("·��");
		setIconImage(img.getImage());
		//		setLocationByPlatform(true);
		setLocation(200, 100);
		setTitle("IKUN�ĵ�һ��");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
		
	}

}