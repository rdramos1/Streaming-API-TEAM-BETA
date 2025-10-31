package com.studynow.StreamingAPI.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "season")
public class Season{
    @Id
    private Long id;
    private int number;
    private int releaseYear;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
