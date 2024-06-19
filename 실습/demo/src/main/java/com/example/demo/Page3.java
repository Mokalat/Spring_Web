package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/*")
public class Page3 {
    @GetMapping("model3")
    public String model2(Model model2){
        model2.addAttribute("forwardMessage2","page2 입니다");
        return "model3";
    }

    @GetMapping("/")
    public String main() {
        return "main";

    }

    @PostMapping("/response")
    public String userResponse(@RequestParam("authority") String authority, @RequestParam("message") String message, Model model) {
        if ("normal".equals(authority)) {
            model.addAttribute("message", message);
            return "response";
        } else {
            model.addAttribute("error", "잘못된 요청입니다.");
            return "redirect:/";
        }
    }
}
