package course;

public class Spring implements Subjects {

	@Override
	public boolean getCourse(int price) 
	{
		System.out.println("Spring Subject Purchased Successfully & Fees Paid :- " + price);
		return true;
	}

}
