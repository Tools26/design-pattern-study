package org.example;

public class WavPlayer implements AdvancedMediaPlayer{
    private final String fileName;
    private final AudioType audioType = AudioType.WAV;

    public WavPlayer(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing wav file. Name: "+ fileName);
    }
}
