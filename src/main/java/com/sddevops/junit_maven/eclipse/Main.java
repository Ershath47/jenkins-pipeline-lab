package com.sddevops.junit_maven.eclipse;

public class Main {
    public static void main(String[] args) {
        SongCollection collection = new SongCollection();
        collection.addSong(new Song("1", "Hello World", "Test Artist", 3.5));
        System.out.println("Song of the Day: " + collection.fetchSongOfTheDay());
    }
}
