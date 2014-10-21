package chatbot.controller;

/**
 * Runs the chatbot Project.  Owns the model and associated views.
 * @author Taylor
 * @version 1.2 10/2/14 - cleaned the quit method.
 */

import chatbot.model.Chatbot;
import chatbot.view.ChatBotView;
import chatbot.view.ChatbotFrame;

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

		String result = applicationView.showChatbotDialog(startMessage);

//		while (!mySillyChatbot.quitChecker(result))
//		{
//			result = mySillyChatbot.processText(result);
//			result = applicationView.showChatbotDialog(result);
//		}
//		/**
//		 * Shows the answer and repeats unless
//		 */
//			quit();
	}

	private void quit()
	{
		applicationView.showChatbotMessage(quitMessage);
		System.exit(0);
	}
}
