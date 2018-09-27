package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieDao {

    public List<Movie> findAll(){
        List<Movie> movList = new ArrayList<>();
        movList.add(new Movie("Batman", 2007, "action"));
        movList.add(new Movie("Your name", 2016, "anime"));
        movList.add(new Movie("hello", 2001, "drama"));

        return movList;
    }
}
