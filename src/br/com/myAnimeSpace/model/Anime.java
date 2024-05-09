package br.com.myAnimeSpace.model;

public class Anime extends MediaContent{
    private int episodes;
    private String studio;
    private final String type = "Anime";

    public Anime(String title, Gender gender, Status status, int ageGroup, int episodes, String studio) {
        super(title, gender, status, ageGroup);
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
    public String toString() {
        return "- " + getTitle() + " [" + type + "]" + ", Gender: " + getGender() + 
        ", Studio: " + studio + ", Episodes: " + episodes +  ", Rating: " + getRating() + "\n";
    }

    public String getType() {
        return type;
    }
    
}
