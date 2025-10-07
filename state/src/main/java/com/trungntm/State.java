package com.trungntm;

/**
 * The State interface defines the common methods that all concrete states should implement.
 * These methods represent the actions that can be performed in different states.
 */
public interface State {
    void play(MusicPlayer player);
    void pause(MusicPlayer player);
    void stop(MusicPlayer player);
    void close(MusicPlayer player);
    String getStateName();
}
