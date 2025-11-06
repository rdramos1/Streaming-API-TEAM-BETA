package com.studynow.StreamingAPI.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;
import java.util.Date;

@Entity(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @NotNull
    private int score;
    @NotBlank(message = "Comment is mandatory")
    private String comment;
    @Temporal(TemporalType.DATE)
    @NotNull
    private Instant reviewDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Instant getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Instant reviewDate) {
        this.reviewDate = reviewDate;
    }
}
