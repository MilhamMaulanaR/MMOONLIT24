package helloapp;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AyamBakarMadu {
    private Stage stage;

    public AyamBakarMadu(Stage stage){
        this.stage = stage;
    }

    public void show(){
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        // Judul resep
        Label title = new Label("Ayam Bakar Madu");
        title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        // Bahan-bahan
        Label bahanLabel = new Label("Bahan-bahan:");
        bahanLabel.setStyle("-fx-font-weight: bold;");

        Label bahanDetailLabel = new Label(
                "- 500 gram ayam, potong menjadi bagian-bagian\n"
                        + "- 2 sendok makan tepung terigu\n"
                        + "- 2 sendok makan tepung beras\n"
                        + "- 1 sendok teh bubuk paprika\n"
                        + "- 1 sendok teh bubuk bawang putih\n"
                        + "- 1 sendok teh bubuk ketumbar\n"
                        + "- 1/2 sendok teh garam\n"
                        + "- Minyak goreng secukupnya"
        );

        // Membuat label untuk cara membuat
        Label caraLabel = new Label("Cara membuat:");
        caraLabel.setStyle("-fx-font-weight: bold;");

        Label caraDetailLabel = new Label(
                "1. Campurkan tepung terigu, tepung beras, paprika bubuk, bubuk bawang putih, bubuk ketumbar, dan garam dalam sebuah mangkuk.\n"
                        + "2. Balurkan potongan ayam dengan campuran tepung rempah hingga merata.\n"
                        + "3. Panaskan minyak goreng dalam wajan.\n"
                        + "4. Goreng ayam hingga matang dan berwarna kecokelatan. Tiriskan.\n"
                        + "5. Sajikan ayam goreng tepung dengan nasi dan saus sambal favorit."
        );

        Button button = new Button();
        button.setText("<--Back");
        button.setOnAction(V -> {
            MenuScene pencarianScene = new MenuScene(stage);
            pencarianScene.show();
        });

        layout.getChildren().addAll(title, bahanLabel, bahanDetailLabel,
                caraLabel, caraDetailLabel);
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 350, 600);
        stage.setScene(scene);
        stage.show();
    }  
}
