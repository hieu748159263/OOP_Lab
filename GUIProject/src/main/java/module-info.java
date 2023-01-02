module hust.soict {
    requires java.desktop;
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens hust.soict.javafx to javafx.fxml;

    exports hust.soict.javafx;
    exports hust.soict.swing;
}
