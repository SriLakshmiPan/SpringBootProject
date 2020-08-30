package com.lakshmi.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//@Autowired annotation injects object dependency implicitly
//@Required annotation is applied on bean setter methods
//@Autowired annotation applied on fields,setter methods and constructors
@Component
public class AutowiredAnnotation<Person> {
private Person person;	
@Autowired
public void setPerson (Person person) {
	this.person=person;
}
}
