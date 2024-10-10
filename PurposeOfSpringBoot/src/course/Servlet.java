package course;

public class Servlet implements Subjects {

	@Override
	public boolean getCourse(int price) 
	{
		System.out.println("Servlet Subject Purchased Successfully & Fees Paid :- " + price);
		return true;
	}

}
