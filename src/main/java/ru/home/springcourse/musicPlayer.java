package ru.home.springcourse;

public class musicPlayer {


    private Music music;
    private String name;
    private int volume;

    public musicPlayer() {};
    public musicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        System.out.println("Проигрывается " + music.getSong());
    }
}
