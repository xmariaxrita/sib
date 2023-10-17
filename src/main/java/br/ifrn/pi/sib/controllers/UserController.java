package br.ifrn.pi.sib.controllers;

import br.ifrn.pi.sib.models.User;
import br.ifrn.pi.sib.repositorio.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
