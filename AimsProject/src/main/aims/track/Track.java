package main.aims.track;

import main.aims.exception.PlayerException;
import main.playable.Playable;

public class Track implements Playable {
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public Track() {
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String play() throws PlayerException {
        if (this.getLength() <= 0) {
            throw new PlayerException("ERROR: Track length is non-positive!");
        }
        return String.format("Playing track: %s - %d minute(s)\n", title, length);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Track))
            return false;
        return this.title.equalsIgnoreCase(((Track) obj).title) && this.length == ((Track) obj).length;
    }
}
