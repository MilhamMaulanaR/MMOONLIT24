package helloapp;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Sayur {
    private Stage stage;

    public Sayur(Stage stage){
        this.stage = stage;
    }

    public void show(){
        Image image1 = new Image("C:/Users/LENOVO/Downloads/project/project/Evan/JavaFX/helloapp/app/src/main/resources/sayur1.1.jpg");
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitWidth(100);
        imageView1.setFitHeight(200);
        Button buttonCapcayGorengSayur = new Button();
        buttonCapcayGorengSayur.setGraphic(imageView1);
        buttonCapcayGorengSayur.setOnAction(V -> {
            CapcayGorengSayur capcayGorengSayur = new CapcayGorengSayur(stage);
            capcayGorengSayur.show();
        });

        Image image2 = new Image("C:/Users/LENOVO/Downloads/project/project/Evan/JavaFX/helloapp/app/src/main/resources/sayur2.3.jpg");
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitWidth(100);
        imageView2.setFitHeight(200);
        Button buttonTumisKangkungBawangPutih = new Button();
        buttonTumisKangkungBawangPutih.setGraphic(imageView2);
        buttonTumisKangkungBawangPutih.setOnAction(V -> {
            TumisKangkungBawangPutih tumisKangkungBawangPutih = new TumisKangkungBawangPutih(stage);
            tumisKangkungBawangPutih.show();
        });

        Image image3 = new Image("C:/Users/LENOVO/Downloads/project/project/Evan/JavaFX/helloapp/app/src/main/resources/sayur3.2.jpg");
        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitWidth(100);
        imageView3.setFitHeight(200);
        Button buttonSayurLodeh = new Button();
        buttonSayurLodeh.setGraphic(imageView3);
        buttonSayurLodeh.setOnAction(V -> {
            SayurLodeh sayurLodeh = new SayurLodeh(stage);
            sayurLodeh.show();
        });

        Button button = new Button();
        button.setText("<--Back");
        button.setOnAction(V -> {
            MenuScene pencarianScene = new MenuScene(stage);
            pencarianScene.show(); });

        HBox hBox = new HBox();
        hBox.getChildren().add(buttonCapcayGorengSayur);
        hBox.getChildren().add(buttonTumisKangkungBawangPutih);
        hBox.setAlignment(Pos.CENTER);

        VBox vBox = new VBox();
        vBox.getChildren().add(hBox);
        vBox.getChildren().add(buttonSayurLodeh);
        vBox.getChildren().add(button);
        vBox.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(vBox, 350, 600);
        stage.setScene(scene);
        stage.show();
        
    }
}
