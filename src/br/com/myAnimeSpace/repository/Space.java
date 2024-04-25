package br.com.myAnimeSpace.repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.myAnimeSpace.model.MediaContent;

public class Space {
    public static List<MediaContent> dataBase = new ArrayList<>();

    public static void ranking(List<MediaContent> list){
        list.sort(Comparator.comparingDouble(MediaContent::getRating).reversed());
        list.forEach(System.out::println);
    }
}
