package gdsldl.fl.jframe;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author FL
 * @version 2023��3��23������11:14:51
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
		this.setTitle("�߿򲼾�");
		this.setBounds(100, 200, 400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void init() {
//		��ť����
		JButton buttonEast = new JButton("���߰�ť");
		JButton buttonWest = new JButton("���߰�ť");
		JButton buttonNorth = new JButton("���߰�ť");
		JButton buttonCenter = new JButton("�в���ť");
		
		JButton buttomSouth1 = new JButton("�ϲ���ť1");
		JButton buttomSouth2 = new JButton("�ϲ���ť2");
//		������
		JPanel panSouth = new JPanel();
//		�Ѱ�ť��ӵ�������
		panSouth.add(buttomSouth1);
		panSouth.add(buttomSouth2);
//		�Ѱ�ť�����������
		this.add(panSouth, BorderLayout.SOUTH);
		this.add(buttonEast,BorderLayout.EAST);
		this.add(buttonWest,BorderLayout.WEST);
		this.add(buttonNorth,BorderLayout.NORTH);
	}
	
}

