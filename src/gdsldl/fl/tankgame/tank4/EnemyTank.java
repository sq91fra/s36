package gdsldl.fl.tankgame.tank4;

import java.util.Vector;
//敌方坦克可以自由移动，也是一个线程
public class EnemyTank extends Tank implements Runnable{

    Vector<Bullet> bullets = new Vector<>();

    public EnemyTank(int x, int y) {
        super(x,y);
    }

    public EnemyTank(int x, int y, int type) {
        super(x,y,type);
    }

    @Override
    public void run() {
    while (true){
        //        移动
        int wheel = (int)(Math.random()*60);
        switch (super.getDirect()) {

            case 0://上
                for (int i = 0; i < wheel; i++) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    moveUp();

                }
                break;
            case 1://右
                for (int i = 0; i < wheel; i++) {
                    if (getX() + 60 < 1000) {
                        moveRight();
                    }
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                break;
            case 2://下
                for (int i = 0; i < wheel; i++) {
                    moveDown();

                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 3://左
                for (int i = 0; i < wheel; i++) {
                    moveLeft();
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                break;
        }

//        转向
        setDirect((int) (Math.random() * 4));
//        设置线程结束条件
        if (!isLive) {
            break;
        }
    }
    }
}