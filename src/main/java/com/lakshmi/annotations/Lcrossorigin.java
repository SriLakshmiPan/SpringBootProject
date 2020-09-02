//@CrossOrigin is used to enable cross origin requests for a specific period of time
package com.lakshmi.annotations;

import org.jboss.logging.Message;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/account")
public class Lcrossorigin {
	@CrossOrigin(origins = "http://example.com")
	@RequestMapping("/message")
	public void getmessage() {
	}

	@RequestMapping("/note")
	public void getnote() {
	}
}
