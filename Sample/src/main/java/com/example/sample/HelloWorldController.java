package com.example.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	//@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	
	
	@GetMapping(path="/hello-world")
	public String showHelloWorldMsg()
	{	
		return "Hello World and HI ";	
	}
	
@GetMapping(path="/hello-world-bean")
@Autowired
public HelloWorldBean showHelloWorldMsgInJSON(HelloWorldBean helloWorldBean)
{  
	//to return the data in JSON or XML format instead of plain text. IT
	//is mandatory to create the bean
	
   return new HelloWorldBean();
}
	
	
}

