package main;



// Bean Factory supports Lazy Initialization.


import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import course.JavaFullStack;

public class MainContainerForBeanFactory {

	public static void main(String[] args) 
	{
		
		
		// ApplicationContext can contain only one configuration file (i.e xml-file) per IOC container because configuration file getting loaded at the time of IOC container created. 
		// BeanFactory can contain multiple configuration file(i.e xml-file) per IOC container because first it creates IOC container then can load multiple xml.file.
		
		DefaultListableBeanFactory	container = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader read = new XmlBeanDefinitionReader(container);
		read.loadBeanDefinitions("AppConfig.xml");
		
		
		JavaFullStack jv = container.getBean(JavaFullStack.class);
		
		Boolean status = jv.buyCourse(1299);
		
		if(status)  
			System.out.println("Purchase Successful");
		else 
			System.out.println("Failed to Purchase");
	}

}
