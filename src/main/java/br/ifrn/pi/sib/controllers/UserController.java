package br.ifrn.pi.sib.controllers;

import br.ifrn.pi.sib.models.User;
import br.ifrn.pi.sib.repositorio.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Controller
public class UserController {
    public static String UPLOAD_DIRECTORY = System.getProperty("user.dir") + "/src/main/resources/static/uploads/";


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

    @GetMapping("/users/edit")
    public String edit() {
        return "users/edit";
    }

    @PostMapping("/users/salvar")
    public String salvar(User user) {
        repo.save(user);
        return "redirect:/users";
    }
    @PostMapping("/users/update")
    public String update(User user, @RequestParam("image") MultipartFile file) throws IOException {
        StringBuilder fileNames = new StringBuilder();
        Path fileNameAndPath = Paths.get(UPLOAD_DIRECTORY, file.getOriginalFilename());
        fileNames.append(file.getOriginalFilename());
        Files.write(fileNameAndPath, file.getBytes());
        repo.save(user);
        return "redirect:/users";
    }

    @GetMapping("/users/login")
    public String login() {
        return "users/login";
    }

}

