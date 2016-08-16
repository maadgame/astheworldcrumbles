package guiobjects;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Rectangle;

import gui.main.Game;

public class Button {
	
	private Image image;
	private Image imageSelect;
	private int x;
	private int y;
	
	private Rectangle rect;
	
	public static final int BUTTON_WIDTH = 318;
	public static final int BUTTON_HEIGHT = 96;
	
	public Button(Image i, Image iS, int x, int y, int w, int h){
		image = i;
		imageSelect = iS;
		this.x = x;
		this.y = y;
		rect = new Rectangle(this.x, this.y, w, h);
	}
	
	public boolean isMouseOnButton(){
		int mouseX = Mouse.getX();
		int mouseY = Game.GAME_HEIGHT - Mouse.getY();
		
		if(rect.contains(mouseX, mouseY))
			return true;
		else
			return false;
	}
	
	public boolean isClicked(){
		if(isMouseOnButton()){
			if(Mouse.isButtonDown(0)){
				return true;
			}
		}
		return false;
	}
	
	public void drawButton(Graphics g){
		if(isMouseOnButton()){
			g.drawImage(imageSelect, x, y+12);
		}else{
			g.drawImage(image, x, y);
		}
	}

	

}
