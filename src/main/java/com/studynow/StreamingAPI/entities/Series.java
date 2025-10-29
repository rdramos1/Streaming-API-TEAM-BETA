package com.studynow.StreamingAPI.entities;

import com.studynow.StreamingAPI.averagerating.IAverageRating;
import com.studynow.StreamingAPI.enums.Genre;
import com.studynow.StreamingAPI.enums.Rating;

public class Series implements IAverageRating {

    private Long id;
    private String title;
    private String description;
    private int releaseYear;
    private Genre genre;
    private Rating rating;
    private int totalSeasons;

    @Override
    public double calculateAverageRating() {
        return 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public int getTotalSeasons() {
        return totalSeasons;
    }

    public void setTotalSeasons(int totalSeasons) {
        this.totalSeasons = totalSeasons;
    }
}
