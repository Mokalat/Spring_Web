package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/*")
public class Page2 {
    @GetMapping("model2")
    public String model2(Model model2){
        model2.addAttribute("forwardMessage2","page2 입니다");
        return "model2";
    }



    @GetMapping( "/mession2")
    public String getCategory(Model model,@RequestParam("category") String category){
        model.addAttribute("category", category);
        return "mession2";
    }

}
