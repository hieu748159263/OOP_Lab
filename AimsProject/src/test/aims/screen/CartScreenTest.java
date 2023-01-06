package test.aims.screen;

import main.aims.cart.Cart;
import main.aims.screen.CartScreen;
import test.resources.MediaObjects;

public class CartScreenTest extends MediaObjects {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addMedia(dvd1, book3, cd2);
        new CartScreen(cart);
    }
}
