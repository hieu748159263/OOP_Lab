package test.aims.media.disc;

import main.aims.exception.PlayerException;
import test.resources.MediaObjects;

public class DiscTest extends MediaObjects {
    public static void main(String[] args) {

        // Lab3: test toString function
        System.out.println(dvd1.toString());
        try {
            System.out.println(dvd1.play());
        } catch (PlayerException e) {
            e.printStackTrace();
        }
    }
}
