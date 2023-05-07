package gdsldl.fl.tankgame.tank4;

public class Bullet  implements Runnable{//子弹类
    private int x;
    private int y;
    int type;
    int direct ;
    int speed = 10;
    boolean isLive = true;

    public Bullet(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //	可以在此处设置子弹的移动
    public void moveUp(){
        y -= speed;
    }public void moveDown(){
        y += speed;
    }public void moveLeft(){
        x -= speed;
    }public void moveRight(){
        x += speed;
    }
    @Override
    public void run() {
        while (true){
            try {//休眠
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            根据方向改变x,y坐标
            switch (direct){
                case 0:
                    moveUp();
                    break;
                case 1:
                    moveRight();
                    break;
                case 2:
                    moveDown();
                    break;
                case  3:
                    moveLeft();
                    break;
            }
//            System.out.println("bullet："+x+","+y);

            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750) && isLive){
                isLive = false;
                break;//如果子弹移动到面板边界就销毁
            }
        }

    }
}
