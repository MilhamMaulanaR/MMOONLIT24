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

public class Daging {
    private Stage stage;

    public Daging(Stage stage){
        this.stage = stage;
    }

    public void show(){
        Image image = new Image("/image/daging1.1.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(135);
        imageView.setFitHeight(200);
        Button buttonRendangDagingPadang = new Button();
        buttonRendangDagingPadang.setId("BUTTONJENISBAHAN");
        buttonRendangDagingPadang.setGraphic(imageView);
        buttonRendangDagingPadang.setOnAction(V -> {
            RendangDagingPadang rendangDagingPadang = new RendangDagingPadang(stage);
            rendangDagingPadang.show();
        });
        
        Image image2 = new Image("/image/daging2.2.png");
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitWidth(135);
        imageView2.setFitHeight(200);
        Button buttonSteakDagingBlackPapper = new Button();
        buttonSteakDagingBlackPapper.setId("BUTTONJENISBAHAN");
        buttonSteakDagingBlackPapper.setGraphic(imageView2);
        buttonSteakDagingBlackPapper.setOnAction(V -> {
            SteakDagingBlackPapper steakDagingBlackPapper = new SteakDagingBlackPapper(stage);
            steakDagingBlackPapper.show();
        });
        
        Image image3 = new Image("/image/daging3.2.jpg");
        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitWidth(135);
        imageView3.setFitHeight(200);
        Button buttonDagingTumisBuncis = new Button();
        buttonDagingTumisBuncis.setId("BUTTONJENISBAHAN");
        buttonDagingTumisBuncis.setGraphic(imageView3);
        buttonDagingTumisBuncis.setOnAction(V -> {
            DagingTumisBuncis dagingTumisBuncis = new DagingTumisBuncis(stage);
            dagingTumisBuncis.show();
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
        
        imageView.setClip(rectangle1);
        imageView2.setClip(rectangle);
        imageView3.setClip(rectangle3);
        
        Label labelGambar1 = new Label("Daging Tumis Buncis ");
        labelGambar1.setStyle(" -fx-font-family:poppins;-fx-font-size: 14px; -fx-text-fill: #000000; -fx-font-weight: bold");
        labelGambar1.setAlignment(Pos.CENTER);

        Label labelGambar2 = new Label(" Rendang Daging");
        labelGambar2.setStyle(" -fx-font-family:poppins;-fx-font-size: 14px; -fx-text-fill: #000000; -fx-font-weight: bold");
        labelGambar2.setAlignment(Pos.CENTER);

        Label labelGambar3 = new Label("Daging Black Papper");
        labelGambar3.setStyle(" -fx-font-family:poppins;-fx-font-size: 14px; -fx-text-fill: #000000; -fx-font-weight: bold");
        labelGambar3.setAlignment(Pos.CENTER);

        Button button = new Button();
        button.setText("<--Back");
        button.setOnAction(V -> {
            MenuScene pencarianScene = new MenuScene(stage);
            pencarianScene.show(); 

            // Daging daging = new Daging(stage);
            // daging.show();
        });

        HBox hBox = new HBox();
        hBox.getChildren().add(buttonDagingTumisBuncis);
        hBox.getChildren().add(buttonRendangDagingPadang);
        hBox.setAlignment(Pos.CENTER);

        HBox hbox2 = new HBox(20);
        hbox2.getChildren().add(labelGambar1);
        hbox2.getChildren().add(labelGambar2);
        hbox2.setAlignment(Pos.CENTER);

        VBox vBox = new VBox(10);
        vBox.getChildren().add(hBox);
        vBox.getChildren().add(hbox2);
        vBox.getChildren().add(buttonSteakDagingBlackPapper);
        vBox.getChildren().add(labelGambar3);
        vBox.getChildren().add(button);
        vBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vBox, 350, 600);
        scene.getStylesheets().add(getClass().getResource("/CSS/menuscene.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
