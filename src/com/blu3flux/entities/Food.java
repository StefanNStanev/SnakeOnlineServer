package com.blu3flux.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import com.blu3flux.Constants;

public class Food extends Entity{
	
	public Food(int x, int y) {
		this.X = x;
		this.Y = y;
	}
	
	public Food() {
		this.X = new Random().nextInt(40) * Constants.size;		//TODO: Replace magic numbers
		this.Y = new Random().nextInt(40) * Constants.size;
	}
	
	public void reset() {
		this.X = new Random().nextInt(40) * Constants.size;		//TODO: Replace magic numbers
		this.Y = new Random().nextInt(40) * Constants.size;
	}
	
	@Override
	public void tick() {
		
	}
	
	@Override
	public void render(Graphics g, Color c, int offsetX, int offsetY) {
		g.setColor(c);
		g.fillRect(offsetX+X, offsetY+Y, Constants.size, Constants.size);
	}
	
}
