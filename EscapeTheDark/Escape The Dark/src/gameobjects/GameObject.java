package gameobjects;

public class GameObject 
{
	private String name;
	private String description;
	
	/*
	 * Constructor
	 * Creates an object called "Item" to defines all objects in game.
	 * "Item must have name and description that are Strings.
	 */
	public GameObject (String objectName, String objectDescription)
	{
		name = objectName;
		description = objectDescription;
	}
	
	/* Getters 
	 * Return name and description of item.
	 * String value is returned.
	 */
	public String getName()
	{
		return name;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	/*	
	 * Setters
	 * Set values of name and description.
	 * No value returned so we use void.
	*/ 
	public void setName(String objectName)
	{
		name = objectName;
	}
	public void setDescription(String objectDescription)
	{
		description = objectDescription;
	}
}
