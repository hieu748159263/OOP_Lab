package test.aims;

import main.aims.Aims;
import main.aims.media.Media;
import test.resources.MediaObjects;

public class AimsTest extends MediaObjects {
    public static void main(String[] args) {
        Media[] mediae = { dvd1, dvd2, dvd3, book1, book2, book3, book4, cd1, cd2 };
        Aims aims = new Aims(mediae);
        aims.start();
    }
}
