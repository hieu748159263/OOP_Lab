package main.playable;

import main.aims.exception.PlayerException;

public interface Playable {
    public String play() throws PlayerException;
}
