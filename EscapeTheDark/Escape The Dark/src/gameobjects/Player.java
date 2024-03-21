package gameobjects;

public class Player extends GameObject
{
	
	private Room location; //current location
	
	public Player(String playerName, String playerDescription, Room playerRoom)
	{
		super(playerName, playerDescription);
		location = playerRoom;
	}
	
	public void setLocation(Room playerRoom)
	{
		location = playerRoom;
	}
	
	public Room getLoaction()
	{
		return location;
	}
}
