package main.aims.screen;

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> aa3daabf57abc55b8c9e0dbf8db81696669fb6f2
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import main.aims.cart.Cart;
import main.aims.exception.PlayerException;
import main.aims.media.Media;
import main.playable.Playable;
<<<<<<< HEAD
=======
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import main.aims.cart.Cart;
import main.aims.exception.PlayerException;
import main.aims.media.Media;
>>>>>>> e5b4648 (First cart screen implementation)
=======
>>>>>>> aa3daabf57abc55b8c9e0dbf8db81696669fb6f2

public class CartScreenController {

    private Cart cart;

    @FXML
    private TableView<Media> tblMedia;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediaCategory;

    @FXML
    private TableColumn<Media, Double> colMediaCost;

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> aa3daabf57abc55b8c9e0dbf8db81696669fb6f2
    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;

    @FXML
    private Label labelTotalPrice;

    public CartScreenController(Cart cart) {
        this.cart = cart;
    }

    public void initalize() {
<<<<<<< HEAD
=======
    public CartScreenController(Cart cart) {
        this.cart = cart;
    }

    @FXML
    private void initalize() {
>>>>>>> e5b4648 (First cart screen implementation)
=======
>>>>>>> aa3daabf57abc55b8c9e0dbf8db81696669fb6f2
        colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
        colMediaCategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
        colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Double>("cost"));
        tblMedia.setItems(cart.getItemsOrdered());
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> aa3daabf57abc55b8c9e0dbf8db81696669fb6f2
        labelTotalPrice.setText(cart.totalCost() + " $");

        btnPlay.setVisible(false);
        btnRemove.setVisible(false);

        tblMedia.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<Media>() {
                    @Override
                    public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
                        if (newValue != null)
                            updateButtonBar(newValue);
                    };
                });
    }

    void updateButtonBar(Media media) {
        btnRemove.setVisible(true);
        if (media instanceof Playable) {
            btnPlay.setVisible(true);
        } else {
            btnPlay.setVisible(false);
        }
    }

    @FXML
    void btnPlayPressed(ActionEvent event) {
        try {
            new Alert(AlertType.INFORMATION, ((Playable) tblMedia.getSelectionModel().getSelectedItem()).play()) {
                {
                    this.show();
                }
            };
        } catch (PlayerException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void btnRemovePressed(ActionEvent event) {
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        cart.removeMedia(media);
        labelTotalPrice.setText(cart.totalCost() + " $");
    }

    @FXML
    void btnPlaceOrderPressed(ActionEvent event) {
        Alert alert = new Alert(null);
        if (cart.getItemsOrdered().isEmpty()) {
            alert.setAlertType(AlertType.ERROR);
            alert.setContentText("Cart is empty!");
        } else {
            alert.setAlertType(AlertType.INFORMATION);
            alert.setContentText("Order placed successfully!");
            cart.getItemsOrdered().clear();
        }
        alert.show();
<<<<<<< HEAD
=======
>>>>>>> e5b4648 (First cart screen implementation)
=======
>>>>>>> aa3daabf57abc55b8c9e0dbf8db81696669fb6f2
    }
}
