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

public class RendangDagingPadang {
    private Stage stage;

    public RendangDagingPadang(Stage stage){
        this.stage = stage;
    }

    public void show(){
        ImageView imageView = new ImageView("/backgroundresep/rendang.png");
        imageView.setFitWidth(350);
        imageView.setFitHeight(600);


        // Judul resep
        Label title = new Label("Rendang Daging Padang");
        title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        // Bahan-bahan
        Label bahanLabel = new Label("Bahan-bahan:");
        bahanLabel.setStyle("-fx-font-weight: bold;");

        Label bahanDetailLabel = new Label(
                "- 500 gram daging sapi, potong menjadi dadu kecil\n"
                        + "- 4 lembar daun jeruk\n"
                        + "- 2 batang serai, memarkan\n"
                        + "- 3 cm lengkuas, memarkan\n"
                        + "- 400 ml santan kental\n"
                        + "- 3 sendok makan minyak kelapa\n"
                        + "- 2 sendok makan kerisik (kelapa parut sangrai)\n"
                        + "- Bumbu Rendang:\n"
                        + "  - 6 butir bawang merah\n"
                        + "  - 4 siung bawang putih\n"
                        + "  - 5 buah cabai merah keriting\n"
                        + "  - 4 buah cabai rawit (sesuai selera)\n"
                        + "  - 3 cm jahe\n"
                        + "  - 2 cm kunyit\n"
                        + "  - 2 cm lengkuas\n"
                        + "  - 1 batang serai\n"
                        + "  - 2 sendok teh ketumbar\n"
                        + "  - 1 sendok teh jintan\n"
                        + "  - 1/2 sendok teh merica\n"
                        + "  - 2 sendok teh garam\n"
                        + "  - 2 sendok makan gula merah, serut"
        );

        // Membuat label untuk cara membuat
        Label caraLabel = new Label("Cara membuat:");
        caraLabel.setStyle("-fx-font-weight: bold;");

        Text caraDetailLabel = new Text(
                "1. Haluskan semua bumbu rendang menggunakan blender atau ulekan.\n"
                        + "2. Panaskan minyak kelapa dalam wajan, tumis bumbu rendang hingga harum.\n"
                        + "3. Masukkan daging sapi, daun jeruk, serai, dan lengkuas. Tumis hingga daging berubah warna.\n"
                        + "4. Tuang santan kental dan kerisik. Aduk rata.\n"
                        + "5. Masak rendang dengan api kecil hingga daging empuk dan bumbu meresap. Sambil sesekali diaduk agar tidak gosong.\n"
                        + "6. Sajikan rendang daging padang dengan nasi putih hangat."
        );
        caraDetailLabel.setWrappingWidth(270);

        Button button = new Button();
        button.setText("<--Back");
        button.setOnAction(V -> {
            // MenuScene pencarianScene = new MenuScene(stage);
            // pencarianScene.show(); 
            
            Daging daging = new Daging(stage);
            daging.show();
        });

        // Menambahkan komponen ke dalam layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(200,20,20,20));
        layout.getChildren().addAll(title,bahanLabel,bahanDetailLabel,caraLabel,caraDetailLabel);
        layout.getChildren().add(button);
        layout.setAlignment(Pos.BOTTOM_LEFT);


        StackPane stackPaneImage = new StackPane();
        stackPaneImage.getChildren().addAll(imageView, layout);
        StackPane.setAlignment(imageView, Pos.TOP_CENTER);
        stackPaneImage.setStyle("-fx-background-color:white;");
        
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
