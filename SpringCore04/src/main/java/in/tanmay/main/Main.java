package in.tanmay.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.tanmay.service.Play;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		
		Play p = context.getBean(Play.class);
		p.whichGame();
		
		
	}

}
