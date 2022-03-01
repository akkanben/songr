package com.akkanben.songr;

public class Album {
    String title;
    String artist;
    int songCount;
    int lengthInSeconds;
    String imageUrl;

    public Album(String title, String artist, int songCount, int lengthInSeconds, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthInSeconds = lengthInSeconds;
        this.imageUrl = imageUrl;
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
