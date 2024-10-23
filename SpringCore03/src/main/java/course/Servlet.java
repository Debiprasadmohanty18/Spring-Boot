package course;

public class Servlet implements Subjects {
	
	public Servlet()
	{
//		System.out.println("Servlet Dependency Injection Through Constructor Called.");
		System.out.println("Servlet Bean Created.");
	}

	@Override
	public boolean getCourse(int price) 
	{
		System.out.println("Servlet Subject Purchased Successfully & Fees Paid :- " + price);
		return true;
	}

}
