package gdsldl.fl.jframe;
/**
 * @author FL
 * @version 2023年3月24日下午2:51:59
 */
import java.awt.FlowLayout;
import javax.swing.*;
public class BoxLayout_1 extends JFrame {
 public BoxLayout_1(){
init();
this.setTitle("盒式布局");
/**
 * 如果窗体使用盒式布局，通常会把窗体的布局方式改为流布局，再把盒
* 式容器类对象放到窗体中。
 */
this.setLayout(new FlowLayout());//设置布局
this.setSize(300, 200);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
 }
 private void init(){
 //根据分析创建两个水平盒子和一个垂直盒子
Box box=Box.createVerticalBox();//垂直盒子
Box box1=Box.createHorizontalBox();//水平盒子1
Box box2=Box.createHorizontalBox();//水平盒子 2
Box box3=Box.createHorizontalBox();//水平盒子 3
 //创建组件
JLabel lblUsername=new JLabel("姓名");//标签框
JLabel lblPassword=new JLabel("密码");
JTextField txtUsername=new JTextField(10);//文本框(最多输入10)
JPasswordField txtPassword=new JPasswordField(10);//密码框
JButton btn1=new JButton("登录");

 //将组件添加到盒子中
box1.add(lblUsername);//水平盒子1添加标签框
box1.add(Box.createHorizontalStrut(10));//水平盒子1添加水平支撑
box1.add(txtUsername);
box2.add(lblPassword);
box2.add(Box.createHorizontalStrut(10));//水平盒子2添加水平支撑
box2.add(txtPassword);
box3.add(btn1);
box3.add(Box.createHorizontalStrut(10));//水平盒子2添加水平支撑
box.add(box1);
box.add(Box.createVerticalStrut(10));//垂直盒子添加垂直支撑
box.add(box2);
box.add(Box.createVerticalStrut(10));//垂直盒子添加垂直支撑
box.add(box3);

this.add(box); 
 }
 public static void main(String[] args) {
	 new BoxLayout_1();
 }
}

