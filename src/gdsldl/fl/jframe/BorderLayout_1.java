package gdsldl.fl.jframe;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author FL
 * @version 2023年3月23日上午11:14:51
 */
public class BorderLayout_1 {
public static void main(String[] args) {
	new BorderLayoutFrame();
}
}

class BorderLayoutFrame extends JFrame{
	public BorderLayoutFrame() {
		// TODO Auto-generated constructor stub
		init();
		this.setTitle("边框布局");
		this.setBounds(100, 200, 400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void init() {
//		按钮对象
		JButton buttonEast = new JButton("东边按钮");
		JButton buttonWest = new JButton("西边按钮");
		JButton buttonNorth = new JButton("北边按钮");
		JButton buttonCenter = new JButton("中部按钮");
		
		JButton buttomSouth1 = new JButton("南部按钮1");
		JButton buttomSouth2 = new JButton("南部按钮2");
//		面板对象
		JPanel panSouth = new JPanel();
//		把按钮添加到面板对象
		panSouth.add(buttomSouth1);
		panSouth.add(buttomSouth2);
//		把按钮添加至布局中
		this.add(panSouth, BorderLayout.SOUTH);
		this.add(buttonEast,BorderLayout.EAST);
		this.add(buttonWest,BorderLayout.WEST);
		this.add(buttonNorth,BorderLayout.NORTH);
	}
	
}

