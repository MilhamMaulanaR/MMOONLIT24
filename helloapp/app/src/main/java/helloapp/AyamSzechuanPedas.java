package helloapp;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AyamSzechuanPedas {
    private Stage stage;

    public AyamSzechuanPedas(Stage stage){
        this.stage = stage;
    }

    public void show(){
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        // Judul resep
        Label title = new Label("Ayam Szechuan Pedas");
        title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        // Bahan-bahan
        Label bahanLabel = new Label("Bahan-bahan:");
        bahanLabel.setStyle("-fx-font-weight: bold;");

        Label bahanDetailLabel = new Label(
                "- 500 gram daging ayam fillet, potong dadu\n"
                        + "- 3 sendok makan saus cabai Szechuan\n"
                        + "- 2 sendok makan saus tiram\n"
                        + "- 2 sendok makan minyak wijen\n"
                        + "- 1 sendok makan kecap asin\n"
                        + "- 1 sendok teh bubuk cabai\n"
                        + "- 1/2 sendok teh bubuk lada\n"
                        + "- 3 siung bawang putih, cincang halus\n"
                        + "- 1 cm jahe, cincang halus\n"
                        + "- 1 batang daun bawang, iris tipis\n"
                        + "- Minyak goreng secukupnya"
        );

        // Membuat label untuk cara membuat
        Label caraLabel = new Label("Cara membuat:");
        caraLabel.setStyle("-fx-font-weight: bold;");

        Label caraDetailLabel = new Label(
                "1. Panaskan minyak dalam wajan, tumis bawang putih dan jahe hingga harum.\n"
                        + "2. Tambahkan potongan ayam dan tumis hingga berubah warna.\n"
                        + "3. Masukkan saus cabai Szechuan, saus tiram, minyak wijen, kecap asin, bubuk cabai, dan bubuk lada. Aduk rata.\n"
                        + "4. Masak hingga ayam matang sempurna dan bumbu meresap. Tambahkan daun bawang, aduk sebentar.\n"
                        + "5. Sajikan ayam Szechuan pedas dengan nasi putih hangat."
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
