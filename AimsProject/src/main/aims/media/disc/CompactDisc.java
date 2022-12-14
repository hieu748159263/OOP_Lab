package main.aims.media.disc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.aims.exception.PlayerException;
import main.aims.track.Track;

public class CompactDisc extends Disc {

    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }

    public CompactDisc() {
    }

    public CompactDisc(int id, String title, String category, double cost, String director, String artist) {
        super(id, title, category, cost, director);
        this.artist = artist;
    }

    public CompactDisc(int id, String title, String category, double cost, String director, String artist,
            Track... tracks) {
        this(id, title, category, cost, director, artist);
        Collections.addAll(this.tracks, tracks);
    }

    public boolean addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track already exists in CD!");
            return false;
        }
        tracks.add(track);
        return true;
    }

    public boolean removeTrack(Track track) {
        if (!tracks.contains(track)) {
            System.out.println("Track doesn't exist in CD!");
            return false;
        }
        tracks.remove(track);
        return true;
    }

    @Override
    public int getLength() {
        int length = 0;
        for (Track track : tracks)
            length += track.getLength();
        return length;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s - %d minute(s): %.2f$", title, category, artist, getLength(), cost);
    }

    public String play() throws PlayerException {
        if (this.getLength() <= 0) {
            throw new PlayerException("ERROR: CD length is non-positive!");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Playing CD: " + this.getTitle() + "\n");
        sb.append("CD length: " + this.getLength() + " minute(s)" + "\n");
        for (Track track : tracks)
            try {
                sb.append(track.play());
            } catch (PlayerException e) {
                throw e;
            }
        return sb.toString();
    }
}
