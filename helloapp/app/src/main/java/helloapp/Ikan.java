package helloapp;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;

public class Ikan {
    private Stage stage;

    public Ikan(Stage stage){
        this.stage = stage;
    }

    public void show(){
        Image image1 = new Image("/image/ikan1.1.jpg");
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitWidth(135);
        imageView1.setFitHeight(200);
        Button buttonIkanBakarBumbuBali = new Button();
        buttonIkanBakarBumbuBali.setId("BUTTONJENISBAHAN");
        buttonIkanBakarBumbuBali.setGraphic(imageView1);
        buttonIkanBakarBumbuBali.setOnAction(V -> {
            IkanBakarBumbuBali ikanBakarBumbuBali = new IkanBakarBumbuBali(stage);
            ikanBakarBumbuBali.show();

        });
        Image image2 = new Image("/image/ikan2.1.jpg");
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitWidth(135);
        imageView2.setFitHeight(200);
        Button buttonIkanGorengTepungAsamManis = new Button();
        buttonIkanGorengTepungAsamManis.setId("BUTTONJENISBAHAN");
        buttonIkanGorengTepungAsamManis.setGraphic(imageView2);
        buttonIkanGorengTepungAsamManis.setOnAction(V -> {
            IkanGorengTepungAsamManis ikanGorengTepungAsamManis = new IkanGorengTepungAsamManis(stage);
            ikanGorengTepungAsamManis.show();
        });
        
        Image image3 = new Image("/image/ikan3.2.jpg");
        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitWidth(135);
        imageView3.setFitHeight(200);
        Button buttonSupIkanTomat = new Button();
        buttonSupIkanTomat.setGraphic(imageView3);
        buttonSupIkanTomat.setId("BUTTONJENISBAHAN");
        buttonSupIkanTomat.setOnAction(V -> {
            SupIkanTomat supIkanTomat = new SupIkanTomat(stage);
            supIkanTomat.show();
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
        
        Label labelGambar1 = new Label("Ikan Bakar Bumbu Bali ");
        labelGambar1.setStyle(" -fx-font-family:poppins;-fx-font-size: 14px; -fx-text-fill: #000000; -fx-font-weight: bold");
        labelGambar1.setAlignment(Pos.CENTER);

        Label labelGambar2 = new Label("  Ikan Asam Manis");
        labelGambar2.setStyle(" -fx-font-family:poppins;-fx-font-size: 14px; -fx-text-fill: #000000; -fx-font-weight: bold");
        labelGambar2.setAlignment(Pos.CENTER);

        Label labelGambar3 = new Label("Sup Ikan Tomat");
        labelGambar3.setStyle(" -fx-font-family:poppins;-fx-font-size: 14px; -fx-text-fill: #000000; -fx-font-weight: bold");
        labelGambar3.setAlignment(Pos.CENTER);

        Button button = new Button();
        button.setText("<--Back");
        button.setOnAction(V -> {
            MenuScene pencarianScene = new MenuScene(stage);
            pencarianScene.show(); });

        HBox hBox = new HBox(10);
        hBox.getChildren().add(buttonIkanBakarBumbuBali);
        hBox.getChildren().add(buttonIkanGorengTepungAsamManis);
        hBox.setAlignment(Pos.CENTER);

        HBox hbox2 = new HBox(20);
        // hBox2.getChildren().add(labelGambar1);
        // hBox2.getChildren().add(labelGambar2);
        // hBox2.setAlignment(Pos.CENTER);
        hbox2.getChildren().add(labelGambar1);
        hbox2.getChildren().add(labelGambar2);
        // hbox2.getChildren().add(labelGambar3);
        hbox2.setAlignment(Pos.CENTER);

        VBox vBox = new VBox(10);
        vBox.getChildren().add(hBox);
        vBox.getChildren().add(hbox2);
        vBox.getChildren().add(buttonSupIkanTomat);
        vBox.getChildren().add(labelGambar3);
        vBox.getChildren().add(button);
        vBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vBox,350,600);
        scene.getStylesheets().add(getClass().getResource("/CSS/menuscene.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}