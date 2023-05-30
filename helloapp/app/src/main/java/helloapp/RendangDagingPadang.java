package helloapp;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RendangDagingPadang {
    private Stage stage;

    public RendangDagingPadang(Stage stage){
        this.stage = stage;
    }

    public void show(){
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

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

        Label caraDetailLabel = new Label(
                "1. Haluskan semua bumbu rendang menggunakan blender atau ulekan.\n"
                        + "2. Panaskan minyak kelapa dalam wajan, tumis bumbu rendang hingga harum.\n"
                        + "3. Masukkan daging sapi, daun jeruk, serai, dan lengkuas. Tumis hingga daging berubah warna.\n"
                        + "4. Tuang santan kental dan kerisik. Aduk rata.\n"
                        + "5. Masak rendang dengan api kecil hingga daging empuk dan bumbu meresap. Sambil sesekali diaduk agar tidak gosong.\n"
                        + "6. Sajikan rendang daging padang dengan nasi putih hangat."
        );

        Button button = new Button();
        button.setText("<--Back");
        button.setOnAction(V -> {
            MenuScene pencarianScene = new MenuScene(stage);
            pencarianScene.show(); });

        // Menambahkan komponen ke dalam layout
        layout.getChildren().addAll(
            title,
            bahanLabel,bahanDetailLabel , caraLabel, caraDetailLabel);
        
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 350, 600);
        stage.setScene(scene);
        stage.show();
    }  
}
