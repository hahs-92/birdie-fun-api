package com.sofkau.birdieFunRandomizer.controller;

import com.sofkau.birdieFunRandomizer.model.Birdie;
import com.sofkau.birdieFunRandomizer.service.BirdieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/birdies")
public class BirdieController {

    @Autowired
    private BirdieService service;

    @PostMapping
    public ResponseEntity<Mono<Birdie>> create(@RequestBody Birdie birdie) {
        try {
            return new ResponseEntity<>(service.create(birdie), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
