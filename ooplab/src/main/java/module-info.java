module hust.soict {
    requires java.desktop;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.swing;
    requires transitive javafx.graphics;

    opens hust.soict.aims.screen to javafx.fxml;

    exports hust.soict.aims.screen;
}
