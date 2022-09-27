package org.utl.dsm_401d_veterinaria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class Main extends Application {
    Parent root;
    @Override
    public void start(Stage primaryStage) throws Exception {
        root = FXMLLoader.load(Main.class.getResource("principal.fxml"));
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("veterinaria");
        primaryStage.setResizable(false);
        primaryStage.show();

    }
    public static void main (String[] args){
        launch();
    }
}
