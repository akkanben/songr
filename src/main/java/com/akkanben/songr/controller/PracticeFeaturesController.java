package com.akkanben.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class PracticeFeaturesController {
    @GetMapping("hello")
    public String helloWorld() {
        return "hello.html";
    }

    @GetMapping("capitalize/{textToCapitalize}")
    public String capitalizeText(Model m, @PathVariable String textToCapitalize) {
       m.addAttribute("theStringToCapitalize", textToCapitalize.toUpperCase());
       return "capitalize.html";
    }

    @GetMapping("hello/{name}")
    public String helloName(Model m, @PathVariable String name) {
        m.addAttribute("name",name);
        return "hello.html";
    }

}
