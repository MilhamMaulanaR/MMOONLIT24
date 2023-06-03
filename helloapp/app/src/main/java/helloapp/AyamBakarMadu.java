package helloapp;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.control.ScrollPane;
import javafx.geometry.Pos;
import javafx.scene.text.Text;

public class AyamBakarMadu {
    private Stage stage;

    public AyamBakarMadu(Stage stage){
        this.stage = stage;
    }

    public void show(){
        ImageView imageView = new ImageView("/backgroundresep/ayamgorengtepung.png");
        imageView.setFitWidth(350);
        imageView.setFitHeight(600);

        // layout.setAlignment();
        
        // Judul resep
        Label title = new Label("Ayam Goreng Tepung");
        title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        // Bahan-bahan

        Label bahanLabel = new Label("Bahan-bahan:");
        bahanLabel.setStyle("-fx-font-weight: bold;");

        Text bahanDetailLabel = new Text(
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

        Text caraDetailLabel = new Text(
                "1. Campurkan tepung terigu, tepung beras, paprika bubuk, bubuk bawang putih, bubuk ketumbar, dan garam dalam sebuah mangkuk.\n"
                        + "2. Balurkan potongan ayam dengan campuran tepung rempah hingga merata.\n"
                        + "3. Panaskan minyak goreng dalam wajan.\n"
                        + "4. Goreng ayam hingga matang dan berwarna kecokelatan. Tiriskan.\n"
                        + "5. Sajikan ayam goreng tepung dengan nasi dan saus sambal favorit."
                        );
        caraDetailLabel.setWrappingWidth(270);

        Button button = new Button();
        button.setText("<--Back");
        button.setOnAction(V -> {
            MenuScene pencarianScene = new MenuScene(stage);
            pencarianScene.show();
        });
        VBox layout = new VBox(10);
        layout.setId("LAYOUTRESEP");
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(title, bahanLabel, bahanDetailLabel,caraLabel, caraDetailLabel);
        layout.getChildren().add(button);
        layout.setAlignment(Pos.BOTTOM_LEFT);

    
        StackPane stackPaneImage = new StackPane();
        stackPaneImage.getChildren().addAll(imageView, layout);
        
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(stackPaneImage);
        scrollPane.setFitToWidth(true); // Memungkinkan konten memperluas lebar scrollPane
        scrollPane.setFitToHeight(true); // Memungkinkan konten memperluas tinggi scrollPane

        Scene scene = new Scene(scrollPane, 350, 600);
        scene.getStylesheets().add(getClass().getResource("/CSS/backgroundresep.css").toExternalForm());
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }  
}
