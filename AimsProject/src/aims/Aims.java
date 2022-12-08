package aims;

import java.util.Scanner;

import aims.cart.Cart;
import aims.media.Media;
import aims.media.book.Book;
import aims.media.disc.CompactDisc;
import aims.media.disc.DigitalVideoDisc;
import aims.media.disc.Disc;
import aims.store.Store;

public class Aims {

    private static final Scanner scanner = new Scanner(System.in);
    private static Store store = new Store();
    private static Cart cart = new Cart();

    class PrintMenuGetChoice {

        public static int welcome() {
            System.out.println("AIMS - Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. View store");
            System.out.println("2. Update store");
            System.out.println("3. See current cart");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3");
            return scanner.nextInt();
        }

        public static int viewStore() {
            System.out.println("View store - Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media\'s details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");
            return scanner.nextInt();
        }

        public static int updateStore() {
            System.out.println("Update store - Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add a new item");
            System.out.println("2. Remove an item");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            return scanner.nextInt();
        }

        public static int addNewMedia() {
            System.out.println("Add new media - Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add a new book");
            System.out.println("2. Add a new CD");
            System.out.println("3. Add a new DVD");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3");
            return scanner.nextInt();
        }

        public static int viewCart() {
            System.out.println("View cart - Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter medias in cart");
            System.out.println("2. Sort medias in cart");
            System.out.println("3. Remove media from cart");
            System.out.println("4. Play a media");
            System.out.println("5. Place order");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4-5");
            return scanner.nextInt();
        }

        public static int mediaDetails() {
            System.out.println("Media details - Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add to cart");
            System.out.println("2. Play");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            return scanner.nextInt();
        }

        public static int filterCart() {
            System.out.println("Filter cart - Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter by id");
            System.out.println("2. Filter by title");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            return scanner.nextInt();
        }

        public static int sortCart() {
            System.out.println("Sort cart - Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Sort by title");
            System.out.println("2. Sort by cost");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            return scanner.nextInt();
        }
    }

    public static void main(String[] args) throws Exception {
        while (true) {
            int choice = PrintMenuGetChoice.welcome();
            switch (choice) {
                case 1:
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    viewCart();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }

    private static void viewStore() {
        while (true) {
            switch (PrintMenuGetChoice.viewStore()) {
                case 1: {
                    System.out.println("Enter the title of media you want to search: ");
                    scanner.nextLine();
                    Media foundMedia = store.searchMedia(scanner.nextLine());
                    if (foundMedia == null) {
                        System.out.println("Media not found!");
                    } else {
                        foundMedia.printDetail();
                        switch (PrintMenuGetChoice.mediaDetails()) {
                            case 1:
                                if (cart.addMedia(foundMedia))
                                    System.out.println("The cart is full. Can't add more!");
                                else
                                    System.out.println("Added to cart successfully!");
                                break;
                            case 2:
                                if (foundMedia instanceof Disc) {
                                    Disc foundDisc = (Disc) foundMedia;
                                    foundDisc.play();
                                } else {
                                    System.out.println("Media is not CD or DVD. Can't play!");
                                }
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Invalid choice!");
                                break;
                        }
                    }
                }
                    break;
                case 2: {
                    store.printDetail();
                    System.out.println("Enter the title of media you want to add to store: ");
                    scanner.nextLine();
                    Media foundMedia = store.searchMedia(scanner.nextLine());
                    if (foundMedia == null) {
                        System.out.println("Media not found!");
                    } else {
                        if (cart.addMedia(foundMedia))
                            System.out.println("Added to cart successfully!");
                        else
                            System.out.println("The media is already in the store. Can't add!");
                    }
                }
                    break;
                case 3: {
                    System.out.println("Enter the title of media you want to play: ");
                    scanner.nextLine();
                    Media foundMedia = store.searchMedia(scanner.nextLine());
                    if (foundMedia == null) {
                        System.out.println("Media not found!");
                    } else if (foundMedia instanceof Disc) {
                        Disc foundDisc = (Disc) foundMedia;
                        foundDisc.play();
                    } else {
                        System.out.println("Media is not CD or DVD. Can't play!");
                    }
                }
                    break;
                case 4:
                    cart.displayCart();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }

    private static void updateStore() {
        while (true) {
            switch (PrintMenuGetChoice.updateStore()) {
                case 1:
                    switch (PrintMenuGetChoice.addNewMedia()) {
                        case 1: {
                            System.out.println("Enter new book informations: ");
                            System.out.println("Id: ");
                            scanner.nextLine();
                            int id = scanner.nextInt();
                            System.out.println("Title: ");
                            scanner.nextLine();
                            String title = scanner.nextLine();
                            System.out.println("Category: ");
                            String category = scanner.nextLine();
                            System.out.println("Cost: ");
                            double cost = scanner.nextDouble();
                            System.out.println("Author: ");
                            scanner.nextLine();
                            String author = scanner.nextLine();
                            Book newBook = new Book(id, title, category, cost, author);
                            store.addMedia(newBook);
                        }
                            break;
                        case 2: {
                            System.out.println("Enter new CD informations: ");
                            System.out.println("Id: ");
                            scanner.nextLine();
                            int id = scanner.nextInt();
                            System.out.println("Title: ");
                            scanner.nextLine();
                            String title = scanner.nextLine();
                            System.out.println("Category: ");
                            String category = scanner.nextLine();
                            System.out.println("Cost: ");
                            double cost = scanner.nextDouble();
                            System.out.println("Director: ");
                            scanner.nextLine();
                            String director = scanner.nextLine();
                            System.out.println("Artist: ");
                            scanner.nextLine();
                            String artist = scanner.nextLine();
                            CompactDisc newCD = new CompactDisc(id, title, category, cost, director, artist);
                            store.addMedia(newCD);
                        }
                            break;
                        case 3: {
                            System.out.println("Enter new DVD informations: ");
                            System.out.println("Title: ");
                            scanner.nextLine();
                            String title = scanner.nextLine();
                            System.out.println("Category: ");
                            String category = scanner.nextLine();
                            System.out.println("Cost: ");
                            Double cost = scanner.nextDouble();
                            System.out.println("Director: ");
                            scanner.nextLine();
                            String director = scanner.nextLine();
                            System.out.println("Length: ");
                            int length = scanner.nextInt();
                            DigitalVideoDisc newDVD = new DigitalVideoDisc(title, category, cost, director, length);
                            store.addMedia(newDVD);
                        }
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Invalid choice!");
                            break;
                    }
                case 2:
                    store.printDetail();
                    System.out.println("Enter the title of media you want to delete: ");
                    scanner.nextLine();
                    Media foundMedia = store.searchMedia(scanner.nextLine());
                    if (foundMedia == null)
                        System.out.println("Media not found!");
                    else
                        store.removeMedia(foundMedia);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }

    private static void viewCart() {
        while (true) {
            switch (PrintMenuGetChoice.viewCart()) {
                case 1:
                    switch (PrintMenuGetChoice.filterCart()) {
                        case 1:
                            System.out.println("Enter the id of media you want to filter: ");
                            scanner.nextLine();
                            cart.searchCart(scanner.nextInt());
                            break;
                        case 2:
                            System.out.println("Enter the title of media you want to filter: ");
                            scanner.nextLine();
                            cart.searchCart(scanner.nextLine());
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Invalid choice!");
                            break;
                    }
                case 2:
                    switch (PrintMenuGetChoice.sortCart()) {
                        case 1:
                            cart.sortCartByTitle();
                            cart.displayCart();
                            break;
                        case 2:
                            cart.sortCartByCost();
                            cart.displayCart();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Invalid choice!");
                            break;
                    }
                case 3: {
                    System.out.println("Enter the title of media you want to delete: ");
                    scanner.nextLine();
                    Media foundMedia = cart.searchCart(scanner.nextLine());
                    if (foundMedia == null)
                        System.out.println("Media not found!");
                    else
                        cart.removeMedia(foundMedia);
                }
                    break;
                case 4:
                    System.out.println("Enter the title of media you want to play: ");
                    scanner.nextLine();
                    Media foundMedia = cart.searchCart(scanner.nextLine());
                    if (foundMedia == null) {
                        System.out.println("Media not found!");
                    } else if (foundMedia instanceof Disc) {
                        Disc foundDisc = (Disc) foundMedia;
                        foundDisc.play();
                    } else {
                        System.out.println("Media is not CD or DVD. Can't play!");
                    }
                case 5:
                    System.out.println("Order is created!");
                    cart = new Cart();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
