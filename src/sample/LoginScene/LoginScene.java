package sample.LoginScene;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginScene {

    public void Login(ActionEvent event) throws IOException {
        Parent view2 = FXMLLoader.load(getClass().getResource("loginScreen.fxml"));
        Scene scene2 = new Scene(view2, 305, 350);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    /* CLODIO WAS GONNA IMPLEMENT THE LOGIN FEATURE TO LOGIN INTO PASTEBIN. BUT HE WASNT FEELING IT. */
    /*                 CLODIO DOESNT WANT A LOGIN FEATURE BUT IF SOMEONE WANTS IT THEN HERE.        */
}
