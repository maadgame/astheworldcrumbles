package states;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

import player.Player;

public class Bedroom {

	private TiledMap map;
	
	private int collision;
	private int objects;
	private int background;
	
	private int x, y;
	
	private boolean[][] blocked;
	
	private Player player;

	public Bedroom() {
		
	}
	
	public void init(){
		try {
			x = 2;
			y = 2;
			map = new TiledMap("backgrounds/Bedroom.tmx");
			int background = map.getLayerIndex("Background");
			blocked = new boolean [9][10];
			player = new Player(x,y,1,1);
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void render(GameContainer gc, Graphics g) throws SlickException {
		map.render(0, 0);
		//g.fillRect(x * 32, y * 32, 32, 32);
		player.drawPlayer(g);
	}

	public void update(GameContainer gc, int arg1) throws SlickException {
		
		player.updatePlayer(gc, map, background);
		
		
		
		
	}
	
	private boolean isBlocked(int x, int y){
		int xBlock = x / 32;
		int yBlock = y / 32;
		return blocked[xBlock][yBlock];
	}
	
	private void initializeBlocked(){
		for(int l = 0; l < 3; l++){
			String layervalue = map.getLayerProperty(l, "blocked", "false");
			if(layervalue.equals("true")){
				for(int c = 0; c < 10; c++){
					for(int r = 0; r < 9; r++){
						if(map.getTileId(c, r, l) != 0){
							blocked[c][r] = true;
						}
					}
				}
			}
		}
	}

}