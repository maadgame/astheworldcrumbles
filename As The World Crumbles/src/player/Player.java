package player;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.tiled.TiledMap;

import entity.Entity;
import levels.LevelManager;
import states.Play;

public class Player extends Entity {

	private TiledMap map;

	public Player(int xx, int yy, int xVel, int yVel) {
		super(xx, yy, xVel, yVel, 32, 32);
	}

	public void updatePlayer(GameContainer gc, TiledMap map, int background) {
		//System.out.println(map.getTileId(x, y, background));
		System.out.println( x*32 + "      " + y*32);
		if (gc.getInput().isKeyPressed(Input.KEY_W)) {
			if (map.getTileId(x, y - 1, background) != 10 || map.getTileId(x, y - 1, background) != 0) {
				y--;
			}
		}
		if (gc.getInput().isKeyPressed(Input.KEY_A)) {
			if (map.getTileId(x - 1, y, background) != 10) {
				x--;
			}
		}
		if (gc.getInput().isKeyPressed(Input.KEY_S)) {
			if (map.getTileId(x, y + 1, background) != 10) {
				y++;
			}
		}
		if (gc.getInput().isKeyPressed(Input.KEY_D)) {
			if (map.getTileId(x + 1, y, background) != 10) {
				x++;
			}
		}
		if (gc.getInput().isKeyPressed(Input.KEY_P)) {
			System.out.print(background);
		}
		// if(map.getTileId(x, y, background) == 2){
		// Play.level = 2;
		// }
	}

	public void drawPlayer(Graphics g) {
		g.setColor(Color.blue);
		g.drawRect(x * 32, y * 32, 32, 32);
	}

}
