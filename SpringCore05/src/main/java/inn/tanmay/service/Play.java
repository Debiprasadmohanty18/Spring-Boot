package inn.tanmay.service;


public class Play {

	String playName;
	
	public Play(String playName)
	{
		this.playName=playName;
		System.out.println("Play Bean Created");
	}
	
	public String whichGame()
	{
		return "Game Name is "+ playName;
	}
}
