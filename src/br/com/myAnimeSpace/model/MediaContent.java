package br.com.myAnimeSpace.model;

public abstract class MediaContent {
    private String title;
    private String synopsis;
    private Gender gender;
    private String author;
    private Status status;
    private int ageGroup;
    private String review;
    private double rating;
    
    public MediaContent(String title, Gender gender, Status status, int ageGroup) {
        this.title = title;
        this.gender = gender;
        this.status = status;
        this.ageGroup = ageGroup;
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
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAgeGroup(int ageGroup) {
        this.ageGroup = ageGroup;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
        
}
