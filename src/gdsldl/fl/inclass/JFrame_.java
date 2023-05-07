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
		getContentPane().setBackground(Color.blue);//设置窗体颜色
//		设置窗体图标
		ImageIcon img = new ImageIcon("路经");
		setIconImage(img.getImage());
		//		setLocationByPlatform(true);
		setLocation(200, 100);
		setTitle("IKUN的第一次");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
		
	}

}