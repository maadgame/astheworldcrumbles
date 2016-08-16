package states;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import gui.main.Game;
import levels.Level;

public class Play extends BasicGameState {
	
	
	
	public static Bedroom bedroom = new Bedroom();
	
	public static int level = 1;
	
	public Play() {

	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		bedroom.init();
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		//g.scale(2, 2);
		switch(level){
		case 1:
			bedroom.render(gc, g);
			break;
		case 2:
		}
		
		g.setColor(Color.green);
		g.drawString("X: " + gc.getInput().getMouseX(), 2, 12);
		g.drawString("Y: " + gc.getInput().getMouseY(), 2, 24);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int arg) throws SlickException {
		switch(level){
		case 1:
			bedroom.update(gc, arg);
		case 2:
		}
	}

	@Override
	public int getID() {
		return Game.PLAY;
	}

}
