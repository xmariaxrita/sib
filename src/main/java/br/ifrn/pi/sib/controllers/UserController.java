package br.ifrn.pi.sib.controllers;

import br.ifrn.pi.sib.models.User;
import br.ifrn.pi.sib.repositorio.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepo repo;

    @GetMapping("/users")
    public String index(Model model) {
        List<User> users = (List<User>) repo.findAll();
        model.addAttribute("users", users);
        return "users/index";
    }

    @GetMapping("/users/create")
    public String create() {
        return "users/create";
    }

    @PostMapping("/users/salvar")
    public String salvar(User user) {
        repo.save(user);
        return "redirect:/users";
    }

    @GetMapping("/users/login")
    public String login() {
        return "users/login";
    }

}
