package gdsldl.fl.inclass;

import javax.swing.*;

/**
 * @author FL
 * @version 2023��3��23������9:16:20
 */
class MenuFrm extends JFrame{
	public MenuFrm() {
		init();
		setTitle("ͼ��ݹ���ϵͳ������ߣ�л����");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void init() {
		JMenuBar bar=new JMenuBar();
		JMenu menu1=new JMenu("������Ϣά��");
		JMenu menu2=new JMenu("ͼ�����");
		JMenu menu3=new JMenu("���߹���");
		JMenu menu4=new JMenu("ͼ�����");//�˵�
		JMenuItem item=new JMenuItem("��������");
		JMenuItem item2=new JMenuItem("����");
		JMenuItem item3=new JMenuItem("����");
		JMenuItem item4=new JMenuItem("����");
		JMenuItem item5=new JMenuItem("��Ӷ�����Ϣ");
		JMenuItem item6=new JMenuItem("�޸Ķ�����Ϣ");
		JMenuItem item7=new JMenuItem("ɾ��������Ϣ");
		JMenuItem item8=new JMenuItem("���ͼ����Ϣ");
		JMenuItem item9=new JMenuItem("�޸�ͼ����Ϣ");
		JMenuItem item10=new JMenuItem("ɾ��ͼ����Ϣ");
		JMenuItem item11=new JMenuItem("����ͼ����Ϣ");	
		
		this.setJMenuBar(bar);
		bar.add(menu1);
		bar.add(menu2);		
		menu1.add(menu3);
		menu1.add(menu4);
		menu1.add(item);		
		menu2.add(item2);
		menu2.add(item3);
		menu2.add(item4);		
		menu3.add(item5);
		menu3.add(item6);
		menu3.add(item7);		
		menu4.add(item8);
		menu4.add(item9);
		menu4.add(item10);
		menu4.add(item11);
	}	
}
public class JFrame_03 {

	public static void main(String[] args) {
		new MenuFrm();		
	}
}
