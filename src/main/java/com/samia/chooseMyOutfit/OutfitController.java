package com.samia.chooseMyOutfit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OutfitController {

    @GetMapping("/")
    public String homePage() {
        return "home";
    }
}
