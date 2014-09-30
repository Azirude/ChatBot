package chatbot.model;


/**
 * The chatbot model class; used for checking and manipulating Strings.
 * @author tpet7439
 *@version 1.1 9/26/14
 */

public class Chatbot
{

	private String name;
	private int chatCount;
	private String length;

	/**
	 * creates a Chatbot object with the supplied name and initializes the
	 * current number of chats to zero.
	 * 
	 * @param name
	 *            The supplied name for the Chatbot.
	 */

	public Chatbot(String name)
	{
		this.name = name;
		chatCount = 0;
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

	public String getLength()
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

		if (input.equals("Goodbye"))
		{
			okToQuit = true;
		}

		return okToQuit;
	}
}
