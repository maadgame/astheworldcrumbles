package levels;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

import player.Player;

public class Level {
	
	//private Tile[] tiles;
	protected TiledMap map;
	
	protected int x;
	protected int y;
	
	private Player player;//Move this to first level later
	
	public Level(String b, int x, int y){
		try {
			map = new TiledMap(b);
			x = 2;
			y = 2;
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

	public void render(GameContainer gc, Graphics g) throws SlickException {
		map.render(0, 0);
		g.fillRect(x * 32, y * 32, 32, 32);
	}
	
	public void update(GameContainer gc, int arg1) throws SlickException {
		int objectLayer = map.getLayerIndex("Objects");

		map.getTileId(0, 0, objectLayer);

		if (gc.getInput().isKeyPressed(Input.KEY_W)) {
			if (map.getTileId(x, y - 1, objectLayer) != 1) {
				System.out.println("top worked");
				y--;
			}
		}
		if (gc.getInput().isKeyPressed(Input.KEY_A)) {
			if (map.getTileId(x - 1, y, objectLayer) != 10) {
				x--;
			}
		}
		if (gc.getInput().isKeyPressed(Input.KEY_S)) {
			if (map.getTileId(x, y+1 , objectLayer) != 10) {
				y++;
			}
		}
		if (gc.getInput().isKeyPressed(Input.KEY_D)) {
			if (map.getTileId(x+1, y, objectLayer) != 10) {
				x++;
			}
		}
	}
	
	
	

	
}
