package com.sofkau.birdieFunRandomizer.repository;

import com.sofkau.birdieFunRandomizer.model.Birdie;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IBirdieRepository extends ReactiveCrudRepository<Birdie, String> {
}
