package com.sofkau.birdieFunRandomizer.service;

import com.sofkau.birdieFunRandomizer.model.Birdie;
import com.sofkau.birdieFunRandomizer.repository.IBirdieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Service
public class BirdieService {

    @Autowired
    private IBirdieRepository repository;

    public Mono<Birdie> create(Birdie birdie) {

        return Mono.just(new Birdie())
                .map(b -> {
                    b.setLimit(birdie.getLimit());
                    b.setNumber(birdie.getNumber());
                    b.setDate(LocalDate.now());
                    return b;
                })
                .map(b -> {
                    var limits = Stream.of(b.getLimit().split("-"))
                            .collect(Collectors.toList());

                    var numbersRandom = IntStream
                            .range(Integer.parseInt(limits.get(0)), Integer.parseInt(limits.get(1)))
                            .boxed()
                            .collect(Collectors.toList());

                    Collections.shuffle(numbersRandom);

                    b.setHoles(numbersRandom.stream().limit(b.getNumber()).collect(Collectors.toList()));
                    return b;
                }).flatMap(b -> repository.save(b));
    }

}
