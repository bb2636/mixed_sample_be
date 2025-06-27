package com.example.springbe.controller;

import com.example.springbe.dto.MovieDto;
import com.example.springbe.dto.MoviesDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= RequestMethod.GET)
public class MainController {
    @GetMapping("/movies")
    public MoviesDto hello() {
        MoviesDto movies = new MoviesDto();
        MovieDto movieDto = new
                MovieDto(1,"testMovie","https://img.yts.mx/assets/images/movies/kpop_demon_hunters_2025/medium-cover.jpg",
                "summaryTest");
                List<MovieDto> moviesList = new ArrayList<>();
        moviesList.add(movieDto);
        movies.setMovies(moviesList);
        return movies;
    }
}
