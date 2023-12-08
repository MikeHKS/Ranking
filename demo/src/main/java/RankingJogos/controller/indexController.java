package RankingJogos.controller;
import RankingJogos.dao.JogadorRepository;
import RankingJogos.model.Jogador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class indexController {

    @Autowired
    JogadorRepository jogadorRepository;


    @GetMapping("/")
    public String abrir(Model model){
        List<Jogador> jogadors = jogadorRepository.findAll();
        model.addAttribute( "jogadors");
        return "index";
    }
}