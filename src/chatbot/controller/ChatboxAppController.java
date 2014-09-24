package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.view.ChatBotView;

public class ChatboxAppController
{
	private ChatBotView applicationView;
	
	public ChatboxAppController()
	{
		applicationView = new ChatBotView(this);
	}
	
	public void start()
	{
		String result = applicationView.showChatbot(" Taylor ");
		
		if(result.equalsIgnoreCase("exit"))
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
