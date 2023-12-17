package br.ifrn.pi.sib.controllers;

import br.ifrn.pi.sib.models.User;
import br.ifrn.pi.sib.repositorio.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// ? import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private UserRepo repo;

    @GetMapping("/")
    // ? public String index(Model model, HttpServletRequest request) throws UnsupportedEncodingException
    public String index(Model model) {
        List<User> Usuarios = (List<User>) repo.findAll();
        model.addAttribute("users", Usuarios);
        // ? model.addAttribute("nome", CookieService.getCookie(request, "nomeUsuario"));
        return "index";
    }

}
