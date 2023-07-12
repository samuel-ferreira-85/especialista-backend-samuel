package com.samuel.animalservice.controller;

import com.samuel.animalservice.dto.FuncionarioDTO;
import com.samuel.animalservice.entity.Animal;
import com.samuel.animalservice.entity.Funcionario;
import com.samuel.animalservice.repository.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private AnimalRepository animalRepository;

    public AnimalController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @GetMapping
    private List<Animal> findAll() {
        return animalRepository.findAll();
    }

    @PostMapping
    private Animal create(@RequestBody Animal animal) {
        return animalRepository.save(animal);
    }

    @GetMapping("/not-adopted")
    private List<Animal> findNotAdopted() {
        return animalRepository.findNotAdopted();
    }

    @GetMapping("/adopted")
    private List<Animal> findAdopted() {
        return animalRepository.findAdopted();
    }

    @GetMapping("/animais-funcionarios")
    private List<FuncionarioDTO> findAnimaisPorFuncionario() {
        return animalRepository.obterFuncionariosComQuantidadeDeAnimais();
    }
}
