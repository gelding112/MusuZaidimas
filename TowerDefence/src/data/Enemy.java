package data;

import static helpers.Clock.*;
public class Enemy extends Tile{

	private float speed;
	private boolean first = true;
	public Enemy(float x, float y, float width, float height, TileType type, float speed) {
		super(x, y, width, height, type);
		this.speed = speed;
	}
	public void Update() {
		if (first)
			first = false;
		else
			setX(getX() + Delta() * speed);
	}
	public boolean isFirst() {
		return first;
	}
	public void setFirst(boolean first) {
		this.first = first;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
}
