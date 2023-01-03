package hust.soict.aims.cart;

import hust.soict.aims.media.MediaObjects;
import hust.soict.aims.media.disc.DigitalVideoDisc;

public class CartTest extends MediaObjects {
    public static void main(String[] args) {

        Cart cart = new Cart();

        // Lab3: Test overloaded function
        cart.addMedia(dvd1);
        // Works for both array and varagrs
        cart.addMedia(new DigitalVideoDisc[] { dvd1, dvd2, dvd3, dvd1, dvd3, dvd2, dvd1 });
        // Works for varagrs only
        cart.addMedia(dvd3, dvd3);

        // Lab3: test displayCart and searchCart methods
        cart.displayCart();
        cart.searchCart("the lioN King");
        cart.searchCart("titanic");
        cart.searchCart(2);
        cart.searchCart(3);
    }
}
