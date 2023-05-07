package gdsldl.fl.tankgame.tank4;

public class Bomb {//坦克爆炸的效果
    int x ;
    int y;
    int time = 9;//生命周期
    boolean isLive = true;

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void bombDown(){
        if (time > 0) {
            time --;
        }else {
            isLive = false;
        }
    }
}
