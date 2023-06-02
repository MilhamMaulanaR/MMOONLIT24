package helloapp;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Daging {
    private Stage stage;

    public Daging(Stage stage){
        this.stage = stage;
    }

    public void show(){
        Image image = new Image("/image/daging1.1.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(100);
        imageView.setFitHeight(200);
        Button buttonRendangDagingPadang = new Button();
        buttonRendangDagingPadang.setGraphic(imageView);
        buttonRendangDagingPadang.setOnAction(V -> {
            RendangDagingPadang rendangDagingPadang = new RendangDagingPadang(stage);
            rendangDagingPadang.show();
        });
        
        Image image2 = new Image("/image/daging2.2.png");
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitWidth(100);
        imageView2.setFitHeight(200);
        Button buttonSteakDagingBlackPapper = new Button();
        buttonSteakDagingBlackPapper.setGraphic(imageView2);
        buttonSteakDagingBlackPapper.setOnAction(V -> {
            SteakDagingBlackPapper steakDagingBlackPapper = new SteakDagingBlackPapper(stage);
            steakDagingBlackPapper.show();
        });
        
        Image image3 = new Image("/image/daging3.2.jpg");
        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitWidth(100);
        imageView3.setFitHeight(200);
        Button buttonDagingTumisBuncis = new Button();
        buttonDagingTumisBuncis.setGraphic(imageView3);
        buttonDagingTumisBuncis.setOnAction(V -> {
            DagingTumisBuncis dagingTumisBuncis = new DagingTumisBuncis(stage);
            dagingTumisBuncis.show();
        });

        Button button = new Button();
        button.setText("<--Back");
        button.setOnAction(V -> {
            MenuScene pencarianScene = new MenuScene(stage);
            pencarianScene.show(); });

        HBox hBox = new HBox();
        hBox.getChildren().add(buttonDagingTumisBuncis);
        hBox.getChildren().add(buttonRendangDagingPadang);
        hBox.setAlignment(Pos.CENTER);

        VBox vBox = new VBox(10);
        vBox.getChildren().add(hBox);
        vBox.getChildren().add(buttonSteakDagingBlackPapper);
        vBox.getChildren().add(button);
        vBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vBox, 350, 600);
        stage.setScene(scene);
        stage.show();
    }
}
