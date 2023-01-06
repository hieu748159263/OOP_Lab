package hust.soict.aims.store;

import hust.soict.aims.media.Media;

import java.util.ArrayList;
import java.util.Collections;

public class Store {

    private ArrayList<Media> storeItems = new ArrayList<Media>();

    public ArrayList<Media> getStoreItems() {
        return storeItems;
    }

    public Store() {
    }

    public Store(Media... media) {
        Collections.addAll(storeItems, media);
    }

    public void printDetail() {
        System.out.println("Store items:");
        for (Media media : storeItems) {
            media.printDetail();
        }
    }

    public boolean addMedia(Media media) {
        if (storeItems.contains(media))
            return false;
        storeItems.add(media);
        return true;
    }

    public boolean removeMedia(Media media) {
        if (!storeItems.contains(media)) {
            System.out.println("The media is not in the store. Can't remove!");
            return false;
        }
        storeItems.remove(media);
        return true;
    }

    public Media searchMedia(String title) {
        return storeItems.stream().filter(media -> media.getTitle().equalsIgnoreCase(title)).findFirst().orElse(null);
    }
}
