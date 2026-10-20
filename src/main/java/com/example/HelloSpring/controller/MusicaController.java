package com.example.HelloSpring.controller;

import com.example.HelloSpring.model.Musica;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class MusicaController {
    List<Musica> musicas = new ArrayList<>();

    public MusicaController() {//construtor criado para cadastrar 3 musicas
        musicas.add(new Musica(1, "Eduardo e Mônica", "Legião Urbana", 8, "Rock Nacional"));
        musicas.add(new Musica(2, "Sozinho", "Raça Negra", 5, "Pagode"));
        musicas.add(new Musica(3, "Planos", "BK", 4, "R&B"));
    }

    @GetMapping("/exibircatalogo")
    public List<Musica> exibirCatalogo(){
        return musicas;
    }

    @GetMapping("/exibirprimeiramusica")
    public Musica exibirPrimeiraMusica(){
        return musicas.get(0);
    }
}
