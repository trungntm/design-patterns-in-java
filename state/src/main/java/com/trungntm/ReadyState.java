package com.trungntm;

/**
 * ReadyState represents the state when the music player is ready to play music.
 * In this state, the player can start playing, but pause and stop have no effect.
 */
public class ReadyState implements State {

    @Override
    public void play(MusicPlayer player) {
        System.out.println("Starting to play music...");
        player.setCurrentSong("Default Song");
        player.setPlaying(true);
        player.setState(new PlayState());
    }

    @Override
    public void pause(MusicPlayer player) {
        System.out.println("Cannot pause - no music is currently playing");
    }

    @Override
    public void stop(MusicPlayer player) {
        System.out.println("Cannot stop - no music is currently playing");
    }

    @Override
    public void close(MusicPlayer player) {
        System.out.println("Closing music player from ready state...");
        player.setPlaying(false);
        player.setCurrentSong("");
        player.setState(new CloseState());
    }

    @Override
    public String getStateName() {
        return "Ready";
    }
}
