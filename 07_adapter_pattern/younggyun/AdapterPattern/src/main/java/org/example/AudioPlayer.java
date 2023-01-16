package org.example;

public class AudioPlayer implements MediaPlayer {
    AudioType audioType;
    String fileName;

    public AudioPlayer(AudioType audioType, String fileName) {
        this.audioType = audioType;
        this.fileName = fileName;
    }

    public void play() {
        if (audioType == AudioType.MP3) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if(audioType == AudioType.WAV) {
            System.out.println("Playing wav file. Name: " + fileName);
        }
    }
}
