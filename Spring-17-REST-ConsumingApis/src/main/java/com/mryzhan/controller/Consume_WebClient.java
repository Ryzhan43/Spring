package com.mryzhan.controller;

import com.mryzhan.entity.Genre;
import com.mryzhan.entity.MovieCinema;
import com.mryzhan.repository.GenreRepository;
import com.mryzhan.repository.MovieCinemaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class Consume_WebClient {
    private final MovieCinemaRepository movieCinemaRepository;
    private final GenreRepository genreRepository;

    public Consume_WebClient(MovieCinemaRepository movieCinemaRepository, GenreRepository genreRepository) {
        this.movieCinemaRepository = movieCinemaRepository;
        this.genreRepository = genreRepository;
    }

    @GetMapping("/flux-movie-cinemas")
    public Flux<MovieCinema> readAllCinemasFlux(){
        return Flux.fromIterable((movieCinemaRepository.findAll()));
       }

//    @GetMapping("/mono-movie-cinema/{id}")
//    public Mono<MovieCinema> readById(@PathVariable("id") Long id){
//        return Mono.just(movieCinemaRepository.findById(id).get());
//    }

    @GetMapping("/mono-movie-cinema/{id}")
    public ResponseEntity<Mono<MovieCinema>> readById(@PathVariable("id") Long id){
        return ResponseEntity.ok(Mono.just(movieCinemaRepository.findById(id).get()));
    }

    @PostMapping("create-genre")
    public Mono<Genre> createGenre(@RequestBody Genre genre){
        Genre createdGenre = genreRepository.save(genre);

        return Mono.just(createdGenre);
    }


}
