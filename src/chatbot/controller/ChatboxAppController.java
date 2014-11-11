package chatbot.controller;

/**
 * Runs the chatbot Project.  Owns the model and associated views.
 * @author Taylor
 * @version 1.2 10/2/14 - cleaned the quit method.
 */

import chatbot.model.Chatbot;
import chatbot.view.ChatBotView;
import chatbot.view.ChatbotFrame;
import chatbot.view.ChatbotPanel;

public class ChatboxAppController
{
	private ChatBotView applicationView;
	private Chatbot mySillyChatbot;
	private String startMessage;
	private String quitMessage;
	private ChatbotFrame appFrame;

	public ChatboxAppController()
	{
		appFrame = new ChatbotFrame(this);
		applicationView = new ChatBotView(this);
		mySillyChatbot = new Chatbot("derf");
		startMessage = "Welcome to the " + mySillyChatbot.getName() + "chatbot.  What is your name?";
		quitMessage = "Thank you for Chosing " + mySillyChatbot.getName();
	}

	public Chatbot getMySillyChatbot()
	{
		return mySillyChatbot;
	}

	public void start()
	{

		/**
		 * Calls the Chatbot textbox.
		 */

		((ChatbotPanel) appFrame.getContentPane()).showTextMessage(startMessage);

		// ChatbotPanel testPanel = (ChatbotPanel) appFrame.getContentPane();
		// testPanel.showTextMessage(startMessage);

		/**
		 * Shows the answer and repeats unless
		 */
	}

	public String getChatbotDialog(String input)
	{
		String result = "";
		
		if(mySillyChatbot.quitChecker(input))
		{
			quit();
		}
		
		result = mySillyChatbot.processText(input);

		return result;
	}

	/**
	 * Quit method for the chatbot application.
	 */

	private void quit()
	{
		applicationView.showChatbotMessage(quitMessage);
		System.exit(0);
	}
}
