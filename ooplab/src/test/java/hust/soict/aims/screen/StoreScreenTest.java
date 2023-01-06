package hust.soict.aims.screen;

import hust.soict.aims.media.MediaObjects;
import hust.soict.aims.store.Store;

public class StoreScreenTest extends MediaObjects {
    public static void main(String[] args) {
        Store store = new Store(dvd1, dvd2, dvd3, book1, book2, book3, book4, cd1, cd2);
        new StoreScreen(store);
    }
}
