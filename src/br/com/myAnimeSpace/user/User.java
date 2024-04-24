package br.com.myAnimeSpace.user;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.InputMismatchException;

import br.com.myAnimeSpace.model.MediaContent;

public class User {
    private String name;
    private String user;
    private String password;
    private List<MediaContent> favorites;
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
    
    @Override
    public String toString() {
        return "Name: " + name + ", User: " + user ;
    }

    public boolean register(String user, String password){
        if(password.length() >= 8 || user.length() >= 1){
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
        if(result.isEmpty()){
            System.out.println("No result found");
        }
        return result;
    }

    public void searchByWord(List<MediaContent> list, String word){
        System.out.println(search(list, t -> t.getTitle().contains(word)));
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

    public void reviewMedia(List<MediaContent> list, String title){
        List<MediaContent> result = search(list, t -> t.getTitle().equals(title));
        
        if(loged){
            try {
                System.out.println("What rating do you give? ");
                result.getFirst().setRating(scan.nextDouble());
            } catch (InputMismatchException e) {
                System.out.println("* Use the ',' not '.' in the number *");
                scan.nextLine();
                result.getFirst().setRating(scan.nextDouble());
            }
            
            scan.nextLine();
            System.out.println("Write your review... ");
            result.getFirst().setReview(scan.nextLine());
        }
        
        System.out.println("Necessary to login for this action!");
    }

    public boolean isLoged() {
        return loged;
    }

    public void setLoged(boolean loged) {
        this.loged = loged;
    }
    
}
