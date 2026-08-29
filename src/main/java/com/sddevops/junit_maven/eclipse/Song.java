package com.sddevops.junit_maven.eclipse;

public class Song {
    private String id;
    private String title;
    private String artist;
    private double songLength;

    public Song(String id, String title, String artist, double songLength) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.songLength = songLength;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public double getSongLength() { return songLength; }

    @Override
    public String toString() {
        return title + " by " + artist;
    }
}

