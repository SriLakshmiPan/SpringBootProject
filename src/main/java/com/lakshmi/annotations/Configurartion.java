//@ComponentScan is used with @configuration to allow Spring to know the packages to scan
//java class annotated with @configuration is a configuration by itself and 
//will have methods to instantiate and configure the dependencies
//@Bean is used at the method level,@Bean works with @Configurartion to create spring beans
package com.lakshmi.annotations;
import javax.mail.Address;
import javax.mail.util.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Configurartion {
@Bean
public Person person() {
	return new Person(address());
}
@Bean
public Address address() {
	return new Address();
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
