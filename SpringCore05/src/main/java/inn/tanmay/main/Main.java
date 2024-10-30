package inn.tanmay.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import inn.tanmay.config.Config;
import inn.tanmay.service.Play;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Play p = context.getBean(Play.class);
		p.whichGame();
		
		
	}

}
