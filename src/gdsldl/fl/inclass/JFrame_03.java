package gdsldl.fl.inclass;

import javax.swing.*;

/**
 * @author FL
 * @version 2023年3月23日上午9:16:20
 */
class MenuFrm extends JFrame{
	public MenuFrm() {
		init();
		setTitle("图书馆管理系统（设计者：谢凡）");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void init() {
		JMenuBar bar=new JMenuBar();
		JMenu menu1=new JMenu("基本信息维护");
		JMenu menu2=new JMenu("图书借阅");
		JMenu menu3=new JMenu("读者管理");
		JMenu menu4=new JMenu("图书管理");//菜单
		JMenuItem item=new JMenuItem("借书密码");
		JMenuItem item2=new JMenuItem("借书");
		JMenuItem item3=new JMenuItem("还书");
		JMenuItem item4=new JMenuItem("查书");
		JMenuItem item5=new JMenuItem("添加读者信息");
		JMenuItem item6=new JMenuItem("修改读者信息");
		JMenuItem item7=new JMenuItem("删除读者信息");
		JMenuItem item8=new JMenuItem("添加图书信息");
		JMenuItem item9=new JMenuItem("修改图书信息");
		JMenuItem item10=new JMenuItem("删除图书信息");
		JMenuItem item11=new JMenuItem("设置图书信息");	
		
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
