package com.joelspelaren.box.sprites;

public class BoxMan extends Sprite {

	private boolean closeToEnemy;
	private int YVel;
	public int gravity = 1;
	private boolean right;

	public BoxMan(int x, int y) {
		super(x, y);
		initBoxMan();
	}

	private void initBoxMan() {
		loadImage("resources/costume1.png");
		loadImage("resources/costume2.png");
		loadImage("resources/costume3.png");
		loadImage("resources/costume4.png");
		loadImage("resources/costume5.png");
		loadImage("resources/costume6.png");
		loadImage("resources/costume7.png");
		loadImage("resources/costume8.png");
		loadImage("resources/costume9.png");
		loadImage("resources/costume10.png");
		loadImage("resources/costume11.png");
		loadImage("resources/costume12.png");
		loadImage("resources/costume13.png");
		loadImage("resources/costume14.png");
		loadImage("resources/costume15.png");
		loadImage("resources/costume16.png");
		loadImage("resources/costume17.png");
		loadImage("resources/costume18.png");
		loadImage("resources/costume19.png");
		loadImage("resources/costume20.png");
		loadImage("resources/attack.png");
		loadImage("resources/attack1.png");
		loadImage("resources/attack2.png");
		loadImage("resources/attack3.png");
		loadImage("resources/attack4.png");
		loadImage("resources/attack5.png");
		loadImage("resources/attack6.png");
		loadImage("resources/attack7.png");
		loadImage("resources/attack8.png");
		loadImage("resources/gunning1.png");
		loadImage("resources/gunning2.png");
		loadImage("resources/gunning3.png");
		loadImage("resources/gunning walk.png");
		loadImage("resources/gunning walk2.png");
		loadImage("resources/gunning walk3.png");
		loadImage("resources/gunning walk4.png");
		loadImage("resources/gunning right.png");

		getImageDimensions();

	}

	public void physiks(){
		if(y > 160){
			YVel = YVel * 1;
			y = y + YVel;
			YVel = 0;
		}else{
			YVel = YVel + gravity;
			y = y + YVel;
		}
	}

	public void moveRight(){
		x = x + 2;
		right = true;
		if(imageIndex < 10){
			imageIndex++;
		}else{
			imageIndex = 0;
		}
	}

	public void moveLeft() {
		x = x - 2;
		right = false;
		if(imageIndex < 20){
			imageIndex++;
		}else{
			imageIndex = 10;
		}
		
	}
	
	public void gun() {

		imageIndex = 31;
		
	}

}
