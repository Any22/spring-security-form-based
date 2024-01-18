package net.springform.formbasedauthentication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	  @GetMapping("/")
	    public String greeting() {
	        return "welcome";
	    }
}
