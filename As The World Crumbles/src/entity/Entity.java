package entity;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;

public class Entity {
	
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	
	protected int xVel;
	protected int yVel;
	
	protected Rectangle rect;
	
	public Entity(int x, int y, int xV, int yV, int w, int h){
		this.x = x;
		this.y = y;
		xVel = xV;
		yVel = yV;
		width = w;
		height = h;
		rect = new Rectangle(x, y, 32, 32);
	}
	
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getXVelocity() {
		return xVel;
	}

	public void setXVelocity(int xVel) {
		this.xVel = xVel;
	}

	public int getYVelocity() {
		return yVel;
	}

	public void setYVelocity(int yVel) {
		this.yVel = yVel;
	}
	
	
	
	
}
