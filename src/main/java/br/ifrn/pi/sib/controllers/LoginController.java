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
public class LoginController {

    @Autowired
    private UserRepo repo;

    @GetMapping("/login")
    public String index(){
        return "users/login";
    }

    @PostMapping ("/logar")
    public String logar(Model model, User admParam, String lembrar){
        User adm = this.repo.Login(admParam.getEmail(), admParam.getSenha());
        if(adm != null) {
            return "redirect:/";
        }
        model.addAttribute("erro", "Usuário ou senha inválidos");
        return "users/login";
    }

}
