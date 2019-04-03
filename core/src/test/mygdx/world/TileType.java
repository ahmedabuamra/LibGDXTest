package test.mygdx.world;

import java.util.HashMap;

public enum TileType {
	
	GRASS(1, true, "Grass"),
	DIRT(1, true, "Dirt"),
	SKY(1, true, "Sky"),
	LAVA(1, true, "Lava"),
	CLOUD(1, true, "Cloud"),
	STONE(1, true, "Stone");
	
	private int id;
	private boolean callidable;
	private String name;
	private float damage;
	
	private TileType(int id, boolean callidable, String name) {
		this(id, callidable, name, 0);
	}
	

	private TileType(int id, boolean callidable, String name, float damage) {
		this.id = id;
		this.callidable = callidable;
		this.name = name;
		this.damage = damage;
	}


	public int getId() {
		return id;
	}



	public boolean isCallidable() {
		return callidable;
	}



	public String getName() {
		return name;
	}




	public float getDamage() {
		return damage;
	}
	
	private static HashMap<Integer, TileType> tileMp;
	
	static {
		for(TileType tile: TileType.values()) {
			tileMp.put(tile.getId(), tile);
		}
	}
	
	
	public static TileType getTileTypeByID(int id) {
		return tileMp.get(id);
	}
	
}
