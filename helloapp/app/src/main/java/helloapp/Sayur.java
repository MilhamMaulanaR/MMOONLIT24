package helloapp;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;

public class Sayur {
    private Stage stage;

    public Sayur(Stage stage){
        this.stage = stage;
    }

    public void show(){
        Image image1 = new Image("/image/sayur1.1.jpg");
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitWidth(135);
        imageView1.setFitHeight(200);
        Button buttonCapcayGorengSayur = new Button();
        buttonCapcayGorengSayur.setId("BUTTONJENISBAHAN");
        buttonCapcayGorengSayur.setGraphic(imageView1);
        buttonCapcayGorengSayur.setOnAction(V -> {
            CapcayGorengSayur capcayGorengSayur = new CapcayGorengSayur(stage);
            capcayGorengSayur.show();
        });

        Image image2 = new Image("/image/sayur2.3.jpg");
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitWidth(135);
        imageView2.setFitHeight(200);
        Button buttonTumisKangkungBawangPutih = new Button();
        buttonTumisKangkungBawangPutih.setId("BUTTONJENISBAHAN");
        buttonTumisKangkungBawangPutih.setGraphic(imageView2);
        buttonTumisKangkungBawangPutih.setOnAction(V -> {
            TumisKangkungBawangPutih tumisKangkungBawangPutih = new TumisKangkungBawangPutih(stage);
            tumisKangkungBawangPutih.show();
        });

        Image image3 = new Image("/image/sayur3.2.jpg");
        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitWidth(135);
        imageView3.setFitHeight(200);
        Button buttonSayurLodeh = new Button();
        buttonSayurLodeh.setId("BUTTONJENISBAHAN");
        buttonSayurLodeh.setGraphic(imageView3);
        buttonSayurLodeh.setOnAction(V -> {
            SayurLodeh sayurLodeh = new SayurLodeh(stage);
            sayurLodeh.show();
        });

        Rectangle rectangle1 = new Rectangle(135,200);
        rectangle1.setArcWidth(25);
        rectangle1.setArcHeight(25);

        Rectangle rectangle = new Rectangle(135,200);
        rectangle.setArcWidth(25);
        rectangle.setArcHeight(25);

        Rectangle rectangle3 = new Rectangle(135,200);
        rectangle3.setArcWidth(25);
        rectangle3.setArcHeight(25);
        
        imageView1.setClip(rectangle1);
        imageView2.setClip(rectangle);
        imageView3.setClip(rectangle3);
        
        Label labelGambar1 = new Label("Capcay Sayur ");
        labelGambar1.setStyle(" -fx-font-family:poppins;-fx-font-size: 14px; -fx-text-fill: #000000; -fx-font-weight: bold");
        labelGambar1.setAlignment(Pos.CENTER);

        Label labelGambar2 = new Label("   Tumis Kangkung");
        labelGambar2.setStyle(" -fx-font-family:poppins;-fx-font-size: 14px; -fx-text-fill: #000000; -fx-font-weight: bold");
        labelGambar2.setAlignment(Pos.CENTER);

        Label labelGambar3 = new Label("Sayur Lodeh");
        labelGambar3.setStyle(" -fx-font-family:poppins;-fx-font-size: 14px; -fx-text-fill: #000000; -fx-font-weight: bold");
        labelGambar3.setAlignment(Pos.CENTER);

        Button button = new Button();
        button.setText("<--Back");
        button.setOnAction(V -> {
            MenuScene pencarianScene = new MenuScene(stage);
            pencarianScene.show(); });

        HBox hBox = new HBox();
        hBox.getChildren().add(buttonCapcayGorengSayur);
        hBox.getChildren().add(buttonTumisKangkungBawangPutih);
        hBox.setAlignment(Pos.CENTER);

        HBox hbox2 = new HBox(20);
        hbox2.getChildren().add(labelGambar1);
        hbox2.getChildren().add(labelGambar2);
        hbox2.setAlignment(Pos.CENTER);

        VBox vBox = new VBox();
        vBox.getChildren().add(hBox);
        vBox.getChildren().add(hbox2);
        vBox.getChildren().add(buttonSayurLodeh);
        vBox.getChildren().add(labelGambar3);
        vBox.getChildren().add(button);
        vBox.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(vBox, 350, 600);
        scene.getStylesheets().add(getClass().getResource("/CSS/menuscene.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        
    }
}
