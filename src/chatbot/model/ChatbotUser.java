package chatbot.model;

public class ChatbotUser
{
// four data members
//at least two different types (String, Int, boolean, double..)
	private String userName;
	private int age;
	private boolean hasTattoos;
	private boolean needsCorrectiveLenses;
	private double weight;
	
	
	public ChatbotUser()
	{
		this.userName = "";
		this.age = 18;
		this.hasTattoos = false;
		this.needsCorrectiveLenses = false;
		this.weight = -420;
		
	}

	public String getUserName()
	{
		return userName;
	}


	public int getAge()
	{
		return age;
	}


	public boolean isHasTattoos()
	{
		return hasTattoos;
	}


	public boolean isNeedsCorrectiveLenses()
	{
		return needsCorrectiveLenses;
	}


	public void setUserName(String userName)
	{
		this.userName = userName;
	}


	public void setAge(int age)
	{
		this.age = age;
	}


	public void setHasTattoos(boolean hasTattoos)
	{
		this.hasTattoos = hasTattoos;
	}


	public void setNeedsCorrectiveLenses(boolean needsCorrectiveLenses)
	{
		this.needsCorrectiveLenses = needsCorrectiveLenses;
	}


	public void setWeight(double Weight)
	{
		this.weight = weight;	
	}
	
	public double getWeight()
	{
		return weight;
	}
}
