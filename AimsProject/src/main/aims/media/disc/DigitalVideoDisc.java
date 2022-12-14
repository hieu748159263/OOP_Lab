package main.aims.media.disc;

import main.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc {

    private static int nbDigitalVideoDisc = 0;

    public DigitalVideoDisc() {
        this.id = ++nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title) {
        this();
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, double cost, String director) {
        super(++nbDigitalVideoDisc, title, category, cost, director);
    }

    public DigitalVideoDisc(String title, String category, double cost, String director, int length) {
        super(++nbDigitalVideoDisc, title, category, cost, director, length);
    }

    public String play() throws PlayerException{
        if (this.getLength() <= 0){
            throw new PlayerException("ERROR: DVD length is non-positive!");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Playing DVD: " + this.getTitle() + "\n");
        sb.append("DVD length: " + this.getLength() + " minute(s)" + "\n");
        return sb.toString();
    }
}
