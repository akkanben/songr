package com.akkanben.songr.controller;

import com.akkanben.songr.model.Album;
import com.akkanben.songr.model.Song;
import com.akkanben.songr.repository.AlbumRepository;
import com.akkanben.songr.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

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
        return new RedirectView("/album-detail/" + albumId);
    }
}
