package com.akkanben.songr.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column(columnDefinition = "text")
    String title;
    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
    @OrderBy("trackNumber")
    List<Song> trackList;
    String artist;
    int songCount;
    int lengthInSeconds;
    String imageUrl;

    public Album() {
        //empty
    }

    public Album(String title, String artist, int songCount, int lengthInSeconds, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthInSeconds = lengthInSeconds;
        this.imageUrl = imageUrl;
    }

    public void calculateAlbumLength() {
        int total = 0;
        for(Song track : trackList) {
            total += track.length;
        }
        lengthInSeconds = total;
    }

    public long getId() {
        return id;
    }

    public List<Song> getTrackList() {
        return trackList;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public void setLengthInSeconds(int lengthInSeconds) {
        this.lengthInSeconds = lengthInSeconds;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
