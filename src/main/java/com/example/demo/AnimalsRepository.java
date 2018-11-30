package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimalsRepository {
    private List<Animals> animalsList = new ArrayList<>();

    public List<Animals> getAnimalsList() {
        return animalsList;
    }

    public AnimalsRepository() {
        animalsList.add(new Animals("Burek ", "Pies"));
        animalsList.add(new Animals("Miaukot ", "Kot"));
        animalsList.add(new Animals("Sssyczek", "Wąż"));
    }

    public List<Animals> getAnimals() {
        return animalsList;
    }

    public void add(Animals animal) {
        animalsList.add(animal);
    }

    public List<Animals> getAnimalSpecies(String gatunek) {
        List<Animals> filtered=new ArrayList<>();
        for (Animals animals : animalsList) {
            if (gatunek.equals(animals.getSpecies()))
                filtered.add(animals);

        }
        return filtered;
    }
}
