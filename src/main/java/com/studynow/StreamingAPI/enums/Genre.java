package com.studynow.StreamingAPI.enums;

public enum Genre {
    ACTION("ACTION"),
    DRAMA("DRAMA"),
    COMEDY("COMEDY"),
    HORROR("HORROR");

    private final String genre;

    Genre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}
