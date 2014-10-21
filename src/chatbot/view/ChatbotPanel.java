package chatbot.view;

import javax.swing.JPanel;

import chatbot.controller.ChatboxAppController;

public class ChatbotPanel extends JPanel
{
	private ChatboxAppController baseController;
	
	public ChatbotPanel(ChatboxAppController baseController)
	{
		this.baseController = baseController;
	}
}
