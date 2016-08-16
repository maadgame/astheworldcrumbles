package gui.main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Launcher {

	public static void main(String[] args) {
		AppGameContainer gc;
		try {
			gc = new AppGameContainer(new Game(Game.GAME_NAME));
			gc.setDisplayMode(Game.GAME_WIDTH, Game.GAME_HEIGHT, false);
			gc.setShowFPS(false);
			gc.setIcon("textures/icon.png");
			gc.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}
