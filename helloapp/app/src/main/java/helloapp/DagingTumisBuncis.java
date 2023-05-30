package helloapp;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DagingTumisBuncis {
    private Stage stage;

    public DagingTumisBuncis(Stage stage){
        this.stage = stage;
    }

    public void show(){
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        // Judul resep
        Label title = new Label("Daging Tumis Buncis");
        title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        // Bahan-bahan
        Label bahanLabel = new Label("Bahan-bahan:");
        bahanLabel.setStyle("-fx-font-weight: bold;");

        Label bahanDetailLabel = new Label(
                "- 250 gram daging sapi, iris tipis\n"
                        + "- 150 gram buncis, potong-potong\n"
                        + "- 1 buah wortel, iris tipis memanjang\n"
                        + "- 1 buah paprika merah, iris tipis\n"
                        + "- 1 buah bawang bombay, iris tipis\n"
                        + "- 3 siung bawang putih, cincang halus\n"
                        + "- 2 sendok makan saus tiram\n"
                        + "- 1 sendok makan kecap manis\n"
                        + "- 1/2 sendok teh merica bubuk\n"
                        + "- 1/2 sendok teh garam\n"
                        + "- Minyak goreng secukupnya"
        );

        // Membuat label untuk cara membuat
        Label caraLabel = new Label("Cara membuat:");
        caraLabel.setStyle("-fx-font-weight: bold;");

        Label caraDetailLabel = new Label(
                "1. Panaskan minyak dalam wajan, tumis bawang putih hingga harum.\n"
                        + "2. Tambahkan daging sapi, tumis hingga berubah warna.\n"
                        + "3. Masukkan bawang bombay, buncis, wortel, dan paprika merah. Tumis hingga sayuran sedikit layu.\n"
                        + "4. Tuangkan saus tiram, kecap manis, merica bubuk, dan garam. Aduk rata dan masak hingga semua bahan matang sempurna.\n"
                        + "5. Sajikan daging tumis buncis dengan nasi putih hangat."
        );

        Button button = new Button();
        button.setText("<--Back");
        button.setOnAction(V -> {
            MenuScene pencarianScene = new MenuScene(stage);
            pencarianScene.show(); });

        // Menambahkan komponen ke dalam layout
        layout.getChildren().addAll(title, bahanLabel, bahanDetailLabel, caraLabel, caraDetailLabel);

        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 350, 600);
        stage.setScene(scene);
        stage.show();
    }  
}
