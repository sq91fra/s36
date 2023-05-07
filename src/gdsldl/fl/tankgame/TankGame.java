package gdsldl.fl.tankgame;

import javax.swing.JFrame;

public class TankGame extends JFrame{
	MyPanel tp = null;

	public TankGame(){
		super();
		this.tp = new MyPanel();
		new Thread(tp).start();
		this.add(tp);
		
		this.setSize(1000,750);
		this.addKeyListener(tp);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new TankGame();
	}
	
}
