package states;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import gui.main.Game;
import guiobjects.Button;

public class MainMenu extends BasicGameState {

	private Image background;
	private Button playButton;
	private Button settingsButton;

	public MainMenu() {

	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		background = new Image("backgrounds/menu.png");
		playButton = new Button(new Image("textures/play_btn.png"), new Image("textures/play_btn_press.png"), 150, 380,
				Button.BUTTON_WIDTH, Button.BUTTON_HEIGHT);
		settingsButton = new Button(new Image("textures/options_btn.png"), new Image("textures/options_btn_press.png"),
				150, 500, Button.BUTTON_WIDTH, Button.BUTTON_HEIGHT);
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawImage(background, 0, 0);
		playButton.drawButton(g);
		settingsButton.drawButton(g);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int arg) throws SlickException {
		if (playButton.isClicked())
			sbg.enterState(Game.PLAY);
		if (settingsButton.isClicked())
			sbg.enterState(Game.SETTINGS);
	}

	@Override
	public int getID() {
		return Game.MAINMENU;
	}

}
