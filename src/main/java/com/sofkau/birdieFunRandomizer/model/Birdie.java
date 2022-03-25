package com.sofkau.birdieFunRandomizer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Document(value = "birdies")
public class Birdie {
    @Id
    private String id;

    private Integer number;
    private String limit;
    private LocalDate date;
    private List<Integer> holes = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Integer> getHoles() {
        return holes;
    }

    public void setHoles(List<Integer> holes) {
        this.holes = holes;
    }
}
