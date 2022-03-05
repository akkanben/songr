package com.akkanben.songr.controller;

import com.akkanben.songr.model.Album;
import com.akkanben.songr.model.Song;
import com.akkanben.songr.repository.AlbumRepository;
import com.akkanben.songr.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository albumRepository;


    @PostMapping("addSong")
    public RedirectView addSong(long albumId, String title, int lengthInSeconds, int trackNumber) {
        Album album = albumRepository.getById(albumId);
        Song song = new Song(title, lengthInSeconds, trackNumber);
        song.setAlbum(album);
        songRepository.save(song);
        album.calculateAlbumLength();
        albumRepository.save(album); // to save the updated album length
        return new RedirectView("/album-detail/" + albumId);
    }

    @GetMapping("songs")
    public String getSongsPage(Model m) {
        List<Song> songs = songRepository.findAll();
        m.addAttribute("songs", songs);
        return "songs.html";
    }

    @DeleteMapping("/delete-song")
    public RedirectView deleteSong(long songId) {
        Song song = songRepository.getById(songId);
        Album album = song.getAlbum();
        long albumId = album.getId();
        songRepository.deleteById(songId);
        return new RedirectView("/album-detail/" + albumId);
    }
}
