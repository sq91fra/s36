package gdsldl.fl.inclass;
/**
 * @author FL
 * @version 2023��3��23������10:26:03
 * @address https://blog.csdn.net/xiaoyuyully/article/details/53283918
 */

import javax.swing.*;
import java.awt.event.InputEvent; 
import java.awt.event.KeyEvent;

public class JFrame_04{
    public static void main(String args[]){
        JFrame win = new JFrame("�����");

        //��������Ӳ˵���
        JMenuBar menuBar = new JMenuBar();
        win.setJMenuBar(menuBar);

        //��������Ӹ��˵���ע�⣺�˵��Ŀ�ݼ���ͬʱ����Alt������ĸ��������setMnemonic('F')�����ÿ�ݼ�ΪAlt +��
        JMenu menuFile = new JMenu("�ļ�(F)"), menuEdit = new JMenu("�༭(E)"), menuView = new JMenu("�鿴(V)");
        menuFile.setMnemonic('F'); //����alt��ݼ�
        menuEdit.setMnemonic('E'); 
        menuView.setMnemonic('V'); 
        menuBar.add(menuFile);//�����Ŀ
        menuBar.add(menuEdit);
        menuBar.add(menuView);

        //��ӡ��ļ����˵��ĸ��˵���
        JMenu itemOpen = new JMenu("��");
        itemOpen.setMnemonic('O'); 
        JMenuItem itemOpen1 = new JMenuItem("��x");
        JMenuItem itemOpen2 = new JMenuItem("��y");
        itemOpen.add(itemOpen1);
        itemOpen.add(itemOpen2);
        JMenuItem itemSave = new JMenuItem("����");
        itemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK)); 
        menuFile.add(itemOpen);
        menuFile.add(itemSave);

        //��ӡ��༭���˵��ĸ��˵���
        JMenuItem itemCopy = new JMenuItem("����");
        itemCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_MASK));
        menuEdit.add(itemCopy);

        //��ӡ��鿴���˵��ĸ��˵���
        JMenuItem itemStop = new JMenuItem("ֹͣ"), itemRefresh = new JMenuItem("ˢ��");
        itemStop.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
        itemRefresh.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,InputEvent.CTRL_MASK));
        menuView.add(itemStop);
        menuView.add(itemRefresh);

        win.setSize(400,300);
        win.setLocation(250, 250);
        win.setVisible(true); 

        win.validate();
        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
