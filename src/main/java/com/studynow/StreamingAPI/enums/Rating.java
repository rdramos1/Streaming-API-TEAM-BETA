package com.studynow.StreamingAPI.enums;

public enum Rating {
    ALL("ALL"),
    TEN("TEN"),
    TWELVE("TWELVE"),
    FOURTEEN("FOURTEEN");

    private final String  ratingValue;

    Rating(String ratingValue) {
        this.ratingValue = ratingValue;
    }


    public String getRatingValue() {
        return ratingValue;
    }
}
