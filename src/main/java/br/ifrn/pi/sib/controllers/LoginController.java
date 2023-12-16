package br.ifrn.pi.sib.controllers;

import br.ifrn.pi.sib.models.User;
import br.ifrn.pi.sib.repositorio.UserRepo;
import br.ifrn.pi.sib.service.CookieService;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    private UserRepo repo;

    @GetMapping("/login")
    public String index() {
        return "users/login";
    }

    @PostMapping("/logar")
    public String logar(Model model, User uParam, String lembrar, HttpServletResponse response) throws IOException {
        User u = this.repo.Login(uParam.getEmail(), uParam.getSenha());
        if (u != null) {
            int tempoLogado = (60 * 60); // * Cookie de 1h
            if (lembrar != null)
                tempoLogado = (60 * 60 * 24 * 365); // * Cookie de 1 ano
            CookieService.setCookie(response, "usuariosId", String.valueOf(u.getId()), tempoLogado);
            CookieService.setCookie(response, "nomeUsuario", String.valueOf(u.getNome()), tempoLogado);
            return "redirect:/";
        }
        model.addAttribute("erro", "Usuário ou senha inválidos");
        return "users/login";
    }

    // * Rota de sair
    // TODO: fazer o menu com a opção de sair!
    @GetMapping("/sair")
    public String sair(HttpServletResponse response) throws IOException {

        CookieService.setCookie(response, "usuariosId", "", 0);
        return "redirect:/";
    }
}
