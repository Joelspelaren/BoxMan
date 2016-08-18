package com.joelspelaren.box.sprites;

public class BoxMan extends Sprite {

	private boolean closeToEnemy;
	private int YVel;
	public int gravity = 1;
	private boolean right;
	private int xDirection;
	private int yDirection;
	private int gun;

	public BoxMan(int x, int y) {
		super(x, y);
		initBoxMan();
		gun = 0;
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
		loadImage("resources/gunning walk5.png");
		loadImage("resources/gunning right.png");

		getImageDimensions();

	}

	public void physiks(){
		if(y > 160){
			YVel = YVel * 1;
			y = y + YVel;
			YVel = 1;
			YVel = YVel * -1;
		}else{
			YVel = YVel + gravity;
			y = y + YVel;
		}
	}

    public void jump() {
        YVel = YVel - 10;
        y = y + YVel;
    }
    
    public void moveRelease(){
    	xDirection = 0;
    	yDirection = 0;
    }

    public void moveRight() {
    	right = true;
    	xDirection = 2;
		if(imageIndex < 10){
			imageIndex++;
		}else{
			imageIndex = 0;
		}
	}

    public void moveLeft() {
    	right = false;
    	xDirection = -2;
    	if(gun == 0){
    		if(imageIndex < 19){
    			imageIndex++;
    		}else{
    			imageIndex = 10;
    		}
    	} else if(gun == 1) {
    		if(imageIndex < 31){
    			imageIndex = 31;
    		} else if(imageIndex < 34){
    			imageIndex++;
    		}else{
    			imageIndex = 31;
    		}
    	}

    }
	
	public void gun() {
		if(gun == 0){
			gun = 1;
                        if(right){
                            imageIndex = 31;
                        } else {
                            imageIndex = 32;
                        }
		} else {
			gun = 0;
			imageIndex = 0;
		}
		
	}
	
	public Bullet shot() {
		Bullet bullet = null;
		if(gun != 0){
			int xDirection;
//			if(this.xDirection > 0){
//				xDirection = 7;
//			} else {
//				xDirection = - 7;
//			}
			if(right){
				xDirection = 7;
			} else {
				xDirection = - 7;
			}
			bullet = new Bullet(getX(), getY(), xDirection, 0);
			bullet.initBullet();
		}
		return bullet;
	}

	public void move() {
		this.x += xDirection;
		this.y += yDirection;
		physiks();
		
	}

}
