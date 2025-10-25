package com.studynow.StreamingAPI.entities;

import com.studynow.StreamingAPI.averagerating.IAverageRating;
import com.studynow.StreamingAPI.enums.Genre;
import com.studynow.StreamingAPI.enums.Rating;

public record Series(Long id, String title, String description, int releaseYear, Genre genre, Rating rating,int totalSeasons) implements IAverageRating {

    @Override
    public double calculateAverageRating() {
        return 0;
    }
}
