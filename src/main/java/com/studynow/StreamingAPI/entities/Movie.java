package com.studynow.StreamingAPI.entities;

import com.studynow.StreamingAPI.averagerating.IAverageRating;
import com.studynow.StreamingAPI.enums.Genre;
import com.studynow.StreamingAPI.enums.Rating;

public class Movie implements IAverageRating {

    private Long id;
    private String title;
    private String description;
    private int releaseYear;
    private Genre genre;
    private  Rating rating;
    private int duration;
    private String director;
    private String videoUrl;


    @Override
    public double calculateAverageRating() {
        return 0;
    }
}
