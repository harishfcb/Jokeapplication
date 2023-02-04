package guru.springframework.spring5jokesappv2.controller;

import guru.springframework.spring5jokesappv2.services.Jokeservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private  final Jokeservice jokeservice;
    private JokeController(Jokeservice jokeservice){
        this.jokeservice=jokeservice;
    }
    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke",jokeservice.getjoke());
        return "index";
    }
}
