package gdsldl.fl.tankgame.tank4;


public class Tank {
private int x;
private int y;
private int direct = 0;
private int speed = 6;
private int type = 0;
boolean isLive = true;

public Tank(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}

	public Tank(int x, int y, int type) {
		this.x = x;
		this.y = y;
		this.type = type;
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getDirect() {
		return direct;
	}
	public void setDirect(int direct) {
		this.direct = direct;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//	可以在此处设置坦克的移动
	public void moveUp() {
		if (getY() > 0) {//增加向上的条件，防止坦克越界
			y -= speed;
		}
	}

	public void moveDown() {
		if (getY() + 60 < 720)
			y += speed;
	}

	public void moveLeft() {
		if (getX() > 0)
			x -= speed;
	}

	public void moveRight() {
		if (getX() + 60 < 1000)
			x += speed;
	}
}