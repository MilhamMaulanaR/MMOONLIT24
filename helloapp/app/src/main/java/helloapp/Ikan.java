package helloapp;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ikan {
    private Stage stage;

    public Ikan(Stage stage){
        this.stage = stage;
    }

    public void show(){
        Image image1 = new Image("C:/Users/LENOVO/Downloads/project/project/Evan/JavaFX/helloapp/app/src/main/resources/ikan1.1.jpg");
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitWidth(100);
        imageView1.setFitHeight(200);
        Button buttonIkanBakarBumbuBali = new Button();
        buttonIkanBakarBumbuBali.setGraphic(imageView1);
        buttonIkanBakarBumbuBali.setOnAction(V -> {
            IkanBakarBumbuBali ikanBakarBumbuBali = new IkanBakarBumbuBali(stage);
            ikanBakarBumbuBali.show();

        });
        Image image2 = new Image("C:/Users/LENOVO/Downloads/project/project/Evan/JavaFX/helloapp/app/src/main/resources/ikan2.1.jpg");
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitWidth(100);
        imageView2.setFitHeight(200);
        Button buttonIkanGorengTepungAsamManis = new Button();
        buttonIkanGorengTepungAsamManis.setGraphic(imageView2);
        buttonIkanGorengTepungAsamManis.setOnAction(V -> {
            IkanGorengTepungAsamManis ikanGorengTepungAsamManis = new IkanGorengTepungAsamManis(stage);
            ikanGorengTepungAsamManis.show();
        });
        
        Image image3 = new Image("C:/Users/LENOVO/Downloads/project/project/Evan/JavaFX/helloapp/app/src/main/resources/ikan3.2.jpg");
        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitWidth(100);
        imageView3.setFitHeight(200);
        Button buttonSupIkanTomat = new Button();
        buttonSupIkanTomat.setGraphic(imageView3);
        buttonSupIkanTomat.setOnAction(V -> {
            SupIkanTomat supIkanTomat = new SupIkanTomat(stage);
            supIkanTomat.show();
        });

        Button button = new Button();
        button.setText("<--Back");
        button.setOnAction(V -> {
            MenuScene pencarianScene = new MenuScene(stage);
            pencarianScene.show(); });

        HBox hBox = new HBox(10);
        hBox.getChildren().add(buttonIkanBakarBumbuBali);
        hBox.getChildren().add(buttonIkanGorengTepungAsamManis);
        hBox.setAlignment(Pos.CENTER);

        VBox vBox = new VBox(10);
        vBox.getChildren().add(hBox);
        vBox.getChildren().add(buttonSupIkanTomat);
        vBox.getChildren().add(button);
        vBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vBox,350,600);
        stage.setScene(scene);
        stage.show();
    }
}