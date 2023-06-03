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
import javafx.geometry.HPos;


public class LoginScene extends BackButton{
    private Stage stage;
    private String backButton;

    LoginScene(Stage stage){
        this.stage = stage;
    }

    public void show(){
        Label labelJudul = new Label("FOODIE'S HAVEN");
        labelJudul.setId("labeljudullogin");
        // labelJudul.setStyle("-fx-font-family: Inria sans; -fx-font-size: 25px; -fx-text-fill: #000000; -fx-font-weight: bold");
        Label labelJuLabel2 = new Label("Cookbook Recipes");
        labelJuLabel2.setId("judulloginsecodary");
        // labelJuLabel2.setStyle("-fx-font-family: Inria sans; -fx-font-size: 12px; -fx-text-fill: #000000; -fx-font-weight: bold");

        TextField textField = new TextField();
        textField.setPromptText("Masukkan Nama");
        TextField textField2 = new TextField();
        textField2.setPromptText("Masukkan Password");

        VBox vBoxJudul = new VBox(0);
        vBoxJudul.getChildren().add(labelJudul);
        vBoxJudul.getChildren().add(labelJuLabel2);
        vBoxJudul.setAlignment(Pos.TOP_CENTER);

        VBox VBoxLogin =  new VBox(5);
        VBoxLogin.getChildren().add(textField);
        VBoxLogin.getChildren().add(textField2);

        Button buttonLogIn = new Button("Log in");
        buttonLogIn.setId("ButtonLogin");
        buttonLogIn.setOnAction(V -> {
            MenuScene menuScene = new MenuScene(stage);
            menuScene.show();
        });

        Button backButton = new Button(button());
        backButton.setOnAction(V -> {
            HomeScene homeScene = new HomeScene(stage);
            homeScene.show();
        });

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(70));
        gridPane.add(vBoxJudul, 0, 0);
        gridPane.add(VBoxLogin, 0, 6);
        gridPane.add(buttonLogIn, 0, 7);
        gridPane.add(backButton, 0, 8);
        gridPane.setAlignment(Pos.CENTER);
        GridPane.setHalignment(buttonLogIn, HPos.CENTER);
        gridPane.setStyle("-fx-background-color: #FFD634");
        gridPane.setAlignment(Pos.TOP_CENTER);

        Scene scene = new Scene(gridPane, 350, 600);
        scene.getStylesheets().add(getClass().getResource("/CSS/login.css").toExternalForm());
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @Override
    public String button() {
        String a = "Back";
        return a;
    }
}
