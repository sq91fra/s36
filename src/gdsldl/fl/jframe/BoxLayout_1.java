package gdsldl.fl.jframe;
/**
 * @author FL
 * @version 2023��3��24������2:51:59
 */
import java.awt.FlowLayout;
import javax.swing.*;
public class BoxLayout_1 extends JFrame {
 public BoxLayout_1(){
init();
this.setTitle("��ʽ����");
/**
 * �������ʹ�ú�ʽ���֣�ͨ����Ѵ���Ĳ��ַ�ʽ��Ϊ�����֣��ٰѺ�
* ʽ���������ŵ������С�
 */
this.setLayout(new FlowLayout());//���ò���
this.setSize(300, 200);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
 }
 private void init(){
 //���ݷ�����������ˮƽ���Ӻ�һ����ֱ����
Box box=Box.createVerticalBox();//��ֱ����
Box box1=Box.createHorizontalBox();//ˮƽ����1
Box box2=Box.createHorizontalBox();//ˮƽ���� 2
Box box3=Box.createHorizontalBox();//ˮƽ���� 3
 //�������
JLabel lblUsername=new JLabel("����");//��ǩ��
JLabel lblPassword=new JLabel("����");
JTextField txtUsername=new JTextField(10);//�ı���(�������10)
JPasswordField txtPassword=new JPasswordField(10);//�����
JButton btn1=new JButton("��¼");

 //�������ӵ�������
box1.add(lblUsername);//ˮƽ����1��ӱ�ǩ��
box1.add(Box.createHorizontalStrut(10));//ˮƽ����1���ˮƽ֧��
box1.add(txtUsername);
box2.add(lblPassword);
box2.add(Box.createHorizontalStrut(10));//ˮƽ����2���ˮƽ֧��
box2.add(txtPassword);
box3.add(btn1);
box3.add(Box.createHorizontalStrut(10));//ˮƽ����2���ˮƽ֧��
box.add(box1);
box.add(Box.createVerticalStrut(10));//��ֱ������Ӵ�ֱ֧��
box.add(box2);
box.add(Box.createVerticalStrut(10));//��ֱ������Ӵ�ֱ֧��
box.add(box3);

this.add(box); 
 }
 public static void main(String[] args) {
	 new BoxLayout_1();
 }
}

