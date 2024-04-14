package _01_methods._1_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot();	
	public void run() {
		// Check the recipe to find out what code to put here
		rob.setX(5);
		rob.setY(400);
		rob.setSpeed(30);
		rob.penDown();
		int number = 0;
		Random ran = new Random();
		Color color = new Color(255,0,0);
		for(int i=0; i<10; i++) {
			number = ran.nextInt(2-0+1)+0;
			color = new Color(ran.nextInt(255),ran.nextInt(255),ran.nextInt(255));
			if(number==0) {
				houses("small", color);
			}
			else if(number==1) {
				houses("medium", color);
			}
			else {
				houses("large", color);
			}
		}
		rob.hide();
	}
	public void houses(String height, Color color) {
		rob.setPenColor(color);
		if(height.equals("small")) {
			rob.move(60);
			drawPointyRoof();
			rob.move(60);
		}
		else if(height.equals("medium")) {
			rob.move(120);
			drawPointyRoof();
			rob.move(120);
		}
		else {
			rob.move(250);
			drawFlatRoof();
			rob.move(250);
		}
		rob.setPenColor(0,255,0);
		rob.turn(-90);
		rob.move(25);
		rob.turn(-90);
	}
	public void drawFlatRoof() {
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
	}
	public void drawPointyRoof() {
		rob.turn(45);
		rob.move(25);
		rob.turn(90);
		rob.move(25);
		rob.setAngle(180);
	}
}