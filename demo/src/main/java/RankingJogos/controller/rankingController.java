package RankingJogos.controller;

import RankingJogos.dao.JogadorRepository;
import RankingJogos.model.Jogador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class rankingController {
    @Autowired
    JogadorRepository jogadorRepository;

    @GetMapping("/cadastro")
    public String abrir(Jogador jogador) {
        return "cadastro";
    }

    @PostMapping("/cadastrar_jogador")
    public String cadastrar(Jogador jogador) {
        jogadorRepository.save(jogador);
        //realizar cadastro topzera
        return "index";
    }
}