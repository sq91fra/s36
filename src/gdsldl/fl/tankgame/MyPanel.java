package gdsldl.fl.tankgame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.JPanel;

//Ϊ����Panel��ͣ�ػ棬��Ҫ��MyPanelʵ��Runnable
public class MyPanel extends JPanel implements KeyListener,Runnable{
    //����̹��
    public Hero myTank = null;
    //    ���˵������࣬���Է��뼯��Vector��
    public Vector<EnemyTank> enemies = new Vector<>();
    public int len = 3;
    public boolean loop = true;

    public MyPanel(){
        //��ʼ��̹��
        myTank = new Hero(400,400);
//        ��ʼ������
        for (int i = 0; i < len; i++) {
            EnemyTank temp = new EnemyTank(100*(i+1), 0,2);
            temp.setDirect(2);
            enemies.add(temp);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);    //�滭���������Σ�Ĭ�Ϻ�ɫ
        drawTanke(myTank.getX(),myTank.getY(),g,myTank.getDirect(),0);     //����̹��
        if (myTank.bullet != null && myTank.bullet.isLive == true) {
            drawBullet(myTank.getX(),myTank.getY(),g,0);
        }
//        int len = enemies.size();
        for (int i = 0; i < len; i++) {
            drawTanke(enemies.get(i).getX(),enemies.get(i).getY(),g,enemies.get(i).getDirect(),enemies.get(i).getType());
        }

    }

    //��д�滭̹�˵ķ���
    /*
     *   x : ̹�����Ͻ�x����
     *   y : ̹�����Ͻ�y����
     *   g�� ����
     *   direct : ̹�˷���
     *   type : ̹������
     * */    public void drawTanke(int x,int y,Graphics g,int direct,int type){
        switch (type) {
            case 0:     //�����Լ�̹�˵���ɫ
                g.setColor(Color.cyan);
                break;            case 1:     //���õз�̹����ɫ
                g.setColor(Color.green);
                break;            case 2:     //���õз�̹����ɫ
                g.setColor(Color.red);
                break;        }
        //���ݷ������̹��
        switch(direct){
//        ����
            case 0:
                g.fill3DRect(x,y,10,60,false);          //�滭̹���������
                g.fill3DRect(x + 30,y,10,60,false);    //�滭̹���ұ�����
                g.fill3DRect(x + 10,y + 10,20,40,false);  //�滭̹���м����
                g.fillOval(x + 10,y + 20,20,20);          //�滭ԪԲ�θ���
                g.drawLine(x + 20,y + 30,x + 20,y);       //�滭��Ͳ
                break;
//           ����
            case 1:
                g.fill3DRect(x,y,60,10,false);          //�滭̹���������
                g.fill3DRect(x ,y+ 30,60,10,false);    //�滭̹���ұ�����
                g.fill3DRect(x + 10,y + 10,40,20,false);  //�滭̹���м����
                g.fillOval(x + 20,y + 10,20,20);          //�滭ԪԲ�θ���
                g.drawLine(x + 20,y + 20,x + 60,y+20);       //�滭��Ͳ
                break;
//           ����
            case 2:
                g.fill3DRect(x,y,10,60,false);          //�滭̹���������
                g.fill3DRect(x + 30,y,10,60,false);    //�滭̹���ұ�����
                g.fill3DRect(x + 10,y + 10,20,40,false);  //�滭̹���м����
                g.fillOval(x + 10,y + 20,20,20);          //�滭ԪԲ�θ���
                g.drawLine(x + 20,y + 30,x + 20,y+60);       //�滭��Ͳ
                break; //           ����
            case 3:
                g.fill3DRect(x,y,60,10,false);          //�滭̹���������
                g.fill3DRect(x ,y+ 30,60,10,false);    //�滭̹���ұ�����
                g.fill3DRect(x + 10,y + 10,40,20,false);  //�滭̹���м����
                g.fillOval(x + 20,y + 10,20,20);          //�滭ԪԲ�θ���
                g.drawLine(x + 20,y + 20,x ,y+20);       //�滭��Ͳ
                break;
            default:
                System.out.println("��δ����");
        }

    }
    public void drawBullet(int x,int y,Graphics g,int type){
        //�����Լ��ӵ�������
        switch (type) {
            case 0:
                g.fill3DRect(myTank.bullet.getX(),myTank.bullet.getY(),3,3,false);

                break;        }
    }


    //��ĳ������������
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
//        System.out.println((char)e.getKeyCode() +"������");
//        �����û����²�ͬ�İ���������С����ƶ�
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            myTank.setDirect(2);
            myTank.moveDown();
        }else if (e.getKeyCode() == KeyEvent.VK_UP) {
            myTank.setDirect(0);
            myTank.moveUp();
        }else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            myTank.setDirect(3);
            myTank.moveLeft();
        }else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            myTank.setDirect(1);
            myTank.moveRight();
        }else if (e.getKeyCode() == KeyEvent.VK_J) {
            System.out.println("����!!!!");
            myTank.shotEnemyTank();
        }
        this.repaint();//ʹ�����ػ�
    }
    @Override
    public void keyReleased(KeyEvent arg0) {
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
    }

    @Override
    public void run() {
        while (loop){
//            ˯��
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            �ػ����
            repaint();
        }
    }
}