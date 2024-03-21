package escape.the.dark;

import escape.the.dark.GameBuild;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EscapeTheDark 
{
	
    static GameBuild game;
    
	public static void main(String[] args) throws IOException
    {
    	
    	BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
    	String playerInput;
    	String gameOutput = "";
    	game = new GameBuild();
    	
    	do
    	{
   
    		System.out.println("> ");
    		playerInput = in.readLine();
    		gameOutput = game.runCommand(playerInput);
    		
    		if (!gameOutput.trim().isEmpty())
    		{
    			game.showStr(gameOutput);
    		}
    	} while (!"q".equals(playerInput));
    }
    
}
