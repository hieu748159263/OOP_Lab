package aims.disc;

public class DigitalVideoDisc {

    /**
     * Lab3: Define classifier member
     */
    private static int nbDigitalVideoDisc = 0;
    private int id;

    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public double getCost() {
        return cost;
    }

    /**
     * Constructor of class {@link DigitalVideoDisc}.
     * <p>
     */
    public DigitalVideoDisc(String title) {
        // Week3 modifications
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, double cost) {
        this(title);
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, double cost) {
        this(title, category, cost);
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        this(title, category, director, cost);
        this.length = length;
    }

    /**
     * Lab3: Override toString method
     */
    @Override
    public String toString() {
        return String.format("%s - %s - %s - %d page(s): %.2f$", title, category, director, length, cost);
    }

    public void printDetail() {
        System.out.println(toString());
    }

    /**
     * Lab3: isMatch method
     * <p>
     * Check if current {@link DigitalVideoDisc} object has tile <code> title </code>
     */
    public boolean isMatch(String title){
        return this.title.equalsIgnoreCase(title);
    }
}
