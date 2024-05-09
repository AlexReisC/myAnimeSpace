package br.com.myAnimeSpace.model;

public class Manga extends MediaContent{
    private int chapters;
    private final String type = "Manga";

    public Manga(String title, Gender gender, Status status, int ageGroup, int chapters) {
        super(title, gender, status, ageGroup);
        this.chapters = chapters;
    }

    public int getChapters() {
        return chapters;
    }
    
    public void setChapters(int chapters) {
        this.chapters = chapters;
    }
    
    @Override
    public String toString() {
        return "- " +getTitle() + " [" + type + "]" + ", Gender: " + getGender() + 
        ", Author:" + getAuthor() + ", Chapters: " + getChapters() +  ", Rating: " + getRating() + "\n";
    }

    public String getType() {
        return type;
    }

    
}
