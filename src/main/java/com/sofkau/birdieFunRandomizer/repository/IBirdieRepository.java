package com.sofkau.birdieFunRandomizer.repository;

import com.sofkau.birdieFunRandomizer.model.Birdie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBirdieRepository extends ReactiveMongoRepository<Birdie, String> {
}
