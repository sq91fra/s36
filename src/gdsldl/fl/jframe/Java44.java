package gdsldl.fl.jframe;
/**
 * @author FL
 * @version 2023年3月30日上午11:17:43
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

class Frame2 extends JFrame implements ActionListener{
	//构造方法一般用来设置窗体的属性
	public Frame2() {	
		setLayout(new FlowLayout());
		init();//调用该方法为当前窗体添加控件
		setSize(500,400);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//点击关闭窗体时不做任何操作
		setVisible(true);
		//点击关闭按钮时弹出“窗体正在关闭”的信息，就应该给窗体添加事件处理程序
		//因为是点击关闭按钮才弹出信息，所以窗体是事件源，点击关闭按钮会引发WindowEvent事件，要处理这个事件，要给事件源添加监听器，即给当前窗体添加WindowListener监听器		
		this.addWindowListener(new WindowListener() {	
			@Override
			public void windowClosing(WindowEvent e) {
				//JOptionPane.showMessageDialog(null,"窗体正在关闭");//弹出消息框	
				int result=JOptionPane.showConfirmDialog(null,"是否关闭窗体","提示", JOptionPane.YES_NO_OPTION);
				if(result==JOptionPane.YES_OPTION)// 如果对话框中选的是“是”按钮
					dispose();//关闭当前窗体
				
			}	
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				setTitle("打开窗体");
			}			
			@Override
			public void windowIconified(WindowEvent e) {
				setTitle("最小化窗体");				
			}			
			@Override
			public void windowDeiconified(WindowEvent e) {
				setTitle("取消窗体最小化");				
			}			
			@Override
			public void windowDeactivated(WindowEvent e) {
				setTitle("窗体从激活状态进入非激活状态");				
			}
					
			@Override
			public void windowClosed(WindowEvent e) {
				setTitle("窗体已关闭");				
			}			
			@Override
			public void windowActivated(WindowEvent e) {
				setTitle("窗体从非激活状态进入激活状态");
				
			}
		});
	}
	//下面方法用来设置窗体上新增的控件
	private void init() {
		JButton btnLogin = new JButton("登录");
		this.add(btnLogin);
		btnLogin.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		JOptionPane .showMessageDialog(null, "这是事件处理程序");
	}
}
public class Java44 {
	public static void main(String[] args) {
		new Frame2();
	}
}
