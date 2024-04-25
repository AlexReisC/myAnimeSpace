package br.com.myAnimeSpace.model;

import java.util.List;

public class Manga extends MediaContent{
    private int chapters;
    private final String type = "Manga";

    public Manga(String title, List<String> gender, String author, boolean status, int ageGroup,  int chapters) {
        super(title, gender, status, ageGroup);
        this.chapters = chapters;
        this.setAuthor(author);
    }

    public int getChapters() {
        return chapters;
    }
    
    public void setChapters(int chapters) {
        this.chapters = chapters;
    }
    
    @Override
    public String toString() {
        return "Title: " + getTitle() + " [" + type + "]" + ", Gender: " + getGender() + 
        ", Auhtor:" + getAuthor() + ", Chapters: " + getChapters() +  ", Rating: " + getRating() + "\n";
    }

    public String getType() {
        return type;
    }

    
}
