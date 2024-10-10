package main;

import course.JavaFullStack;
import course.Servlet;
import course.Spring;
//import course.Spring;

public class MainClass {

	public static void main(String[] args) 
	{
		JavaFullStack ob = new JavaFullStack(new Spring()); // Target Class
		
/*		You can create object of Servlet Class and pass the reference variable to setter. 
6		like :- 
		
		Servlet s = new Servlet();
		ob.setSub(s); 
 */
		
		ob.setSub(new Servlet());  //Setter Injection
		
//		ob.setSub(new Spring());
		
		Boolean check = ob.buyCourse(1999);
		if(check)
			System.out.println("Success");
		else 
			System.out.println("Failure");
	}

}
