package com.studynow.StreamingAPI.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity(name = "review")
public class Review {
    @Id
    private  Long id;
    private int score;
    private String comment;
    private  Date reviewDate;

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

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }
}
