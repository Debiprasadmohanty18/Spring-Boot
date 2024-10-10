package course;

public class JavaFullStack 
{
	private Subjects sub; 

	public JavaFullStack(Subjects sub) {
		super();
		this.sub = sub;
	}

	public JavaFullStack()
	{
		
	}
	
	public void setSub(Subjects sub)   // Subjects sub = new Servlet();
	{
		this.sub = sub;
	}



	public boolean buyCourse(int amount)
	{
		return sub.getCourse(amount);
	}
}
