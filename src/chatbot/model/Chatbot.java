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
	private ChatbotUser myUser;
	private String contentArea;

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
		userInputList = new ArrayList<String>();
		this.name = name;
		contentArea = "";
		chatCount = 0;
		myUser = new ChatbotUser();
		fillTheMemeList();

	}

	/**
	 * Returns the name of the Chatbot object.
	 * 
	 * @return The current name of the Chatbot.
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * This returns the current number of chats.
	 * 
	 * @return The current chatCount value.
	 */
	public int getChatCount()
	{
		return chatCount;
	}

	public ChatbotUser getMyUser()
	{
		return myUser;
	}

	public void setMyUser(ChatbotUser myUser)
	{
		this.myUser = myUser;
	}

	/**
	 * Sets the name of the Chatbot to the supplied name.
	 * 
	 * @param name
	 *            The new name for the chatbot.
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Helper method to fill the list of memes.
	 */
	private void fillTheMemeList()
	{
		memeList.add("kitties");
		memeList.add("one does not simply");
		memeList.add("doge");
		memeList.add("Scumbag Steve");
		memeList.add("Ceiling Cat");
		memeList.add("y u no");
	}

	/**
	 * Processes input from the user against the checker methods. Returns the
	 * next output for the view.
	 * 
	 * @param currentInput
	 *            The supplied text.
	 * @return The processed text based on checker or other methods.
	 */
	public String processText(String currentInput)
	{
		String result = "";

		if (getChatCount() < 5)
		{
			result = introduceUser(currentInput);
		}
		else if (currentInput != null && currentInput.length() > 0)
		{
			result = randomChatConversation(currentInput);
		}
		else
		{
			result = "use words!!!!";
			chatCount--;
		}
		updateChatCount();
		return result;
	}

	/**
	 * Introduces the user of the Chatbot and gathers information about them to
	 * be used later in the project.
	 * 
	 * @param input
	 *            The supplied answers to user information questions.
	 * @return The next question for the user of the Chatbot.
	 */
	private String introduceUser(String input)
	{
		String userQuestion = "";

		if (getChatCount() == 0)
		{
			myUser.setUserName(input);
			userQuestion = "Good name " + myUser.getUserName() + " how old are you?";
		}
		else if (getChatCount() == 1)
		{
			int userAge = Integer.parseInt(input);
			myUser.setAge(userAge);
			userQuestion = "You're old." + myUser.getUserName() + " How much do you weigh?";
		}
		else if (getChatCount() == 2)
		{
			double userWeight = Double.parseDouble(input);
			myUser.setWeight(userWeight);
			userQuestion = "Yikes that is a lot less than a dwarf star " + myUser.getUserName() + " do you have tattoos?";
		}
		else if (getChatCount() == 3)
		{
			boolean userTatts = Boolean.parseBoolean(input);
			myUser.setHasTattoos(userTatts);
			userQuestion = "Some comment about tattoos" + myUser.getUserName() + " do you have friends?";
		}
		else
		{
			boolean userLenses = Boolean.parseBoolean(input);
			myUser.setNeedsCorrectiveLenses(userLenses);
			userQuestion = "I don't wear glasses. " + myUser.getUserName() + " What do you want to talk about?";
		}

		return userQuestion;
	}

	/**
	 * Selects a random topic for the chatbot to talk about using the user's
	 * input as a comment or reference in the topic.
	 * 
	 * @param input
	 *            The user supplied input.
	 * @return The next Chatbot conversation.
	 */
	private String randomChatConversation(String input)
	{
		String conversation = "";

		int randomPosition = (int) (Math.random() * 6);
		if (randomPosition == 0)
		{
			if (stringLengthChecker(input))
			{
				conversation = "too long";
			}
			else
			{
				conversation = "short words";
			}
		}
		else if (randomPosition == 1)
		{
			if (contentChecker(input))
			{
				conversation = "yup you know the secret";
			}
			else
			{
				conversation = "try again another time";
			}
		}
		else if (randomPosition == 2)
		{
			if (memeChecker(input))
			{
				conversation = "Wow, " + input + " is a meme. Wahoo!";
			}
			else
			{
				conversation = "not a meme, try again";
			}
		}
		else if (randomPosition == 3)
		{
			conversation = userTopic(input);
		}
		else if (randomPosition == 4)
		{
			// add to our list
			userInputList.add(input);
			conversation = "Thank you for the comment";
		}
		else if (randomPosition == 5)
		{
			if (mashChecker(input))
			{
				conversation = mashingDetected(input);
			}
			else
			{
				conversation = noMashingDetected(input);
			}

			if (userInputChecker(input))
			{
				conversation = "That was nice - you removed it from the list";
			}
			else
			{
				conversation = "that wasn't in the conversation before";
			}
		}

		return conversation;
	}

	private String mashingDetected(String input)
	{
		String mashed = "";

		mashed = input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);

		return mashed;
	}

	private String noMashingDetected(String input)

	{
		String noMashing = "thank you for not being a total knob.";
		if (input.length() > 1)
		{

			noMashing += input.substring(input.length() / 3, input.length() / 2);

		}
		return noMashing;
	}

	private boolean mashChecker(String userInput)
	{
		boolean isMashing = false;

		if (userInput.indexOf("dgkhdfhg") > -1)
		{
			isMashing = true;
		}

		return isMashing;
	}

	/**
	 * checker for keyboard mashing.
	 * 
	 * @param userInput
	 *            The user supplied text.
	 * @return whether mashing has been detected.
	 */
	private String userTopic(String userInput)
	{
		String userBasedResponse = "";

		int randomUserTopic = (int) (Math.random() * 6);

		switch (randomUserTopic)
		{
		case 1:
			userBasedResponse = myUser.isHasTattoos() + " uwotm8";
			break;
		case 0:
			userBasedResponse = myUser.getUserName() + " is a great name.";
			break;
		default:
			userBasedResponse = myUser.getAge() + " you're ancient.";
			break;
		}

		return userBasedResponse;
	}

	private boolean userInputChecker(String userInput)
	{
		boolean matchesInput = false;

		for (int loopCount = 0; loopCount < userInputList.size(); loopCount++)
		{
			if (userInput.equalsIgnoreCase(userInputList.get(loopCount)))
			{
				matchesInput = true;
				userInputList.remove(loopCount);
				loopCount--;
			}
		}

		return matchesInput;
	}

	/**
	 * Private helper method to update the chatCount variable.
	 */
	private void updateChatCount()
	{
		chatCount++;
	}

	/**
	 * 
	 * @param input
	 * @return
	 */
	private boolean stringLengthChecker(String input)
	{
		boolean isTooLong = false;

		if (input.length() >= 20)
		{
			isTooLong = true;
		}

		return isTooLong;
	}

	/**
	 * Method checks if the user text contains the Chatbot's special content
	 * area text.
	 * 
	 * @param input
	 *            The user supplied text.
	 * @return Whether the user supplied text contains the content area supplied
	 *         by the user.
	 */
	private boolean contentChecker(String input)
	{
		boolean hasMyContent = false;

		if (input.contains(contentArea))
		{
			hasMyContent = true;
		}

		return hasMyContent;
	}

	/**
	 * Checks if the supplied text matches the list of memes.
	 * 
	 * @param input
	 *            The user supplied text to check.
	 * @return Whether or not a meme has been supplied by the user.
	 */
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

		return isAMeme;
	}

	/**
	 * Method to check for the appropriate exit message from the user.
	 * 
	 * @param input
	 *            The user supplied text.
	 * @return Whether or not the quit message has been supplied.
	 */
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;

		if (input != null && input.equals("sayonara"))
		{
			okToQuit = true;
		}

		return okToQuit;
	}
}
