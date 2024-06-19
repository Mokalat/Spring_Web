package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/*")
public class Page1 {

    @GetMapping("model")
    public String model( Model model) {
        model.addAttribute("forwardMessage", "page1 입니다");

        return "result";
    }

    @GetMapping( "/mession1")
    public ModelAndView mession1(ModelAndView mv, @RequestParam("pathValue") String value){
        mv.addObject("message", value);
        mv.setViewName("mession1");
        return mv;
    }
    

}
