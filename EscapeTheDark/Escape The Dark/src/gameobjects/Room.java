package gameobjects;

public class Room extends GameObject
{
	private int north, south, east, west;
	
	public Room (String roomName, String roomDescription, int roomNorth, int roomSouth, int roomEast, int roomWest)
	{
		super(roomName, roomDescription);
		north = roomNorth;
		south = roomSouth;
		east = roomEast;
		west = roomWest;
	}
	
	/*
	 * Getters
	 * Return new room in the given direction of the current room.
	 */
	public int getNorth()
	{
		return north;
	}
	
	public int getSouth()
	{
		return south;
	}
	public int getEast()
	{
		return east;
	}
	public int getWest()
	{
		return west;
	}
	
	/*
	 * Setters
	 * Set new room in the given direction of the current room.
	 */
	
	public void setNorth(int roomNorth)
	{
		north = roomNorth;
	}
	
	public void setSouth(int roomSouth)
	{
		south = roomSouth;
	}
	
	public void setEast(int roomEast)
	{
		east = roomEast;
	}
	
	public void setWest(int roomWest)
	{
		west = roomWest;
	}
}
