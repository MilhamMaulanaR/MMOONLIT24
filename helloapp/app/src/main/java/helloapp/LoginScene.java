package helloapp;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginScene {
    private Stage stage;

    LoginScene(Stage stage){
        this.stage = stage;
    }

    public void show(){
        Label labelJudul = new Label("FOODIE'S HAVEN");
        labelJudul.setStyle("-fx-font-family: Inria sans; -fx-font-size: 25px; -fx-text-fill: #000000; -fx-font-weight: bold");
        Label labelJuLabel2 = new Label("Cookbook Recipes");
        labelJuLabel2.setStyle("-fx-font-family: Inria sans; -fx-font-size: 12px; -fx-text-fill: #000000; -fx-font-weight: bold");

        TextField textField = new TextField();
        TextField textField2 = new TextField();

        VBox vBoxJudul = new VBox(0);
        vBoxJudul.getChildren().add(labelJudul);
        vBoxJudul.getChildren().add(labelJuLabel2);
        vBoxJudul.setAlignment(Pos.TOP_CENTER);

        VBox VBoxLogin =  new VBox(5);
        VBoxLogin.getChildren().add(textField);
        VBoxLogin.getChildren().add(textField2);

        Button buttonLogIn = new Button("Log in");
        buttonLogIn.setOnAction(V -> {
            MenuScene menuScene = new MenuScene(stage);
            menuScene.show();
        });

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(70));
        gridPane.add(vBoxJudul, 0, 0);
        gridPane.add(VBoxLogin, 0, 6);
        gridPane.add(buttonLogIn, 0, 7);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setStyle("-fx-background-color: #FFD634");
        gridPane.setAlignment(Pos.TOP_CENTER);

        Scene scene = new Scene(gridPane, 350, 600);
        stage.setScene(scene);
        stage.show();
    }
}
