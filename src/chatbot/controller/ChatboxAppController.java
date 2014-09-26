package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatBotView;

public class ChatboxAppController
{
	private ChatBotView applicationView;
	private Chatbot mySillyChatbot;

	public ChatboxAppController()
	{
		applicationView = new ChatBotView(this);
		mySillyChatbot = new Chatbot("derf");
	}

	public void start()
	{

		/**
		 * Calls the Chatbot textbox, and initializes name as Taylor.
		 */

		String result = applicationView.showChatbot(" Taylor ");

		if (mySillyChatbot.quitChecker(result))
		{
			quit();
		}
	}

	private void quit()
	{
		JOptionPane.showMessageDialog(null, "He's dead, jim!");
		System.exit(0);
	}
}
