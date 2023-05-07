package gdsldl.fl.tankgame.tank4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Iterator;
import java.util.Vector;

//为了让Panel不停重绘，需要将MyPanel实现Runnable
public class MyPanel extends JPanel implements KeyListener,Runnable{
    //定义坦克
    public Hero myTank = null;
    //    敌人的数量多，可以放入集合Vector中
    public Vector<EnemyTank> enemies = new Vector<>();
    //    定义死后爆炸效果
    public Vector<Bomb> bombs = new Vector<>();

    //    定义爆炸需要的图片
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;
    public int len = 3;
    public boolean loop = true;


    public MyPanel(){
        //初始化坦克
        myTank = new Hero(400,400);
//        初始化敌人
        for (int i = 0; i < len; i++) {
            EnemyTank temp = new EnemyTank(100*(i+1), 0,2);
            temp.setDirect(2);
            Bullet bullet = new Bullet(temp.getX() + 20, temp.getY() + 60, temp.getDirect());
            temp.bullets.add(bullet);
            new Thread(bullet).start();
            enemies.add(temp);
            new Thread(temp).start();//启动敌方坦克线程
        }
//        初始化图片
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_0.png"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.png"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.png"));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);    //绘画区域填充矩形，默认黑色

        //绘制我方坦克
        drawTank(myTank.getX(),myTank.getY(),g,myTank.getDirect(),0);
//单颗子弹
        //        if (myTank.bullet != null && myTank.bullet.isLive == true) {
//            drawBullet(myTank.getX(),myTank.getY(),g,0);
//        }
//多颗子弹
            for (int i = 0; i < myTank.bullets.size(); i++) {
                Bullet bullet = myTank.bullets.get(i);
                if (bullet != null && bullet.isLive) {
                    drawBullet(bullet.getX(), bullet.getY(), g, 0);
                }else {
                    myTank.bullets.remove(bullet);
                }
            }

        //绘制敌人坦克
//        虽然Vector类是线程安全的，但由于在多线程环境下可能存在并发修改的情况，
//        因此在需要迭代遍历Vector集合时，建议使用Iterator迭代器来保证线程安全。
        Iterator<EnemyTank> iterator = enemies.iterator();
        while (iterator.hasNext()) {
            EnemyTank enemyTank =  iterator.next();
            if ( enemyTank.isLive){
                drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),enemyTank.getType());
//            遍历绘制敌人坦克子弹
                Vector<Bullet> bullets = enemyTank.bullets;
                for (int j = 0; j < bullets.size(); j++) {
                    if (bullets.get(j).isLive){//如果子弹存活
                        g.draw3DRect(bullets.get(j).getX(),bullets.get(j).getY(),2,2,false);
                    }else{
//                    从vector中移除该子弹
                        bullets.remove(j);
                    }
                }
            }
        }

//        绘制爆炸效果
        for (int i = 0; i < bombs.size(); i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            取出炸弹
            Bomb bomb = bombs.get(i);
//            绘制炸弹
            for (int j = 0; j < bomb.time; j++) {
                if (bomb.time > 9){
                    g.drawImage(image1,bomb.x,bomb.y,60,60,this);
                }else if(bomb.time > 3){
                    g.drawImage(image2,bomb.x,bomb.y,60,60,this);
                }else{
                    g.drawImage(image3,bomb.x,bomb.y,60,60,this);
                }
                bomb.bombDown();
//            如果爆炸周期结束就移除炸弹
                if (bomb.time <= 0){
                    bombs.remove(bomb);
                }
//                第一个 出现不来 完全是执行速度的问题，循环炸弹的时候，休眠一下就可以解决，最好是做一个异步处理。

            }
        }

    }

    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0:     //设置自己坦克的颜色
                g.setColor(Color.cyan);
                break;
            case 1:     //设置敌方坦克颜色
                g.setColor(Color.green);
                break;
            case 2:     //设置敌方坦克颜色
                g.setColor(Color.red);
                break;
        }
        //根据方向绘制坦克
        switch(direct){
//        向上
            case 0:
                g.fill3DRect(x,y,10,60,false);          //绘画坦克左边轮子
                g.fill3DRect(x + 30,y,10,60,false);    //绘画坦克右边轮子
                g.fill3DRect(x + 10,y + 10,20,40,false);  //绘画坦克中间盖子
                g.fillOval(x + 10,y + 20,20,20);          //绘画元圆形盖子
                g.drawLine(x + 20,y + 30,x + 20,y);       //绘画炮筒
                break;
//           向右
            case 1:
                g.fill3DRect(x,y,60,10,false);          //绘画坦克左边轮子
                g.fill3DRect(x ,y+ 30,60,10,false);    //绘画坦克右边轮子
                g.fill3DRect(x + 10,y + 10,40,20,false);  //绘画坦克中间盖子
                g.fillOval(x + 20,y + 10,20,20);          //绘画元圆形盖子
                g.drawLine(x + 20,y + 20,x + 60,y+20);       //绘画炮筒
                break;
//           向下
            case 2:
                g.fill3DRect(x,y,10,60,false);          //绘画坦克左边轮子
                g.fill3DRect(x + 30,y,10,60,false);    //绘画坦克右边轮子
                g.fill3DRect(x + 10,y + 10,20,40,false);  //绘画坦克中间盖子
                g.fillOval(x + 10,y + 20,20,20);          //绘画元圆形盖子
                g.drawLine(x + 20,y + 30,x + 20,y+60);       //绘画炮筒
                break; //           向左
            case 3:
                g.fill3DRect(x,y,60,10,false);          //绘画坦克左边轮子
                g.fill3DRect(x ,y+ 30,60,10,false);    //绘画坦克右边轮子
                g.fill3DRect(x + 10,y + 10,40,20,false);  //绘画坦克中间盖子
                g.fillOval(x + 20,y + 10,20,20);          //绘画元圆形盖子
                g.drawLine(x + 20,y + 20,x ,y+20);       //绘画炮筒
                break;
            default:
                System.out.println("暂未处理");
        }

    }

    public void drawBullet(int x, int y, Graphics g, int type) {
        //设置自己子弹的种类
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
//        判断子弹击中坦克
        switch (temp.getDirect()){
            case 0://处理上下
            case 2:
                if (b.getX() > temp.getX() &&b.getX() < temp.getX()+40
                        && b.getY() > temp.getY() &&b.getY() < temp.getY()+60) {
                    b.isLive = false;
                    temp.isLive = false;
//                    移除被击中的坦克
                    enemies.remove(enemyTank);
//                    爆炸
                    Bomb bomb = new Bomb(temp.getX(), temp.getY());
//                    添加炸弹
                    bombs.add(bomb);
                }
            case 1://处理左右
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

    //有某个按键被按下
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
//        System.out.println((char)e.getKeyCode() +"被按下");
//        根据用户按下不同的按键，处理坦克的移动
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
//            单颗子弹
//            if (myTank.bullet == null || !(myTank.bullet.isLive))
            myTank.shotEnemyTank();

        }
        this.repaint();//使画板重绘
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
//            睡眠
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//            判断是否击中敌人
//            if (myTank.bullet != null && myTank.bullet.isLive) {//如果自己的子弹存活
//                for (int i = 0; i < enemies.size(); i++) {
//                    EnemyTank enemyTank = enemies.get(i);
//                    hitEnemy(myTank.bullet,enemyTank);
//                }
//            }
//            多子弹
            Iterator<Bullet> bulletIterator = myTank.bullets.iterator();
            while (bulletIterator.hasNext()) {
                Bullet bullet =  bulletIterator.next();
                if (bullet != null && bullet.isLive) {//如果自己的子弹存活
                    for (int i = 0; i < enemies.size(); i++) {
                        EnemyTank enemyTank = enemies.get(i);
                        hitEnemy(bullet,enemyTank);
                    }
                }
            }

//            重绘界面
            repaint();
        }
    }
}