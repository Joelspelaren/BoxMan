package com.joelspelaren.box;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.Timer;

import com.joelspelaren.box.sprites.BoxMan;
import com.joelspelaren.box.sprites.Bullet;


public class Board extends JPanel implements ActionListener {

	private BoxMan boxMan;
	private int wepSel = 0;
	private List<Bullet> bullets;
	private Timer timer;
	public boolean gun = false;
	public boolean right;

	public Board(){

		gun = false;
		addKeyListener(new TAdapter());
		setFocusable(true);
		boxMan = new BoxMan(30, 30);
		bullets = new ArrayList<Bullet>();
		timer = new Timer(30,this);
		timer.start();
		setBackground(Color.BLUE);

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.LIGHT_GRAY);
		//g.drawLine(0, 200, 400, 200);
		//g.drawRect(0, 200, 400, 10);
		g.fillRect(0, 180, 400, 160);
		g.setColor(Color.GRAY);
		g.fillRect(20, 180, 70, -150);
                g.fillRect(100, 180, 80, -100);
		g.drawImage(boxMan.getImage(), boxMan.getX(), boxMan.getY(), this);
		paintBullets(g);
	}

	private void paintBullets(Graphics g) {
		for(Bullet bullet:bullets){
			g.drawImage(bullet.getImage(), bullet.getX(), bullet.getY(), this);
		}
		
	}



	private class TAdapter extends KeyAdapter {

		public boolean right;

		public void keyReleased(KeyEvent e) {

			//System.out.println("Tangent släppt");
			//	            player.keyReleased(e);
		}

		public void keyPressed(KeyEvent e) {
			//System.out.println("Tangent tryckt");
			int key = e.getKeyCode();

			if (key == KeyEvent.VK_RIGHT){
				right = true;
				boxMan.moveRight();
				gun = false;

			} else if (key == KeyEvent.VK_LEFT){
				right = false;
				boxMan.moveLeft();
				gun = false;

			} else if (key == KeyEvent.VK_SPACE){

				if(gun == false){
					gun = true;
					if(right == false){
						boxMan.imageIndex = 31;
					}else if(right == true){
						boxMan.imageIndex = 36;
					}
				}else{
					bullets.add(new Bullet(boxMan.getX(), boxMan.getY()));
				}

				//				if(shoot){
				//					bullets.add(new Bullet(x,y,riktning,visible));
				//				}
			} else if (key == KeyEvent.VK_UP){

				boxMan.jump();
			}

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boxMan.physiks();
		moveBullets();
		repaint();
	}

	private void moveBullets() {
		for(Bullet bullet:bullets){
			bullet.move();
			}
		}
		
	}




