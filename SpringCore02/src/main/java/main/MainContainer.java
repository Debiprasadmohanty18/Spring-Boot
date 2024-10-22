package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import course.JavaFullStack;

public class MainContainer {

	public static void main(String[] args) 
	{
		// ApplicationContext
		// BeanFactory
		
		ApplicationContext context = new ClassPathXmlApplicationContext("AppConfig.xml"); // IOC Container Created.
		JavaFullStack jv = context.getBean(JavaFullStack.class);
		
		Boolean status = jv.buyCourse(1299);
		
		if(status)  
			System.out.println("Purchase Successful");
		else 
			System.out.println("Failed to Purchase");
	}	

}
