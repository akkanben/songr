package com.akkanben.songr;

import com.akkanben.songr.model.Album;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlbumTest {

    @Test
    void test_constructor() {
        Album sut = new Album("In League With Dragons", "The Mountain Goats",
                12,2903,
                "https://coverartarchive.org/release/df8b0ea3-ed60-4fa3-b3ae-d71cfa4bc238/29548494788-250.jpg");
        assertNotNull(sut);
    }

    @Test
    void test_gettitle() {
        Album sut = new Album("In League With Dragons", "The Mountain Goats",
                12,2903,
                "https://coverartarchive.org/release/df8b0ea3-ed60-4fa3-b3ae-d71cfa4bc238/29548494788-250.jpg");
        assertEquals(sut.getTitle(), "In League With Dragons");
    }

    @Test
    void test_getartist() {
        Album sut = new Album("In League With Dragons", "The Mountain Goats",
                12,2903,
                "https://coverartarchive.org/release/df8b0ea3-ed60-4fa3-b3ae-d71cfa4bc238/29548494788-250.jpg");
        assertEquals(sut.getArtist(), "The Mountain Goats");
    }

    @Test
    void test_getsongcount() {
        Album sut = new Album("In League With Dragons", "The Mountain Goats",
                12,2903,
                "https://coverartarchive.org/release/df8b0ea3-ed60-4fa3-b3ae-d71cfa4bc238/29548494788-250.jpg");
        assertEquals(sut.getSongCount(),12);
    }

    @Test
    void test_getlengthinseconds() {
        Album sut = new Album("In League With Dragons", "The Mountain Goats",
                12,2903,
                "https://coverartarchive.org/release/df8b0ea3-ed60-4fa3-b3ae-d71cfa4bc238/29548494788-250.jpg");
        assertEquals(sut.getLengthInSeconds(),2903);
    }

    @Test
    void test_getimageurl() {
        Album sut = new Album("In League With Dragons", "The Mountain Goats",
                12,2903,
                "https://coverartarchive.org/release/df8b0ea3-ed60-4fa3-b3ae-d71cfa4bc238/29548494788-250.jpg");
        assertEquals(sut.getImageUrl(),"https://coverartarchive.org/release/df8b0ea3-ed60-4fa3-b3ae-d71cfa4bc238/29548494788-250.jpg");
    }

    @Test
    void test_settitle() {
        Album sut = new Album("In League With Dragons", "The Mountain Goats",
                12,2903,
                "https://coverartarchive.org/release/df8b0ea3-ed60-4fa3-b3ae-d71cfa4bc238/29548494788-250.jpg");
        sut.setTitle("DRAGONS");
        assertEquals(sut.getTitle(), "DRAGONS");
    }

    @Test
    void test_setartist() {
        Album sut = new Album("In League With Dragons", "The Mountain Goats",
                12,2903,
                "https://coverartarchive.org/release/df8b0ea3-ed60-4fa3-b3ae-d71cfa4bc238/29548494788-250.jpg");
        sut.setArtist("TMG");
        assertEquals(sut.getArtist(), "TMG");
    }

    @Test
    void test_setsongcount() {
        Album sut = new Album("In League With Dragons", "The Mountain Goats",
                12,2903,
                "https://coverartarchive.org/release/df8b0ea3-ed60-4fa3-b3ae-d71cfa4bc238/29548494788-250.jpg");
        sut.setArtist("TMG");
        sut.setSongCount(1);
        assertEquals(sut.getSongCount(),1);
    }

    void test_setlengthinseconds() {
        Album sut = new Album("In League With Dragons", "The Mountain Goats",
                12,2903,
                "https://coverartarchive.org/release/df8b0ea3-ed60-4fa3-b3ae-d71cfa4bc238/29548494788-250.jpg");
        sut.setLengthInSeconds(100);
        assertEquals(sut.getLengthInSeconds(),100);
    }

    @Test
    void test_setimageurl() {
        Album sut = new Album("In League With Dragons", "The Mountain Goats",
                12,2903,
                "https://coverartarchive.org/release/df8b0ea3-ed60-4fa3-b3ae-d71cfa4bc238/29548494788-250.jpg");
        sut.setImageUrl("https://potato.com");
        sut.setSongCount(1);
        assertEquals(sut.getImageUrl(),"https://potato.com");
    }
}
