package sample;


import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import java.util.Optional;

public class AlertBox {

    /*            A Box warning the user of a issue        */

    public static void startAlertBox(String message) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Pastebin App");
        alert.setHeaderText(null);
        alert.setContentText(message);

        ButtonType buttonTypeOne = new ButtonType("OK");

        alert.getButtonTypes().setAll(buttonTypeOne);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            alert.close();
        }
    }

}
