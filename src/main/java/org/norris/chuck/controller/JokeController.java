package org.norris.chuck.controller;

import org.norris.chuck.services.JokeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    @Autowired
    private JokeServiceImpl jokeService;

    @RequestMapping("/")
    public String getJoke(Model model){
        String joke = jokeService.getJoke();
        model.addAttribute("joke", joke);
        return "index";
    }
}
