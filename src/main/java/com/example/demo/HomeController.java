package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {


    //@GetMapping("/")
    //public String index(Model model){
    //    return "index";
    //}

    @Autowired
    private MovieDao movieDao;

    @RequestMapping(value = "/movieList", method = RequestMethod.POST)
    public String getMovieList(Model model){
        List<Movie> movList = movieDao.findAll();
        movList.add(new Movie("Batman", 2007, "action"));
        movList.add(new Movie("Your name", 2016, "anime"));
        movList.add(new Movie("hello", 2001, "drama"));
        model.addAttribute("movList", movList);
        return "movieList";
    }
}
