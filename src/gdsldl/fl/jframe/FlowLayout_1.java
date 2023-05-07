package gdsldl.fl.jframe;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author FL
 * @version 2023年3月23日上午11:14:51
 */
public class FlowLayout_1 {
public static void main(String[] args) {
	new FlowLayoutFrame();
}
}

class FlowLayoutFrame extends JFrame{
	public FlowLayoutFrame() {
		// TODO Auto-generated constructor stub
		init();
		this.setTitle("流布局");
		this.setLayout(new FlowLayout());
		this.setBounds(100, 200, 400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void init() {
		//创建按钮对象
		 JButton btn1 = new JButton("1");
		 JButton btn2 = new JButton("2");
		 JButton btn3 = new JButton("3");
		 JButton btn4 = new JButton("4");
		 JButton btn5 = new JButton("5");
		 JButton btn6 = new JButton("6");
		 JButton btn7 = new JButton("7");
		 JButton btn8 = new JButton("8");
		 JButton btn9 = new JButton("9");


//		把按钮添加至布局中
//		this.add(panSouth, BorderLayout.SOUTH);
		 this.add(btn1); this.add(btn2); this.add(btn3); this.add(btn4);
		 this.add(btn5); this.add(btn6); this.add(btn7); this.add(btn8);
		 this.add(btn9);  
	}
	
}

