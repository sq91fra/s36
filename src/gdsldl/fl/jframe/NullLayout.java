package gdsldl.fl.jframe;
/**
 * @author FL
 * @version 2023年3月24日下午3:35:28
 */
import javax.swing.*;
public class NullLayout extends JFrame{
public NullLayout() {
init();
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
setSize(250,200);
setLayout(null); //将窗体改为无布局方式
setVisible(true);
}
private void init() {
JTextField t1=new JTextField(10);JTextField t2=new JTextField(10);
JTextField t3=new JTextField(10);JTextField t4=new JTextField(10);
//要定义各组件的显示位置和大小
t1.setBounds(10,10,60,20); t2.setBounds(60,50,60,20);
t3.setBounds(110,90,60,20);t4.setBounds(160,130,60,20);
//将组件添加到窗体上
this.add(t1);this.add(t2);this.add(t3);this.add(t4);
}
public static void main(String[] args) {
new NullLayout();
}
}

