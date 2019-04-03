package test.mygdx.world;

import com.badlogic.gdx.graphics.OrthographicCamera;

public abstract class GameMap {
	public abstract void create(OrthographicCamera cam);
	public abstract void update(float delta);
	public abstract void dispose();
	
	/**
	 * Gets a tile by pixel position within the game world at a specific layer.
	 * @param layer
	 * @param x
	 * @param y
	 * @return
	 */
	public abstract TileType getTileTypeByLocation (int layer, float x, float y);

	/**
	 * Get a tile a its coordinate within the map at a specified layer.
	 * @param layer
	 * @param col
	 * @param row
	 * @return
	 */
	public abstract TileType getTileTypeByCoordinate (int layer, float col, float row);

	public abstract int getWidth();
	public abstract int getHight();
	public abstract int getLayers();

}
