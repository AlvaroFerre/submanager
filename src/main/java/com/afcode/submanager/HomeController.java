package com.afcode.submanager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String appName;
//   @RequestMapping("/")
//    public String index() {
//        System.out.println("App name: " + appName);
//        return "index.html";
//    }
    @RequestMapping("/")
    public String index(Model model) {
       model.addAttribute("nombre", appName);
       return "index";
   }
}
