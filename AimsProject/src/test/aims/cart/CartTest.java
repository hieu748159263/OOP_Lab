package test.aims.cart;

import javax.naming.LimitExceededException;

import main.aims.cart.Cart;
import main.aims.media.disc.DigitalVideoDisc;
import test.resources.MediaObjects;

public class CartTest extends MediaObjects {
    public static void main(String[] args) {

        Cart cart = new Cart();

        // Lab3: Test overloaded function
        try {
            cart.addMedia(dvd1);
        } catch (LimitExceededException e) {
            e.printStackTrace();
        }
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
