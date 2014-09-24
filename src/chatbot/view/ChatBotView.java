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
	
	public String showChatbot(String currentInput)
	{
		String result = "";
		
		JOptionPane.showMessageDialog(null, "Hello," + currentInput);
		result = JOptionPane.showInputDialog(null, "are you done?");
		return result;
	}
}
