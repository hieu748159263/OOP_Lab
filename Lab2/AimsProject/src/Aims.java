public class Aims {
    public static void main(String[] args) throws Exception {

        // Create new disks
        DigitalVideoDisc disc1 = new DigitalVideoDisc("Not a title");
        DigitalVideoDisc disc2 = new DigitalVideoDisc("Real title", "Horror", "Tom Holland", 200, 20.00);
        DigitalVideoDisc disc3 = new DigitalVideoDisc("Test disc", "Humor", "A Trunk", 20.00);
        DigitalVideoDisc disc4 = new DigitalVideoDisc("Final test", "Final director", 300.00);
        // disc1.printDetail();
        // disc2.printDetail();
        // disc3.printDetail();
        // disc4.printDetail();

        // Create a new cart
        Cart cart1 = new Cart();
        cart1.addDigitalVideoDisc(disc1);
        cart1.addDigitalVideoDisc(disc2);
        // cart1.addDigitalVideoDisc(disc3);
        cart1.addDigitalVideoDisc(disc4);
        cart1.addDigitalVideoDisc(disc2);
        cart1.addDigitalVideoDisc(disc4);

        // Test cart function
        System.out.println("Quantity of discs in cart: " + cart1.getQtyOrdered());
        cart1.displayCart();
        cart1.removeDigitalVideoDisc(disc3);
        System.out.println("Quantity of discs in cart: " + cart1.getQtyOrdered());
        cart1.displayCart();
        System.out.println("Total cost: " + cart1.totalCost() + "$");
    }
}
