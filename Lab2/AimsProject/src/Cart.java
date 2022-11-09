import java.util.ArrayList;

public class Cart {
    
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<DigitalVideoDisc>();
    private int qtyOrdered = 0;

    public int getQtyOrdered(){
        return qtyOrdered;
    }

    public boolean addDigitalVideoDisc(DigitalVideoDisc disc){
        if (!(qtyOrdered < MAX_NUMBERS_ORDERED)){
            System.out.println("The cart is full. Can't add more!");
            return false;
        }
        itemsOrdered.add(disc);
        qtyOrdered++;
        return true;
    }

    public boolean removeDigitalVideoDisc(DigitalVideoDisc disc){
        if (!itemsOrdered.contains(disc)){
            System.out.println("The disc is not in the cart. Can't remove!");
            disc.printDetail();
            return false;
        }
        itemsOrdered.remove(disc);
        qtyOrdered--;
        return true;
    }

    public double totalCost(){
        double total = 0;
        for (DigitalVideoDisc disc : itemsOrdered){
            total += disc.getCost();
        }
        return total;
    }

    public void displayCart(){
        System.out.println("*****************Cart detail*****************\n");
        for (int i = 0; i < qtyOrdered; i++){
            System.out.format("Items %d:\n", i+1);
            itemsOrdered.get(i).printDetail();
        }
    }
}