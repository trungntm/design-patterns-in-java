# State Design Pattern - Music Player

This module demonstrates the State design pattern implementation using a music player example with three states: Ready, Playing, and Closed.

## Pattern Overview

The State pattern allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

## Components

### 1. State Interface (`State.java`)
- Defines the common interface for all concrete states
- Declares methods: `play()`, `pause()`, `stop()`, `close()`, and `getStateName()`

### 2. Context (`MusicPlayer.java`)
- Maintains a reference to the current state
- Delegates state-specific behavior to the current state object
- Manages player properties like current song and playing status

### 3. Concrete States

#### ReadyState (`ReadyState.java`)
- Initial state when the player is ready to play
- Can transition to PlayState when play() is called
- Can transition to CloseState when close() is called

#### PlayState (`PlayState.java`)
- State when music is currently playing
- Can transition to ReadyState when pause() or stop() is called
- Can transition to CloseState when close() is called

#### CloseState (`CloseState.java`)
- State when the music player is closed
- Most operations are disabled
- Provides restart() method to return to ReadyState

## State Transitions

```
Ready ──play()──> Playing
  │                  │
  │                pause()/stop()
  │                  │
  │                  ▼
  └──close()──> Closed <──close()──┘
      ▲               │
      │          restart()
      └───────────────┘
```

## Benefits

1. **Eliminates conditional statements** - No need for large switch/if statements
2. **Single Responsibility** - Each state handles its own behavior
3. **Open/Closed Principle** - Easy to add new states without modifying existing code
4. **State transitions are explicit** - Clear visibility of how states change

## Example Output

The demo shows various state transitions and how the music player behaves differently in each state, demonstrating the core principle of the State pattern where an object's behavior changes based on its internal state.
