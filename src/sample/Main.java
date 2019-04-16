package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application { // main method used to run the application.

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Pastebin app!");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 305, 350));
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
