package com.sofkau.birdieFunRandomizer.service;

import com.sofkau.birdieFunRandomizer.model.Birdie;
import com.sofkau.birdieFunRandomizer.repository.IBirdieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class BirdieService {

    @Autowired
    private IBirdieRepository repository;

    public Mono<Birdie> create(Birdie birdie) {
        return repository.save(birdie);
    }
}
