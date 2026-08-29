package com.sddevops.junit_maven.eclipse;

import java.util.ArrayList;
import java.util.List;

public class SongCollection {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    public Song fetchSongOfTheDay() {
        return songs.isEmpty() ? null : songs.get(0);
    }
}
