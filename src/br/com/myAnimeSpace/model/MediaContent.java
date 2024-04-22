package br.com.myAnimeSpace.model;

import java.util.ArrayList;
import java.util.List;

public abstract class MediaContent {
    private String title;
    private String synopsis;
    private List<String> gender = new ArrayList<>();
    private String author;
    private boolean status;
    private int ageGroup;
    private String review;
    private double rating;
    
    
    public MediaContent(String title, List<String> gender, String author, boolean status, int ageGroup) {
        this.title = title;
        this.gender = gender;
        this.author = author;
        this.status = status;
        this.ageGroup = ageGroup;
    }


    @Override
    public String toString() {
        return "Description [title=" + title + ", gender=" + gender + ", author=" + author + ", status=" + status
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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAgeGroup() {
        return ageGroup;
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
