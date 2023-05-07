package gdsldl.fl.tankgame.tank4;

import java.util.Vector;

public class Hero extends Tank {
	 Bullet bullet = null;
//	 使坦克可以发多个子弹
	Vector<Bullet> bullets = new Vector<>();
	public Hero(int x, int y) {
		super(x, y);
	}
	public Hero(int x, int y,int type) {
		super(x, y, type);
	}

	public void shotEnemyTank(){
//		限制坦克至多发出5颗子弹
		if (bullets.size() == 5){
			return;
		}
		switch (getDirect()){
			case 0://向上
				bullet = new Bullet(getX() + 20, getY(), 0);
				break;
			case 1://向右
				bullet = new Bullet(getX() + 60, getY() +20, 1);
				break;
			case 2://向下
				bullet = new Bullet(getX() + 20, getY(), 2);
				break;
			case 3://向左
				bullet = new Bullet(getX(), getY()+20, 3);
				break;

		}
//		启动bullet线程
		bullets.add(bullet);
		new Thread(bullet).start();
	}

}
