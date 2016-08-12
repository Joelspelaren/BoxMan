package com.joelspelaren.box;

import javax.swing.JFrame;

import com.joelspelaren.box.Board;
import com.joelspelaren.box.Box;

public class Box extends JFrame {
	
	public Box (){
		add(new Board());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,250);
        setLocationRelativeTo(null);
	}
	
public static void main(String[] args){
		new Box();
	}
}
