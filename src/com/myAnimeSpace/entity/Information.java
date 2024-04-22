package com.myAnimeSpace.entity;

import java.util.ArrayList;
import java.util.List;

public class Information {
    private String title;
    private String synopsis;
    private List<String> gender = new ArrayList<>();
    private String author;
    private String status;
    private int ageGroup;
    private String review;
    private double rating;
    
    public Information(String title, String synopsis, List<String> gender, String author, String status, int ageGroup,
            String review, double rating) {
        this.title = title;
        this.synopsis = synopsis;
        this.gender = gender;
        this.author = author;
        this.status = status;
        this.ageGroup = ageGroup;
        this.review = review;
        this.rating = rating;
    }
    
    @Override
    public String toString() {
        return "Information [title=" + title + ", gender=" + gender + ", author=" + author + ", status=" + status
                + ", ageGroup=" + ageGroup + ", rating=" + rating + "]";
    }


    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getSynopsis() {
        return synopsis;
    }
    
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    
    public List<String> getGender() {
        return gender;
    }
    
    public void setGender(List<String> gender) {
        this.gender = gender;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(int ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    
        
}
