package chatbot.controller;

/**
 * the Runner for the Chatbot.
 * @author tpet7439
 *@version 10/7/14
 */

public class ChatbotRunner
{
	
	/**
	 * Starting point for all Java programs.
	 * @param args unused!
	 */
	public static void main(String [] args)
	{
		ChatboxAppController appController = new ChatboxAppController();
		appController.start();
	}
	
}
