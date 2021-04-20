package com.dzb.Zadaca_2.controller;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller

public class HomeController {
	
  @RequestMapping("/")
  public String welcome(Model model) {
    model.addAttribute("greeting", "Dobro dosli u techno shop!");
    model.addAttribute("tagline", "Svijet bijele tehnike");

    
    return "forward:/welcome/greeting";
  }
  
  @RequestMapping("/welcome/greeting")
  public String greeting() {
    return "welcome";
  }
  
  }
