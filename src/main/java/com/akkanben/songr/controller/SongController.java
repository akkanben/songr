package com.akkanben.songr.controller;

import com.akkanben.songr.repository.AlbumRepository;
import com.akkanben.songr.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SongController {
    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository albumRepository;

}
