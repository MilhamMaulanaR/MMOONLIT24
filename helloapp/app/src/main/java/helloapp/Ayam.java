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
import javafx.scene.shape.Rectangle;



public class Ayam {
    private Stage stage;

    public Ayam(Stage stage){
        this.stage = stage;
    }

    public void show(){
        Image image1 = new Image("/image/ayam3.2.png");
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitWidth(135);
        imageView1.setFitHeight(200);
        Button buttonAyamSzechuan = new Button();
        buttonAyamSzechuan.setGraphic(imageView1);
        buttonAyamSzechuan.setId("BUTTONJENISBAHAN");
        buttonAyamSzechuan.setOnAction(V -> {
            AyamSzechuanPedas ayamSzechuanPedas = new AyamSzechuanPedas(stage);
            ayamSzechuanPedas.show();
        });

        Image image2 = new Image("/image/ayam1.2.jpg");
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitWidth(135);
        imageView2.setFitHeight(200);
        Button buttonAyamGorengTepung = new Button();
        buttonAyamGorengTepung.setId("BUTTONJENISBAHAN");
        buttonAyamGorengTepung.setGraphic(imageView2);
        buttonAyamGorengTepung.setOnAction(V -> {
            AyamGorengTepung ayamGorengTepung = new AyamGorengTepung(stage);
            ayamGorengTepung.show();
        });
        Rectangle rectangle1 = new Rectangle(135,200);
        rectangle1.setArcWidth(25);
        rectangle1.setArcHeight(25);

        Rectangle rectangle = new Rectangle(135,200);
        rectangle.setArcWidth(25);
        rectangle.setArcHeight(25);
        
        imageView1.setClip(rectangle1);
        imageView2.setClip(rectangle);
        
        Label labelGambar1 = new Label("Ayam Goreng Tepung");
        labelGambar1.setStyle(" -fx-font-family:poppins;-fx-font-size: 14px; -fx-text-fill: #000000; -fx-font-weight: bold");
        labelGambar1.setAlignment(Pos.CENTER);


        Label labelGambar2 = new Label("  ayam Szchuan");
        labelGambar2.setStyle(" -fx-font-family:poppins;-fx-font-size: 14px; -fx-text-fill: #000000; -fx-font-weight: bold");
        labelGambar2.setAlignment(Pos.CENTER);

        HBox hBox = new HBox(20);
        hBox.getChildren().add(buttonAyamGorengTepung);
        hBox.getChildren().add(buttonAyamSzechuan);
        hBox.setAlignment(Pos.CENTER);

        HBox hbox2 = new HBox(20);
        // hBox2.getChildren().add(labelGambar1);
        // hBox2.getChildren().add(labelGambar2);
        // hBox2.setAlignment(Pos.CENTER);
        hbox2.getChildren().add(labelGambar1);
        hbox2.getChildren().add(labelGambar2);
        hbox2.setAlignment(Pos.CENTER);


        Button button = new Button();
        button.setText("<--Back");
        button.setOnAction(V -> {
            MenuScene pencarianScene = new MenuScene(stage);
            pencarianScene.show(); });


        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.add(hBox,1,1);
        gridPane.add(hbox2,1,2);
        gridPane.add(button,1,3);
        gridPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(gridPane, 350, 600);
        scene.getStylesheets().add(getClass().getResource("/CSS/menuscene.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
