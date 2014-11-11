package chatbot.model;

import java.util.ArrayList;

/**
 * The chatbot model class; used for checking and manipulating Strings.
 * 
 * @author tpet7439
 * @version 1.1 9/26/14
 */

public class Chatbot
{
	private ArrayList<String> memeList;
	private String name;
	private int chatCount;
	private ArrayList<String> userInputList;
	public ChatbotUser getMyUser()

	
	{
		return myUser;
	}

	public void setMyUser(ChatbotUser myUser)
	{
		this.myUser = myUser;
	}

	private int length;

	/**
	 * creates a Chatbot object with the supplied name and initializes the
	 * current number of chats to zero.
	 * 
	 * @param name
	 *            The supplied name for the Chatbot.
	 */

	public Chatbot(String name)
	{
		memeList = new ArrayList<String>();
		this.name = name;
		chatCount = 0;
		fillTheMemeList();
		myUser = new ChatbotUser();
		userInputList = new ArrayList<String>();
	}

	/**
	 * processes input from the user against the checker methods. returns the
	 * next output for the view.
	 * 
	 * @param currentInput
	 *            the supplied text.
	 * @return the processed text based on checker or other methods.
	 */

	public String processText(String currentInput)
	{
		String result = "";
		
		if(getChatCount() < 7)
		{
			
		}
		

		int randomPosition = (int) (Math.random() * 3);
		
		
		
		if (currentInput != null)
		{
			if (randomPosition == 0)
			{
				if (stringLengthChecker(currentInput))
				{
					result = "too long";
				}
				else
				{
					memeList.add(currentInput);
					result = "short words";
				}
			}
			else if (randomPosition == 1)
			{
				if (contentChecker(currentInput))
				{
					result = "yup you know the secret";

				}
				else
				{
					result = "try again another time";
				}

			}
			else if(randomPosition ==2)
			{
				if (memeChecker(currentInput))
				{
					result = " Wow , " + currentInput + " is a meme. Wahoo!";
				}
				else
				{
					result = " not a meme, try again. ";
				}
			}
		}
		else if(randomPosition ==3)
		{
		
		}
		else if(randomPosition ==4)
		{
			userInputList.add(currentInput);
			result = "Thank you for the comment.";
		}
		else
		{
			if(userInputChecker(currentInput))
			{
				
			}
			else
			{
				
			}
		}
		updateChatCount();
		return result;
	}
	
	private boolean userInputChecker(String currentInput)
	{
		// TODO Auto-generated method stub
		return false;
	}

	private boolean userInputCheker(String userInput)
	{
		boolean matchesInput = false;
		
		for(int loopCount = 0; loopCount < userInputList.size(); loopCount++)
		{
			if(userInput.equalsIgnoreCase(userInputList.get(loopCount)))
			{
				matchesInput = true;
				userInputList.remove(loopCount);
				loopCount--;
			}
		}
		return matchesInput;
	}

	private boolean contentChecker(String currentInput)
	{
		// TODO Auto-generated method stub
		return false;
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

	private boolean stringLengthChecker(String input)
	{
		boolean isTooLong = false;
		
		if(input.length() >= 20)
		{
			isTooLong = true;
		}
		return isTooLong;

	}

	private void fillTheMemeList()
	{
		/**
		 * List of Memes that will be recognized by Chatbot. Adds them to a
		 * list.
		 */

		memeList.add("Doge");
		memeList.add("One does not simply");
		memeList.add("Kitties");
		memeList.add("Ceiling Cat");
		memeList.add("None of my business");
		memeList.add("Y u no");
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

	private boolean memeChecker(String input)
	{
		boolean isAMeme = false;

		for (String currentMeme : memeList)
		{
			if (input.equalsIgnoreCase(currentMeme))
			{
				isAMeme = true;
			}
		}

		for (int loopCounter = 0; loopCounter < memeList.size(); loopCounter++)
		{
			if (input.equalsIgnoreCase(memeList.get(loopCounter)))
			{
				isAMeme = true;
			}
		}

		return isAMeme;
	}
	
	private ChatbotUser myUser;

	/**
	 * QuitCheker boolean calls for the string, and allows for an input.
	 * 
	 * @param input
	 *            is answer that will be called later on in the boolean
	 *            statement.
	 * @return returns an if else statement, with the input equaling "Goodbye".
	 */

	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;

		if (input != null && input.equals("Goodbye"))
		{
			okToQuit = true;
		}

		return okToQuit;
	}
}
