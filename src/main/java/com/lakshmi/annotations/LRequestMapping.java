package com.lakshmi.annotations;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//RequestMapping annotation is used to map web requests onto specific handler
//classes and handler methods
@RequestMapping
public class LRequestMapping {
@RequestMapping(method=RequestMethod.GET)
public String welcomeAll() {
	return "welcome all";
}
}
