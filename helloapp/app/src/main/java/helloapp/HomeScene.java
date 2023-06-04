package helloapp;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomeScene {
    private Stage stage;
    
    public HomeScene(Stage stage){
        this.stage = stage;
    }

    public void show(){
        // Label label1 = new Label("Premium Recipes");
        // Label label2 = new Label("It's");
        // Label label3 = new Label("Cooking");
        // Label label4 = new Label("Time!");
        // // Image image = new Image ("icon/Group 6");
        ImageView imageView = new ImageView("/icon/Group6.png");
        imageView.setFitWidth(350);
        imageView.setFitHeight(600);

        Button buttonMulai = new Button("Get Started");
        buttonMulai.setId("BUTTONMULAI");
        // buttonMulai.setLayoutY(100);
        buttonMulai.setOnAction(V -> {
            MenuScene menuScene = new MenuScene(stage);
            menuScene.show();
        });


        
        VBox vBox = new VBox();
        vBox.getChildren().add(buttonMulai);
        vBox.setAlignment(Pos.BOTTOM_CENTER);

        // GridPane gridPane = new GridPane();
        // gridPane.setPadding(new Insets(10));
        // gridPane.setHgap(5);
        // gridPane.setVgap(5);
        // gridPane.add(label1,1,0);
        // gridPane.add(label2,1,1);
        // gridPane.add(label3,1,2);
        // gridPane.add(label4,1,3);
        // gridPane.add(buttonMulai,1,4);
        // gridPane.setAlignment(Pos.BOTTOM_LEFT);

        StackPane pane = new StackPane(imageView,vBox);

        Scene scene = new Scene(pane, 350, 600);
        scene.getStylesheets().add(getClass().getResource("/CSS/style.css").toExternalForm());
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}