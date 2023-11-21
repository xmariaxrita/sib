package br.ifrn.pi.sib.controllers;

import br.ifrn.pi.sib.models.Catalogue;
import br.ifrn.pi.sib.repositorio.CatalogueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CatologueController {

    @Autowired
    private CatalogueRepo repo;

    @GetMapping("/catalogues")
    public String index (Model model) {
        List<Catalogue> catalogues  = (List<Catalogue>) repo.findAll();
        model.addAttribute("catalogues", catalogues);
        return "catalogues/index";
    }

    @GetMapping("/catalogues/{id}/excluir")
    public String excluir(@PathVariable int id){
        repo.deleteById(id);
        return "redirect:/catalogues";

    }

    @GetMapping("/catalogues/add")
    public String add(){
        return "catalogues/add";
    }

    @PostMapping("/catalogues/save")
    public String novo(Catalogue catalogue){
        repo.save(catalogue);
        return "redirect:/catalogues";
    }

}
