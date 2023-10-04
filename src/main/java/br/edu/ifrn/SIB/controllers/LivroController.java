package br.edu.ifrn.SIB.controllers;

import br.edu.ifrn.SIB.models.Livro;
import br.edu.ifrn.SIB.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class LivroController {

    @Autowired
    private LivroRepository repository;

    @GetMapping("/livros")
    public String index(Model model){
        List<Livro> livros = (List<Livro>)repository.findAll();
        model.addAttribute("livros", livros);
        return "/livros/index";
    }
}
