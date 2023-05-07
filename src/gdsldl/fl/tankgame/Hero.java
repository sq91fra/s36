package gdsldl.fl.tankgame;

public class Hero extends Tank {
	 Bullet bullet = null;

	public Hero(int x, int y) {
		super(x, y);
	}
	public Hero(int x, int y,int type) {
		super(x, y, type);
	}

	public void shotEnemyTank(){
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
		new Thread(bullet).start();
	}

}
