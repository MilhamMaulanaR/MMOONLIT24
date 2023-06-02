package helloapp;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ayam {
    private Stage stage;

    public Ayam(Stage stage){
        this.stage = stage;
    }

    public void show(){
        Image image1 = new Image("/image/ayam3.2.png");
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitWidth(100);
        imageView1.setFitHeight(200);
        Button buttonAyamSzechuan = new Button();
        buttonAyamSzechuan.setGraphic(imageView1);
        buttonAyamSzechuan.setOnAction(V -> {
            AyamSzechuanPedas ayamSzechuanPedas = new AyamSzechuanPedas(stage);
            ayamSzechuanPedas.show();
        });

        Image image2 = new Image("/image/ayam2.1.jpg");
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitWidth(100);
        imageView2.setFitHeight(200);
        Button buttonAyamBakarMadu = new Button();
        buttonAyamBakarMadu.setGraphic(imageView2);
        buttonAyamBakarMadu.setOnAction(V -> {
            AyamBakarMadu ayamBakarMadu = new AyamBakarMadu(stage);
            ayamBakarMadu.show();
        });
        
        HBox hBox = new HBox(20);
        hBox.getChildren().add(buttonAyamBakarMadu);
        hBox.getChildren().add(buttonAyamSzechuan);
        hBox.setAlignment(Pos.CENTER);

        Button button = new Button();
        button.setText("<--Back");
        button.setOnAction(V -> {
            MenuScene pencarianScene = new MenuScene(stage);
            pencarianScene.show(); });

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.add(hBox,1,1);
        gridPane.add(button,1,2);
        gridPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(gridPane, 350, 600);
        stage.setScene(scene);
        stage.show();
    }
}
