package gdsldl.fl.tankgame.tank4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Iterator;
import java.util.Vector;

//Ϊ����Panel��ͣ�ػ棬��Ҫ��MyPanelʵ��Runnable
public class MyPanel extends JPanel implements KeyListener,Runnable{
    //����̹��
    public Hero myTank = null;
    //    ���˵������࣬���Է��뼯��Vector��
    public Vector<EnemyTank> enemies = new Vector<>();
    //    ��������ըЧ��
    public Vector<Bomb> bombs = new Vector<>();

    //    ���屬ը��Ҫ��ͼƬ
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;
    public int len = 3;
    public boolean loop = true;


    public MyPanel(){
        //��ʼ��̹��
        myTank = new Hero(400,400);
//        ��ʼ������
        for (int i = 0; i < len; i++) {
            EnemyTank temp = new EnemyTank(100*(i+1), 0,2);
            temp.setDirect(2);
            Bullet bullet = new Bullet(temp.getX() + 20, temp.getY() + 60, temp.getDirect());
            temp.bullets.add(bullet);
            new Thread(bullet).start();
            enemies.add(temp);
            new Thread(temp).start();//�����з�̹���߳�
        }
//        ��ʼ��ͼƬ
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_0.png"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.png"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.png"));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);    //�滭���������Σ�Ĭ�Ϻ�ɫ

        //�����ҷ�̹��
        drawTank(myTank.getX(),myTank.getY(),g,myTank.getDirect(),0);
//�����ӵ�
        //        if (myTank.bullet != null && myTank.bullet.isLive == true) {
//            drawBullet(myTank.getX(),myTank.getY(),g,0);
//        }
//����ӵ�
            for (int i = 0; i < myTank.bullets.size(); i++) {
                Bullet bullet = myTank.bullets.get(i);
                if (bullet != null && bullet.isLive) {
                    drawBullet(bullet.getX(), bullet.getY(), g, 0);
                }else {
                    myTank.bullets.remove(bullet);
                }
            }

        //���Ƶ���̹��
//        ��ȻVector�����̰߳�ȫ�ģ��������ڶ��̻߳����¿��ܴ��ڲ����޸ĵ������
//        �������Ҫ��������Vector����ʱ������ʹ��Iterator����������֤�̰߳�ȫ��
        Iterator<EnemyTank> iterator = enemies.iterator();
        while (iterator.hasNext()) {
            EnemyTank enemyTank =  iterator.next();
            if ( enemyTank.isLive){
                drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),enemyTank.getType());
//            �������Ƶ���̹���ӵ�
                Vector<Bullet> bullets = enemyTank.bullets;
                for (int j = 0; j < bullets.size(); j++) {
                    if (bullets.get(j).isLive){//����ӵ����
                        g.draw3DRect(bullets.get(j).getX(),bullets.get(j).getY(),2,2,false);
                    }else{
//                    ��vector���Ƴ����ӵ�
                        bullets.remove(j);
                    }
                }
            }
        }

//        ���Ʊ�ըЧ��
        for (int i = 0; i < bombs.size(); i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            ȡ��ը��
            Bomb bomb = bombs.get(i);
//            ����ը��
            for (int j = 0; j < bomb.time; j++) {
                if (bomb.time > 9){
                    g.drawImage(image1,bomb.x,bomb.y,60,60,this);
                }else if(bomb.time > 3){
                    g.drawImage(image2,bomb.x,bomb.y,60,60,this);
                }else{
                    g.drawImage(image3,bomb.x,bomb.y,60,60,this);
                }
                bomb.bombDown();
//            �����ը���ڽ������Ƴ�ը��
                if (bomb.time <= 0){
                    bombs.remove(bomb);
                }
//                ��һ�� ���ֲ��� ��ȫ��ִ���ٶȵ����⣬ѭ��ը����ʱ������һ�¾Ϳ��Խ�����������һ���첽����

            }
        }

    }

    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0:     //�����Լ�̹�˵���ɫ
                g.setColor(Color.cyan);
                break;
            case 1:     //���õз�̹����ɫ
                g.setColor(Color.green);
                break;
            case 2:     //���õз�̹����ɫ
                g.setColor(Color.red);
                break;
        }
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

    public void drawBullet(int x, int y, Graphics g, int type) {
        //�����Լ��ӵ�������
        switch (type) {
            case 0:
                g.fill3DRect(x, y, 3, 3, false);
                break;
            case 1:
                g.setColor(Color.red);
                g.fill3DRect(x, y, 3, 3, false);
                break;
        }
    }

    public void hitEnemy(Bullet b, EnemyTank enemyTank){
        EnemyTank temp = enemyTank;
//        �ж��ӵ�����̹��
        switch (temp.getDirect()){
            case 0://��������
            case 2:
                if (b.getX() > temp.getX() &&b.getX() < temp.getX()+40
                        && b.getY() > temp.getY() &&b.getY() < temp.getY()+60) {
                    b.isLive = false;
                    temp.isLive = false;
//                    �Ƴ������е�̹��
                    enemies.remove(enemyTank);
//                    ��ը
                    Bomb bomb = new Bomb(temp.getX(), temp.getY());
//                    ���ը��
                    bombs.add(bomb);
                }
            case 1://��������
            case 3:
                if (b.getX() > enemyTank.getX() && b.getX() < enemyTank.getX() + 60
                        && b.getY() > enemyTank.getY() && b.getY() < enemyTank.getY() + 40) {
                    b.isLive = false;
                    temp.isLive = false;
                    enemies.remove(enemyTank);
                    Bomb bomb = new Bomb(temp.getX(), temp.getY());
                    bombs.add(bomb);
                }
        }
    }

    //��ĳ������������
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
//        System.out.println((char)e.getKeyCode() +"������");
//        �����û����²�ͬ�İ���������̹�˵��ƶ�
        if (e.getKeyCode() == KeyEvent.VK_S) {
            myTank.setDirect(2);
            myTank.moveDown();
        }else if (e.getKeyCode() == KeyEvent.VK_W) {
            myTank.setDirect(0);
            myTank.moveUp();
        }else if (e.getKeyCode() == KeyEvent.VK_A) {
            myTank.setDirect(3);
            myTank.moveLeft();
        }else if (e.getKeyCode() == KeyEvent.VK_D) {
            myTank.setDirect(1);
            myTank.moveRight();
        }else if ( e.getKeyCode() == KeyEvent.VK_J  ) {
//            �����ӵ�
//            if (myTank.bullet == null || !(myTank.bullet.isLive))
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
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//            �ж��Ƿ���е���
//            if (myTank.bullet != null && myTank.bullet.isLive) {//����Լ����ӵ����
//                for (int i = 0; i < enemies.size(); i++) {
//                    EnemyTank enemyTank = enemies.get(i);
//                    hitEnemy(myTank.bullet,enemyTank);
//                }
//            }
//            ���ӵ�
            Iterator<Bullet> bulletIterator = myTank.bullets.iterator();
            while (bulletIterator.hasNext()) {
                Bullet bullet =  bulletIterator.next();
                if (bullet != null && bullet.isLive) {//����Լ����ӵ����
                    for (int i = 0; i < enemies.size(); i++) {
                        EnemyTank enemyTank = enemies.get(i);
                        hitEnemy(bullet,enemyTank);
                    }
                }
            }

//            �ػ����
            repaint();
        }
    }
}