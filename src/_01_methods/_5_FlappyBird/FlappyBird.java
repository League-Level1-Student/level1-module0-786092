package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 200;
    int y = 300;
    int birdVelocity = -10;
    int gravity = 1;
    int pipeX = 800;
    int pipeHeight = 300;
    int pipeGap = 100;
    int lowerY = 0;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        pipeHeight = (int)random(100,400);
    }

    @Override
    public void draw() {
        background(0,0,255);
        fill(255,0,0);
        ellipse(x,y,50,50);
        y+=birdVelocity;
        birdVelocity+=gravity;
        fill(0,255,0);
        pipeX -= 5;
        rect(pipeX, 0, 50, pipeHeight);
        if(pipeX<0) {
        	pipeX = 800;
        	pipeHeight = (int)random(100,400);
        }
         lowerY = pipeHeight+pipeGap;
    }
    @Override
    public void mousePressed() {
    	birdVelocity = -10;
    	
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
