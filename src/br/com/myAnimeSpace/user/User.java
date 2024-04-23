package br.com.myAnimeSpace.user;

import java.util.List;
import java.util.Optional;
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

    private void register(String user, String password){
        if(password.length() >= 8 || user.length() >= 1){
            this.user = user;
            this.password = password;
        } else {
            System.out.println("The password must be greater than or equal 8 characters and user cannot be empty.");
        }
    }

    private boolean login(String user, String password){
        if(!(this.user.equals(user)) || !(this.password.equals(password))){
            return false;
        }
        return true;
    }

    public void searchByWord(List<MediaContent> list, String word){
        List<MediaContent> byWord = list.stream().filter(m -> m.getTitle().contains(word)).collect(Collectors.toList());
        System.out.println(byWord);
    }

}
