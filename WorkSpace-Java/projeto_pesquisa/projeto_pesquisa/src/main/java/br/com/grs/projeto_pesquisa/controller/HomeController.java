package br.com.grs.projeto_pesquisa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String carregaHome(){
        return "index";
    }
    
}