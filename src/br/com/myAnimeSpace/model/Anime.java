package br.com.myAnimeSpace.model;

import java.util.List;

public class Anime extends MediaContent{
    private int episodes;
    private String studio;

    public Anime(String title, List<String> gender, String author, boolean status, int ageGroup, int episodes, String studio) {
        super(title, gender, author, status, ageGroup);
        this.episodes = episodes;
        this.studio = studio;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    @Override
    public String printInfo() {
        return "Title: " + getTitle() + ", Gender: " + getGender() + ", Studio: " + getStudio();
    }
    
    
}
