package com.example.redirectreproducer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second")
public class AnotherController {

    @GetMapping
    public String anotherPage(Model model){
        return "another/page";
    }
}
