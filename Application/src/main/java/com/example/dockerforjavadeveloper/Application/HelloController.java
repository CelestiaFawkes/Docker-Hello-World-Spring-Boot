package com.example.dockerforjavadeveloper.Application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	 @RequestMapping("/")
	    public String index() {
	        return "Hello World\n";
	    }

}
