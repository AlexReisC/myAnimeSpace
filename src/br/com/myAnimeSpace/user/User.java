package br.com.myAnimeSpace.user;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.ArrayList;

import br.com.myAnimeSpace.model.MediaContent;

public class User {
    private String name;
    private String user;
    private String password;
    private List<MediaContent> favorites;
    
    public User(String name) {
        this.name = name;
        this.favorites = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public List<MediaContent> getFavorites() {
        return favorites;
    }
    
    @Override
    public String toString() {
        return "User: " + user ;
    }

    public boolean register(String user, String password){
        if(password.length() >= 8 || user.length() >= 1){
            this.user = user;
            this.password = password;
            System.out.println("Register complete");
            return true;
        }
            System.out.println("The password must be greater than or equal 8 characters and user cannot be empty.");
            return false;
    }

    public boolean login(String user, String password){
        if(!(this.user.equals(user)) || !(this.password.equals(password))){
            return false;
        }
        System.out.println("Login sucess");
        return true;
    }
    
    public void search(List<MediaContent> list, Predicate<MediaContent> predicate){
        List<String> titles = list.stream().filter(predicate).map(MediaContent::getTitle).collect(Collectors.toList());
        System.out.println(titles);
    }

    public void searchByWord(List<MediaContent> list, String word){
        search(list, t -> t.getTitle().contains(word));
    }

    public void searchByTitle(List<MediaContent> list, String title){
        search(list, t -> t.getTitle().equals(title));
    }

    public void searchByAuthor(List<MediaContent> list, String author){
        search(list, t -> t.getAuthor().equals(author));
    }

    public void searchByGender(List<MediaContent> list, String gender){
        search(list, t -> t.getGender().contains(gender));
    }
}
