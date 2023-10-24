package br.ifrn.pi.sib.controllers;

import br.ifrn.pi.sib.models.User;
import br.ifrn.pi.sib.repositorio.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepo repo;

    @GetMapping("/users")
    public String index (Model model) {
        List<User> users = (List<User>) repo.findAll();
        model.addAttribute("users", users);
        return "users/index";
    }

    @PostMapping("/users/criar")
    public String criar(User user){
        repo.save(user);
        return "redirect:/users";
    }

    @GetMapping ("/users/{id}/excluir")
    public String excluir(@PathVariable int id){
        repo.deleteById(id);
        return "redirect:/users";
    }
}
