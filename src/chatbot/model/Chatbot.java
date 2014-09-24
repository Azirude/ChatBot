package chatbot.model;

public class Chatbot
{
	
	private String name;
	private int chatCount;
	private String length;
	
	public Chatbot(String name)
	{
		this.name = name;
		chatCount = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getLength()
	{
		return length;
	}
	
	public int getChatCount()
	{
		return chatCount;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	private void updateChatCount()
	{
		chatCount++;
	}
}
