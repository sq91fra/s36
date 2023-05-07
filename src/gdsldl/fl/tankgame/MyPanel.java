package gdsldl.fl.tankgame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.JPanel;

//为了让Panel不停重绘，需要将MyPanel实现Runnable
public class MyPanel extends JPanel implements KeyListener,Runnable{
    //定义坦克
    public Hero myTank = null;
    //    敌人的数量多，可以放入集合Vector中
    public Vector<EnemyTank> enemies = new Vector<>();
    public int len = 3;
    public boolean loop = true;

    public MyPanel(){
        //初始化坦克
        myTank = new Hero(400,400);
//        初始化敌人
        for (int i = 0; i < len; i++) {
            EnemyTank temp = new EnemyTank(100*(i+1), 0,2);
            temp.setDirect(2);
            enemies.add(temp);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);    //绘画区域填充矩形，默认黑色
        drawTanke(myTank.getX(),myTank.getY(),g,myTank.getDirect(),0);     //绘制坦克
        if (myTank.bullet != null && myTank.bullet.isLive == true) {
            drawBullet(myTank.getX(),myTank.getY(),g,0);
        }
//        int len = enemies.size();
        for (int i = 0; i < len; i++) {
            drawTanke(enemies.get(i).getX(),enemies.get(i).getY(),g,enemies.get(i).getDirect(),enemies.get(i).getType());
        }

    }

    //编写绘画坦克的方法
    /*
     *   x : 坦克左上角x坐标
     *   y : 坦克左上角y坐标
     *   g： 画笔
     *   direct : 坦克方向
     *   type : 坦克类型
     * */    public void drawTanke(int x,int y,Graphics g,int direct,int type){
        switch (type) {
            case 0:     //设置自己坦克的颜色
                g.setColor(Color.cyan);
                break;            case 1:     //设置敌方坦克颜色
                g.setColor(Color.green);
                break;            case 2:     //设置敌方坦克颜色
                g.setColor(Color.red);
                break;        }
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
    public void drawBullet(int x,int y,Graphics g,int type){
        //设置自己子弹的种类
        switch (type) {
            case 0:
                g.fill3DRect(myTank.bullet.getX(),myTank.bullet.getY(),3,3,false);

                break;        }
    }


    //有某个按键被按下
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
//        System.out.println((char)e.getKeyCode() +"被按下");
//        根据用户按下不同的按键，处理小球的移动
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
            System.out.println("开炮!!!!");
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
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            重绘界面
            repaint();
        }
    }
}