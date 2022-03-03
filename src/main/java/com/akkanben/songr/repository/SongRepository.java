package com.akkanben.songr.repository;

import com.akkanben.songr.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
