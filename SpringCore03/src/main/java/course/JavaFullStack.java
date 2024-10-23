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
		System.out.println("JavaFullStack Bean Created");
	}
	
	public void setSub(Subjects sub)   // Subjects sub = new Servlet();
	{
		System.out.println("Setter Injected.");
		this.sub = sub;
	}



	public boolean buyCourse(int amount)
	{
		return sub.getCourse(amount);
	}
}
