package com.prop.PropertiesYamlDemo;

import com.prop.PropertiesYamlDemo.beans.MyAppDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("myapp.properties")
public class PropertiesYamlDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(PropertiesYamlDemoApplication.class, args);
		MyAppDetails myAppDetails = container.getBean(MyAppDetails.class);
		System.out.println(myAppDetails.getMyAppName() + " " + myAppDetails.getMyAppVersion());
	}

}
