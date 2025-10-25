package com.studynow.StreamingAPI.entities;

import java.util.Date;

public record Review(Long id, int score, String comment, Date reviewDate) {
}
