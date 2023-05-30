package helloapp;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Ikan {
    private Stage stage;

    public Ikan(Stage stage){
        this.stage = stage;
    }

    public void show(){
        Label label = new Label("Ikan");
        Scene scene = new Scene(label, 350, 600);
        stage.setScene(scene);
        stage.show();
    }
}