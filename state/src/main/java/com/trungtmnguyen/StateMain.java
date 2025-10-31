package com.trungtmnguyen;

/**
 * Main class to demonstrate the State design pattern with a music player example.
 * The music player transitions between Ready, Playing, and Closed states.
 */
public class StateMain {
    public static void main(String[] args) {
        System.out.println("=== State Design Pattern Demo - Music Player ===\n");

        // Create a music player (starts in Ready state)
        MusicPlayer player = new MusicPlayer();
        player.displayStatus();

        // Try to play music (Ready -> Playing)
        System.out.println("1. Attempting to play music:");
        player.play();
        player.displayStatus();

        // Try to play again (already playing)
        System.out.println("2. Attempting to play again:");
        player.play();
        player.displayStatus();

        // Pause the music (Playing -> Ready)
        System.out.println("3. Pausing music:");
        player.pause();
        player.displayStatus();

        // Play again (Ready -> Playing)
        System.out.println("4. Playing music again:");
        player.play();
        player.displayStatus();

        // Stop the music (Playing -> Ready)
        System.out.println("5. Stopping music:");
        player.stop();
        player.displayStatus();

        // Try to pause when not playing
        System.out.println("6. Attempting to pause when not playing:");
        player.pause();
        player.displayStatus();

        // Close the player (Ready -> Closed)
        System.out.println("7. Closing the music player:");
        player.close();
        player.displayStatus();

        // Try operations on closed player
        System.out.println("8. Attempting operations on closed player:");
        player.play();
        player.pause();
        player.stop();
        player.close();

        // Restart the player if it's in closed state
        System.out.println("\n9. Restarting the music player:");
        if (player.getCurrentState() instanceof CloseState) {
            CloseState closedState = (CloseState) player.getCurrentState();
            closedState.restart(player);
            player.displayStatus();
        }

        // Demonstrate full cycle again
        System.out.println("10. Full cycle after restart:");
        player.play();
        player.displayStatus();

        player.close();
        player.displayStatus();

        System.out.println("\n=== Demo Complete ===");
    }
}
