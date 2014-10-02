package chatbot.model;

import java.util.ArrayList;


/**
 * The chatbot model class; used for checking and manipulating Strings.
 * @author tpet7439
 *@version 1.1 9/26/14
 */

public class Chatbot
{
	private ArrayList<String> memeList;
	private String name;
	private int chatCount;
	private int length;

	/**
	 * creates a Chatbot object with the supplied name and initializes the
	 * current number of chats to zero.
	 * 
	 * @param name
	 * The supplied name for the Chatbot.
	 */

	public Chatbot(String name)
	{
		this.name = name;
		chatCount = 0;
	}
	/**
	 * processes input from the user against the checker methods.  returns the next output for the view.
	 * @param currentInput the supplied text.
	 * @return the processed text based on checker or other methods.
	 */
	
	public String processText(String currentInput)
	{
		String result = "";
		
		
		return result;
	}
	

	/**
	 * Returns the name of the Chatbot object.
	 * 
	 * @return the current name of the Chatbot.
	 */

	public String getName()
	{
		return name;
	}

	public int getLength()
	{
		return length;
	}

	public int getChatCount()
	{
		return chatCount;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	private void updateChatCount()
	{
		chatCount++;
	}
	
	/**
	 * QuitCheker boolean calls for the string, and allows for an input.
	 * @param input is answer that will be called later on in the boolean statement.
	 * @return returns an if else statement, with the input equaling "Goodbye".
	 */

	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;

		if (input!= null && input.equals("Goodbye"))
		{
			okToQuit = true;
		}

		return okToQuit;
	}
}
