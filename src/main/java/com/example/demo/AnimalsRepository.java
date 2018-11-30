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
        animalsList.add(new Animals("Burek", "Pies", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ9YKJQSwswwK_0v1mgUIXYl4rV7VGiQOQCIUOcGzY9YOgF1e8bJw"));
        animalsList.add(new Animals("Miaukot", "Kot", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRZwIIoppvylZPt9Jd1iBiws8T_AqZPofU2yJfSixodNqsdl7jOA"));
        animalsList.add(new Animals("Sssyczek", "Wąż", "https://static.miauhau.pl/media/articles/1511/12/17018-weze-w-kapeluszach.jpg"));
    }

    public List<Animals> getAnimals() {
        return animalsList;
    }

    public void add(Animals animal) {
        animalsList.add(animal);
    }

    public List<Animals> getAnimalSpecies(String gatunek) {
        List<Animals> filtered = new ArrayList<>();
        for (Animals animals : animalsList) {
            if (gatunek.equals(animals.getSpecies()))
                filtered.add(animals);

        }
        return filtered;
    }

    public Animals getAnimalByName(String name) {
        for (Animals animals : animalsList) {
            if (name.equals(animals.getName()))
                return animals;

        }
        return null;
    }
}
