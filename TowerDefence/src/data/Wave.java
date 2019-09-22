package data;

import java.util.ArrayList;
import static helpers.Clock.*;
public class Wave {
	
	private float timeSinceLastSpawn, spawnTime;
	private Enemy enemyType;
	private ArrayList<Enemy> enemyList;
	
	public Wave(float spawnTime, Enemy enemyType) {
		
		timeSinceLastSpawn = 0;
		this.spawnTime = spawnTime;
		this.enemyType = enemyType;
		enemyList = new ArrayList<Enemy>();
		
	}
	public void Update() {
		timeSinceLastSpawn += Delta();
		if (timeSinceLastSpawn > spawnTime) {
			Spawn();
			timeSinceLastSpawn = 0;
		}
		for (Enemy e : enemyList) {
			e.Update();
			e.Draw();
		}
	}
	private void Spawn() {
		enemyList.add(new Enemy(enemyType.getX(), enemyType.getY(),
				64, 64, enemyType.getType(), enemyType.getSpeed()));
		
	}
}
