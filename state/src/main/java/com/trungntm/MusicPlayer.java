package com.trungntm;

/**
 * The MusicPlayer class is the context that maintains a reference to the current state
 * and delegates state-specific behavior to the current state object.
 */
public class MusicPlayer {
    private State currentState;
    private String currentSong;
    private boolean isPlaying;

    public MusicPlayer() {
        this.currentState = new ReadyState();
        this.currentSong = "";
        this.isPlaying = false;
        System.out.println("Music Player initialized in Ready state");
    }

    public void setState(State state) {
        this.currentState = state;
        System.out.println("State changed to: " + state.getStateName());
    }

    public State getCurrentState() {
        return currentState;
    }

    public void play() {
        currentState.play(this);
    }

    public void pause() {
        currentState.pause(this);
    }

    public void stop() {
        currentState.stop(this);
    }

    public void close() {
        currentState.close(this);
    }

    public void setCurrentSong(String song) {
        this.currentSong = song;
    }

    public String getCurrentSong() {
        return currentSong;
    }

    public void setPlaying(boolean playing) {
        this.isPlaying = playing;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void displayStatus() {
        System.out.println("Current State: " + currentState.getStateName());
        System.out.println("Current Song: " + (currentSong.isEmpty() ? "None" : currentSong));
        System.out.println("Is Playing: " + isPlaying);
        System.out.println("---");
    }
}
