package com.akkanben.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class AlbumController {
    @GetMapping("albums")
    public String getAlbumPage(Model m) {
        ArrayList<Album> albums = getAlbumArrayList();
        m.addAttribute("albums", albums);
        return "album.html";
    }

    public ArrayList<Album> getAlbumArrayList() {
        ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album("Zopilote Machine", "The Mountain Goats", 19,
                2445,
                "https://coverartarchive.org/release/f1cf52f8-a351-3e24-8109-9f65e2fe1430/7927164867.jpg"));
        albums.add(new Album("The Coroner's Gambit", "The Mountain Goats", 16,
                2587, "https://coverartarchive.org/release/e022d75b-efad-4e5d-a192-970888da9532/7927188368.jpg"));
        albums.add(new Album("Getting Into Knives", "The Mountain Goats", 13,
                3400,
                "https://coverartarchive.org/release/3a969fd1-3dd1-41e3-9cb1-8f024cc64789/27739115214-250.jpg"));
        return albums;
    }
}
