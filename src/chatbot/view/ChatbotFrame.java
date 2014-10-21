package chatbot.view;

import javax.swing.JFrame;

import chatbot.controller.ChatboxAppController;

public class ChatbotFrame extends JFrame
{
	private ChatboxAppController baseController;
	
	private ChatbotPanel basePanel;
	
	public ChatbotFrame(ChatboxAppController baseController)
	{
		basePanel = new ChatbotPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		setVisible(true);
	}
	
}
