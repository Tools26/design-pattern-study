package org.example;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer(AudioType.MP3, "뱅뱅뱅.mp3");
        audioPlayer.play();

        System.out.println("--------------------------------------");
        
        AdvancedMediaPlayer mp3Player = new Mp3Player("뱅뱅뱅.mp3");
        MediaAdapter mediaAdapter = new MediaAdapter(mp3Player);
        mediaAdapter.play();

        AdvancedMediaPlayer wavPlayer = new WavPlayer("뱅뱅뱅.wav");
        mediaAdapter.setAdvancedMediaPlayer(wavPlayer);
        mediaAdapter.play();
    }
}