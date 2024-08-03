package com.example.E_commerce;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class controller {
    private final List<UserData> list = new ArrayList<>();

    @GetMapping(path = "/")
    public String index() {
        return "index";
    }

    @PostMapping(path = "/model")
    public String submit(@RequestParam String login, @RequestParam String password, Model model) {
        list.add(new UserData(login, password));
        model.addAttribute("list", list);
        return "model";
    }
}
