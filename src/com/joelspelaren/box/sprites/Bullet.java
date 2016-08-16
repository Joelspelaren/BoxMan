package com.joelspelaren.box.sprites;


public class Bullet extends Sprite {

	public Bullet(int x, int y) {
		super(x, y);
		
	}

	public void move(){
		 x = x + 3;
	}
	public void initBullet(){
		loadImage("resources/bullet.png");

		getImageDimensions();
	}
}
