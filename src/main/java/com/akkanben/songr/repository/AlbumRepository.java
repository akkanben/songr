package com.akkanben.songr.repository;

import com.akkanben.songr.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
    //public Album findByAlbumName(String albumName);
}
