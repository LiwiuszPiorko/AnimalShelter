package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ShelterControler {
    private AnimalsRepository repository;
    private List<Animals> animals;

    @Autowired
    public ShelterControler(AnimalsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/shelter")
    public String getAnimal(Model model) {
        List<Animals> animals = repository.getAnimalsList();
        String response = "";
        model.addAttribute("pupile", animals);
        model.addAttribute("newTask", new Animals());
        return "animals";
    }
    @PostMapping("/dodaj")
    public String add(Animals animal){
       animals.add(animal);

    }
}

