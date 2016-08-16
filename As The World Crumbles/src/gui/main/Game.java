package gui.main;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import states.*;

public class Game extends StateBasedGame {
	
	public static final String GAME_NAME = "As The World Crumbles (PRE-ALPHA)";
	public static final int GAME_WIDTH = 1280;
	public static final int GAME_HEIGHT = 720;

	public static final int MAINMENU = 0;
	public static final int PLAY = 1;
	public static final int SETTINGS = 2;
	public static final int BEDROOM = 3;

	public Game(String name) {
		super(name);
		this.addState(new MainMenu());
		this.addState(new Play());
		this.addState(new Settings());
	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(MAINMENU).init(gc, this);
		this.getState(PLAY).init(gc, this);
		this.getState(SETTINGS).init(gc, this);
		
	}

}
