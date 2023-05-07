package gdsldl.fl.jframe;
/**
 * @author FL
 * @version 2023��3��30������11:17:43
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

class Frame2 extends JFrame implements ActionListener{
	//���췽��һ���������ô��������
	public Frame2() {	
		setLayout(new FlowLayout());
		init();//���ø÷���Ϊ��ǰ������ӿؼ�
		setSize(500,400);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//����رմ���ʱ�����κβ���
		setVisible(true);
		//����رհ�ťʱ�������������ڹرա�����Ϣ����Ӧ�ø���������¼��������
		//��Ϊ�ǵ���رհ�ť�ŵ�����Ϣ�����Դ������¼�Դ������رհ�ť������WindowEvent�¼���Ҫ��������¼���Ҫ���¼�Դ��Ӽ�������������ǰ�������WindowListener������		
		this.addWindowListener(new WindowListener() {	
			@Override
			public void windowClosing(WindowEvent e) {
				//JOptionPane.showMessageDialog(null,"�������ڹر�");//������Ϣ��	
				int result=JOptionPane.showConfirmDialog(null,"�Ƿ�رմ���","��ʾ", JOptionPane.YES_NO_OPTION);
				if(result==JOptionPane.YES_OPTION)// ����Ի�����ѡ���ǡ��ǡ���ť
					dispose();//�رյ�ǰ����
				
			}	
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				setTitle("�򿪴���");
			}			
			@Override
			public void windowIconified(WindowEvent e) {
				setTitle("��С������");				
			}			
			@Override
			public void windowDeiconified(WindowEvent e) {
				setTitle("ȡ��������С��");				
			}			
			@Override
			public void windowDeactivated(WindowEvent e) {
				setTitle("����Ӽ���״̬����Ǽ���״̬");				
			}
					
			@Override
			public void windowClosed(WindowEvent e) {
				setTitle("�����ѹر�");				
			}			
			@Override
			public void windowActivated(WindowEvent e) {
				setTitle("����ӷǼ���״̬���뼤��״̬");
				
			}
		});
	}
	//���淽���������ô����������Ŀؼ�
	private void init() {
		JButton btnLogin = new JButton("��¼");
		this.add(btnLogin);
		btnLogin.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		JOptionPane .showMessageDialog(null, "�����¼��������");
	}
}
public class Java44 {
	public static void main(String[] args) {
		new Frame2();
	}
}
