package com.sddevops.junit_maven.eclipse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SongCollectionTest {

    @Test
    void testAddSong() {
        SongCollection collection = new SongCollection();
        Song song = new Song("1", "Test Song", "Tester", 3.0);
        collection.addSong(song);
        assertEquals(1, collection.getSongs().size());
    }

    @Test
    void testFetchSongOfTheDay() {
        SongCollection collection = new SongCollection();
        Song song = new Song("2", "Another Song", "Artist", 4.0);
        collection.addSong(song);
        assertEquals(song, collection.fetchSongOfTheDay());
    }
}
