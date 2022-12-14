package test.aims.media.disc;

import main.aims.media.disc.DigitalVideoDisc;

class TestPassingParameter {
    public static void main(String[] args) throws Exception {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        // changeTitle(jungleDVD, cinderellaDVD.getTitle());
        // System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    // Failed swap method
    // public static void swap(Object o1, Object o2) {
    // Object tmp = o1;
    // o1 = o2;
    // o2 = tmp;
    // }

    // Successful swap method
    public static void swap(DigitalVideoDisc o1, DigitalVideoDisc o2) {
        String tmpTitle = o1.getTitle();
        o1.setTitle(o2.getTitle());
        o2.setTitle(tmpTitle);
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
