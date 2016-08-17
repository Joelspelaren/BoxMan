package com.joelspelaren.box.sprites;


public class Bullet extends Sprite {
	
	private int xDirection;
	private int yDirection;

	public Bullet(int x, int y, int xDirection, int yDirection) {
		super(x, y);
		this.xDirection = xDirection;
		this.yDirection = yDirection;
		
	}

	public void move(){
		 x = x + xDirection;
	}
	public void initBullet(){
		loadImage("resources/bullet.png");

		getImageDimensions();
	}
}
