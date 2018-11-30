package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ShelterControler {
    private AnimalsRepository repository;

    @Autowired
    public ShelterControler(AnimalsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/shelter")
    public String getAnimal(Model model) {
        List<Animals> animals = repository.getAnimalsList();
        String response = "";
        model.addAttribute("pupile", animals);
        model.addAttribute("newAnimals", new Animals());

        return "animals";
    }

    @PostMapping("/saveAnimal")
    public String add(Animals animal) {
        repository.add(animal);
        return "redirect:/shelter";
    }
    @GetMapping("/sortAnimals")
    public String sortAnimals(@RequestParam String gatunek, Model model){
        List<Animals>sortedAnimals=repository.getAnimalSpecies(gatunek);
        model.addAttribute("pupile", sortedAnimals);
        model.addAttribute("newAnimals", new Animals());
        return "animals";
    }
    @GetMapping("/showAnimal")
    public String showAnimalProfile(Model model,@RequestParam String name){
        Animals animal = repository.getAnimalByName(name);
        model.addAttribute("zwierze",animal);
        return "Info";
    }
}

