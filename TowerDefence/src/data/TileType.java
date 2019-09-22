package data;

public enum TileType {
	
	Grass("grass64test", true),
	Dirt("maptile64", false),
	Enemy("enemy", false),
	Water("water64", false);
	
	String textureName;
	boolean buildable;
	
	
	TileType(String textureName, boolean buildable){
		this.textureName = textureName;
		this.buildable = buildable;
	}
}
