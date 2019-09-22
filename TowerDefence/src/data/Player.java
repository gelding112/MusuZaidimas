package data;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import static helpers.Translator.*;
public class Player {
	
	private TileType[] types;
	private TileGrid grid;
	private int index;
	
	public Player(TileGrid grid) {
		this.grid = grid;
		this.types = new TileType[3];
		this.types[0] = TileType.Grass;
		this.types[1] = TileType.Dirt;
		this.types[2] = TileType.Water;
		this.index = 0;
	}
	public void SetTile() {
		grid.SetTile((int)Math.floor(Mouse.getX() / 64),
				(int)Math.floor((HEIGHT - 64 - Mouse.getY() - 1)/ 64), 
				 types[index]);
	}
	public void Update() {
		if(Mouse.isButtonDown(0)) {
			SetTile();
		}
		while (Keyboard.next()) {
			if (Keyboard.getEventKey() == Keyboard.KEY_RIGHT) {
				MoveIndex();
			}
		}
	}
	private void MoveIndex() {
		index++;
		if (index > types.length - 1) {
			index = 0;
		}
	}
}
