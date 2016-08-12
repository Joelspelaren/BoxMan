package com.joelspelaren.box.sprites;

import com.joelspelaren.box.Board;

public class Bullet extends Sprite {

	private Object board;
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
