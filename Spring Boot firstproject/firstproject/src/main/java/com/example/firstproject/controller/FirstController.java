package com.example.firstproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")        //URL 요청 연결
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "lzm");
        return "greetings";  //greetings -> 브라우저를 전송
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname","zm");
        return "goodbye";
    }
}
