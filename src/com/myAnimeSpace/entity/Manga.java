package com.myAnimeSpace.entity;

public class Manga {
    private Information info;
    private int chapters;

    public Manga(Information info, int chapters) {
        this.info = info;
        this.chapters = chapters;
    }

    public Information getInfo() {
        return info;
    }

    public void setInfo(Information info) {
        this.info = info;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

        
}
