package test.store;

import test.dvdObjects;
import aims.store.Store;

public class StoreTest extends dvdObjects {
    public static void main(String[] args) {

        // Lab3: test addDvd and removeDvd methods
        Store store = new Store();

        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);
        store.addDVD(dvd2);
        store.printDetail();
        System.out.println();

        store.removeDVD(dvd3);
        store.removeDVD(dvd3);
        store.printDetail();
    }
}
