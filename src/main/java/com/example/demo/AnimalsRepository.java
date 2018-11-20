package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimalsRepository {
    List<Animals> animalsList = new ArrayList<>();

    public List<Animals> getAnimalsList() {
        return animalsList;
    }
    public AnimalsRepository(){
        animalsList.add(new Animals("'Burek' ","Pies"));
        animalsList.add(new Animals("'Miaukot' ","Kot"));
        animalsList.add(new Animals("'Sssyczek'","Wąż"));


}
}
