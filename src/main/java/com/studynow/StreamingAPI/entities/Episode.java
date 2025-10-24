package com.studynow.StreamingAPI.entities;

public record Episode(Long id, String title, int number, String description, int duration, String videoUrl) {
}
