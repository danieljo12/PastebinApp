package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.TextFormatter.Change;
import javafx.scene.text.Font;
import sample.pastebinapi.EggMain;
import sample.pastebinapi.PastebinException;
import java.io.Console;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    public Button ResetBtn;
    public Button SubmitBtn;
    public Button LoginBtn;
    public TextArea TxtArea;

    private EggMain pastePost = new EggMain();


    //Submits the text thats in the textarea
    public void SubmitClicked() {
        if (TxtArea.getLength() > 0) {
            SubmitBtn.setText("Submited");

            try {           // trys calling the PostOnPasteBin method so it can post onto the pastebin website
                pastePost.PostOnPasteBin(TxtArea.getText());
            } catch (PastebinException e) {
                e.getStackTrace();          // runs the alert box with the pastebin message
            } catch (IOException e) {
                System.out.println("Error 2");  // this error shouldnt occurr. ever.
            }

        } else {
            SubmitBtn.setText("Type Something!, Try again");
        }
    }

    // Resets the text area. and changes the submit button back to submit
    public void ResetBtnClicked(){
        TxtArea.clear();
        SubmitBtn.setText("Submit");
    }









    /*          LOGIN BUTTON THAT CLODIO WAS GONNA IMPLEMENT
    @FXML
    public void LoginbtnClicked(ActionEvent eventLoginBtn){
        try {
            login.Login(eventLoginBtn);
        } catch (IOException e) {
            System.out.println("Cant find the fxml file ");
        }
    }

     */
}
