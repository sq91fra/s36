package gdsldl.fl.jframe;
/**
 * @author FL
 * @version 2023��3��24������3:35:28
 */
import javax.swing.*;
public class NullLayout extends JFrame{
public NullLayout() {
init();
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
setSize(250,200);
setLayout(null); //�������Ϊ�޲��ַ�ʽ
setVisible(true);
}
private void init() {
JTextField t1=new JTextField(10);JTextField t2=new JTextField(10);
JTextField t3=new JTextField(10);JTextField t4=new JTextField(10);
//Ҫ������������ʾλ�úʹ�С
t1.setBounds(10,10,60,20); t2.setBounds(60,50,60,20);
t3.setBounds(110,90,60,20);t4.setBounds(160,130,60,20);
//�������ӵ�������
this.add(t1);this.add(t2);this.add(t3);this.add(t4);
}
public static void main(String[] args) {
new NullLayout();
}
}

