package _01_methods._1_houses;

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
		for(int i=0; i<10; i++) {
			number = ran.nextInt(2-0+1)+0;
			if(number==0) {
				houses("small");
			}
			else if(number==1) {
				houses("medium");
			}
			else {
				houses("large");
			}
		}
		rob.hide();
	}
	public void houses(String height) {
		if(height.equals("small")) {
			rob.move(60);
			drawFlatRoof();
			rob.move(60);
		}
		else if(height.equals("medium")) {
			rob.move(120);
			drawFlatRoof();
			rob.move(120);
		}
		else {
			rob.move(250);
			drawFlatRoof();
			rob.move(250);
		}
		rob.turn(-90);
		rob.move(25);
		rob.turn(-90);
	}
	public void drawFlatRoof() {
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
	}
}
