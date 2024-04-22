package br.com.myAnimeSpace.model;

import java.util.List;

public class Manga extends MediaContent{
    private int chapters;

    public Manga(String title, List<String> gender, String author, boolean status, int ageGroup, int chapters) {
        super(title, gender, author, status, ageGroup);
        this.chapters = chapters;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

        
}
