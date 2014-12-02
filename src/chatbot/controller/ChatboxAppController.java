package chatbot.controller;

/**
 * Runs the chatbot Project.  Owns the model and associated views.
 * @author Taylor
 * @version 1.9 11/21/14 - cleaned the quit method.
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
		applicationView = new ChatBotView(this);
		appFrame = new ChatbotFrame(this);
		mySillyChatbot = new Chatbot("Derf");
		startMessage = "Welcome to the " + mySillyChatbot.getName() + " ChatBot. What is your name?";
		quitMessage = "Cyalater nerd!";
	}

	/**
	 * Getter method for the applications Chatbot.
	 * 
	 * @return The Chatbot for the application.
	 */
	public Chatbot getMySillyChatbot()
	{
		return mySillyChatbot;
	}

	/**
	 * Startup method for the Chatbot application. This is the standard method
	 * we use in all of our projects.
	 */
	public void start()
	{
		((ChatbotPanel) appFrame.getContentPane()).showTextMessage(startMessage);

		// ChatbotPanel testPanel = (ChatbotPanel) appFrame.getContentPane();
		// testPanel.showTextMessage(startMessage);
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
	 * Quit method for the Chatbot application.
	 */
	private void quit()
	{
		applicationView.showChatbotMessage(quitMessage);
		System.exit(0);
	}
	
}