package com.teamtreehouse.giflib.controller;

import com.teamtreehouse.giflib.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
public class GifController {
    @RequestMapping("/")
    public String listGifs(){
        return "home";
    }

    // Request mapping to Gif URI
    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap){
        Gif gif = new Gif("Compiler-bot", LocalDate.of(2015, 2, 13), "Chris Rama", true);
        modelMap.put("gif", gif);
        return "gif-details";
    }

}
