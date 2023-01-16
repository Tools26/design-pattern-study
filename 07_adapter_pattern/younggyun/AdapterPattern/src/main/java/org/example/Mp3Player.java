package org.example;

public class Mp3Player implements AdvancedMediaPlayer {
    private final String fileName;
    private final AudioType audioType = AudioType.MP3;

    public Mp3Player(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing mp3 file. Name: "+ fileName);
    }
}
