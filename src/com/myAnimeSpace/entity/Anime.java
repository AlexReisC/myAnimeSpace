package com.myAnimeSpace.entity;

public class Anime {
    private Information info;
    private int episodes;
    
    public Anime(Information info, int episodes) {
        this.info = info;
        this.episodes = episodes;
    }

    public Information getInfo() {
        return info;
    }

    public void setInfo(Information info) {
        this.info = info;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
    
}
