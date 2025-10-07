package com.trungntm;

/**
 * CloseState represents the state when the music player is closed.
 * In this state, most operations are not allowed except reopening the player.
 */
public class CloseState implements State {

    @Override
    public void play(MusicPlayer player) {
        System.out.println("Cannot play - music player is closed. Please restart the player.");
    }

    @Override
    public void pause(MusicPlayer player) {
        System.out.println("Cannot pause - music player is closed.");
    }

    @Override
    public void stop(MusicPlayer player) {
        System.out.println("Cannot stop - music player is closed.");
    }

    @Override
    public void close(MusicPlayer player) {
        System.out.println("Music player is already closed.");
    }

    @Override
    public String getStateName() {
        return "Closed";
    }

    /**
     * Special method to restart the player from closed state
     */
    public void restart(MusicPlayer player) {
        System.out.println("Restarting music player...");
        player.setState(new ReadyState());
    }
}
