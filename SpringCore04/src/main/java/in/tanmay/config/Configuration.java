package in.tanmay.config;

import org.springframework.context.annotation.Bean;

import in.tanmay.service.Play;

@org.springframework.context.annotation.Configuration
public class Configuration {

	public Configuration()
	{
		System.out.println("Configuration Bean is created.");
	}
	
	@Bean
	public Play playObject()
	{
		return new Play("Cricket");
	}
	
}
