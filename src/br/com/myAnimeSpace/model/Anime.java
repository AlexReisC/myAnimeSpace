package br.com.myAnimeSpace.model;

import java.util.List;

public class Anime extends MediaContent{
    private int episodes;

    public Anime(String title, List<String> gender, String author, boolean status, int ageGroup, int episodes) {
        super(title, gender, author, status, ageGroup);
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
    
}
