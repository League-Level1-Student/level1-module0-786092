package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

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
    int pipeWidth = 50;
    PImage back;
    PImage pipeBottom;
    PImage pipeTop;
    PImage bird;
    boolean gameOver = false;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        pipeHeight = (int)random(100,400);
        back = loadImage("flappyBackground.jpg");
        pipeBottom = loadImage("bottomPipe.png");
        pipeTop = loadImage("topPipe.png");
        bird = loadImage("bird.png");
        bird.resize(50,50);
        back.resize(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
    	pipeTop.resize(pipeWidth, pipeHeight);
    	pipeBottom.resize(pipeWidth, HEIGHT);
        background(back);
        fill(255,0,0);
        image(bird,x,y);
        y+=birdVelocity;
        birdVelocity+=gravity;
        fill(0,255,0);
        pipeX -= 5;
        image(pipeTop,pipeX,0);
        if(pipeX<0) {
        	pipeX = 800;
        	pipeHeight = (int)random(100,400);
        }
         lowerY = pipeHeight+pipeGap;
         image(pipeBottom, pipeX, lowerY);
         if(intersectPipes()|| y>HEIGHT) {
        	 gameOver = true;
         }
         if(gameOver) {
        	 fill(0,0,0);
        	 rect(0,0,WIDTH,HEIGHT);
        	 fill(255,0,0);
        	 textSize(40);
        	 text("Game Over!", 300, 300);
         }
    }
    @Override
    public void mousePressed() {
    	birdVelocity = -10;
    	
    }
    boolean intersectPipes() {
    	if(y < pipeHeight && x > pipeX && x < (pipeX+pipeWidth)) {
    		return true;
    	}
    	else if(y > lowerY && x > pipeX && x < (pipeX+pipeWidth)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
