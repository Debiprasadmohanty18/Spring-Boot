package inn.tanmay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import inn.tanmay.service.Play;

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = {"inn.tanmay"})
public class Config {

	public Config()
	{
		System.out.println("Configuration Bean is created.");
	}
	
	@Bean
	public Play playObject()
	{
		return new Play("Cricket");
	}
	
}
