package com.akkanben.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

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

}
