package com.trungntm;

/**
 * PlayState represents the state when the music player is currently playing music.
 * In this state, the player can be paused, stopped, or closed.
 */
public class PlayState implements State {

    @Override
    public void play(MusicPlayer player) {
        System.out.println("Music is already playing: " + player.getCurrentSong());
    }

    @Override
    public void pause(MusicPlayer player) {
        System.out.println("Pausing music: " + player.getCurrentSong());
        player.setPlaying(false);
        player.setState(new ReadyState());
    }

    @Override
    public void stop(MusicPlayer player) {
        System.out.println("Stopping music: " + player.getCurrentSong());
        player.setPlaying(false);
        player.setCurrentSong("");
        player.setState(new ReadyState());
    }

    @Override
    public void close(MusicPlayer player) {
        System.out.println("Stopping and closing music player...");
        player.setPlaying(false);
        player.setCurrentSong("");
        player.setState(new CloseState());
    }

    @Override
    public String getStateName() {
        return "Playing";
    }
}
