package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatboxAppController;

public class ChatBotView
{
	private ChatboxAppController baseController;
	
	public ChatBotView(ChatboxAppController baseController)
	{
		this.baseController = baseController;
	}
	
	/**
	 * Shows a String from the Chatbot with the availability of user input.
	 * @param currentInput The supplied String.
	 * @return The users typed response.
	 */
	
	public String showChatbotDialog(String currentInput)
	{
		String result = "";
		
		result = JOptionPane.showInputDialog(null, baseController.getMySillyChatbot().getName() + " says: " + currentInput);
		return result;
	}
	
	/**
	 * Shows a String from the Chatbot as a popup winow.
	 * @param currentInput The string from the Chatbot.
	 */
	
	public void showChatbotMessage(String currentInput)
	{
		JOptionPane.showInputDialog(null, baseController.getMySillyChatbot().getName() + " says: " + currentInput);
	}
}
