package br.ifrn.pi.sib.controllers;

import br.ifrn.pi.sib.models.Catalogue;
import br.ifrn.pi.sib.repositorio.CatalogueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Controller
public class CatologueController {

    public static String UPLOAD_DIRECTORY = System.getProperty("user.dir") + "/src/main/resources/static/uploads/";
    @Autowired
    private CatalogueRepo repo;

    @GetMapping("/catalogues")
    public String index (Model model) {
        List<Catalogue> catalogues  = (List<Catalogue>) repo.findAll();
        model.addAttribute("catalogues", catalogues);
        return "catalogues/index";
    }

    @GetMapping("/catalogues/edit/{id}")
    public String editar(@PathVariable int id, Model model) {

        Catalogue catalogue = repo.findById(id).orElse(null);

        model.addAttribute("catalogue", catalogue);

        return "catalogues/edit";
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
    public String novo(Catalogue catalogue, @RequestParam("imgCapa") MultipartFile file) throws IOException {
        StringBuilder fileNames = new StringBuilder();
        Path fileNameAndPath = Paths.get(UPLOAD_DIRECTORY, file.getOriginalFilename());
        fileNames.append(file.getOriginalFilename());
        Files.write(fileNameAndPath, file.getBytes());
        repo.save(catalogue);
        return "redirect:/catalogues";


    }

}
