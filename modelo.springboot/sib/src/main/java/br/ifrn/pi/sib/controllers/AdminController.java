package br.ifrn.pi.sib.controllers;

import br.ifrn.pi.sib.models.Admin;
import br.ifrn.pi.sib.repositorio.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
public class AdminController {

    @Autowired
    private AdminRepo repo;

    @GetMapping("/admin")
    public String index(Model model) {
        model.addAttribute("nome", "maria");
        List<Admin> adminList = (List<Admin>) repo.findAll();
        model.addAttribute("admin", adminList);
        return "admin/index";
    }

    @GetMapping("/admin/novo")
    public String novo() {
        return "admin/novo";
    }

    @PostMapping ("/admin/criar")
    public String criar(Admin admin) {
        repo.save(admin);
        return "redirect:/admin";
    }

    @GetMapping("admin/{id}")
    public String buscar(@PathVariable int id, Model model) {
        Optional<Admin> admin1 = repo.findById(id);
        try {
            model.addAttribute("admin", admin1.get());
        }
        catch(Exception err) {
            return "redirect:/admin";
        }
        return "/admin/editar";
    }

    @PostMapping("admin/{id}/atualizar")
    public String atualizar(@PathVariable int id, Admin admin) {
        //if(!repo.exist(id)) {
        if(!repo.existsById(id)) {
            return "redirect:/admin";
        }

        repo.save(admin);

        return "redirect:/admin";
    }


    @GetMapping("admin/{id}/excluir")
    public String excluir(@PathVariable int id) {
        repo.deleteById(id);
        return "redirect:/admin";
    }
}

