package gdsldl.fl.jframe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author FL
 * @version 2023��3��24������3:47:52
 */
@SuppressWarnings("all")
public class LoginFrm extends JFrame{
    public JLabel label1;
    public JLabel label2;
    public JTextField txtUsername;
    public JPasswordField password;
    public JButton btnLogin;
    public JButton btnCondel;
    public JLabel lblResult;
    public LoginFrm() {
        init();
        this.setBounds(200, 200, 300, 250);
        this.setTitle("��¼����");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    private void init(){
        label1=new JLabel("�û���");
        label2=new JLabel("����");
        txtUsername=new JTextField(10);
        password=new JPasswordField(10);
        btnLogin=new JButton("��¼");
        btnCondel=new JButton("ȡ��");
        lblResult=new JLabel();
        JPanel pan1=new JPanel();
        JPanel pan2=new JPanel();
        JPanel pan3=new JPanel();
        JPanel pan4=new JPanel();
//���ò���Ϊ���񲼾�
        this.setLayout(new GridLayout(4,1,20,20));
        this.add(pan1);
        this.add(pan2);
        this.add(pan3);
        this.add(pan4);
        pan1.add(label1);
        pan1.add(txtUsername);
        pan2.add(label2);
        pan2.add(password);
        pan3.add(btnLogin);
        pan3.add(btnCondel);
        pan4.add(lblResult);
//        ��������򲻿���
//        label2.setEnabled(false);
//        ��¼������¼�
        btnLogin.addActionListener(new ActionListener(){
                                       @Override
                                       public void actionPerformed(java.awt.event.ActionEvent arg0) {
                                           if(txtUsername.getText().equals("admin") && String.valueOf(password.getPassword()).equals("123456"))
                                               lblResult.setText("�û���������ȷ");
                                           else
                                               lblResult.setText("�û����������");
                                       }
                                   }
        );
//ȡ��������¼�
        btnCondel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String args[]) {
        new LoginFrm();
    }
}
