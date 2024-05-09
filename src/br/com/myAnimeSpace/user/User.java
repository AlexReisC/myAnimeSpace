package br.com.myAnimeSpace.user;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.InputMismatchException;

import br.com.myAnimeSpace.model.Gender;
import br.com.myAnimeSpace.model.MediaContent;
import br.com.myAnimeSpace.repository.Space;

public class User {
    private String name;
    private String user;
    private String password;
    private List<MediaContent> favorites;
    private List<MediaContent> watchList;
    private boolean loged = false;
    Scanner scan;
    
    public User(String name) {
        this.name = name;
        this.favorites = new ArrayList<>();
        scan = new Scanner(System.in);
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

    public boolean isLoged() {
        return loged;
    }

    public void setLoged(boolean loged) {
        this.loged = loged;
    }

    public List<MediaContent> getWatchList() {
        return watchList;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", User: " + user ;
    }

    public boolean register(String user, String password){
        if(password.length() >= 8 && user.length() >= 1){
            this.user = user;
            this.password = password;
            return true;
        }
        return false;
    }

    public boolean login(String user, String password){
        return loged = this.user.equals(user) && this.password.equals(password) ? true : false;
    }
    
    public List<MediaContent> search(List<MediaContent> list, Predicate<MediaContent> predicate){
        List<MediaContent> result = list.stream().filter(predicate).collect(Collectors.toList());
        return result;
    }

    public List<MediaContent> searchByWord(List<MediaContent> list, String word){
        return search(list, t -> t.getTitle().contains(word));
    }

    public MediaContent searchByTitle(List<MediaContent> list, String title){
        List<MediaContent> results = search(list, t -> t.getTitle().equals(title));
        if (results.isEmpty()) {
            throw new NoSuchElementException("No results found.");
        }
        return results.get(0);
    }

    public List<MediaContent> searchByAuthor(List<MediaContent> list, String author){
        return search(list, t -> t.getAuthor().equals(author));
    }

    public List<MediaContent> searchByGender(List<MediaContent> list, Gender gender[]){
        return search(list, t -> t.getGender().equals(gender));
    }

    public void reviewMedia(List<MediaContent> list, String title){
        MediaContent result = searchByTitle(list, title);
        
        try {
            if(loged){
                try {
                    System.out.println("What rating do you give? ");
                    result.setRating(scan.nextDouble());
                } catch (InputMismatchException e) {
                    System.out.println("* Use the ',' not '.' in the number *");
                    scan.nextLine();
                    result.setRating(scan.nextDouble());
                }
                
                scan.nextLine();
                System.out.println("Write your review... ");
                result.setReview(scan.nextLine());
            } else {
                System.out.println("Login is required!");
            }
        } catch (NoSuchElementException e) {
            System.out.println("No results found");
        }
    }
    
    public void addFavorite(MediaContent mediaContent){
        if (loged) {
            favorites.add(mediaContent);
            System.out.println("Favorited!");
        } else {
            System.out.println("Login is required!");
        }
    }

    public void vizualizeRanking(List<MediaContent> list){
        Space.ranking(list);
    }

    public void addWatchList(MediaContent mediaContent){
        if(loged){
            watchList.add(mediaContent);
            System.out.println("Added to your WatchList");
        } else {
            System.out.println("Login is required!");
        }
    }

    public boolean removeFromList(List<MediaContent> list, String title){
        try{
            MediaContent found = searchByTitle(list, title);
            return list.remove(found);
        } catch (NoSuchElementException e){
            System.out.println("Nothing removed");
            return false;
        }
    }
    
}
