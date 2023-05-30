package helloapp;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SupIkanTomat {
    private Stage stage;

    public SupIkanTomat(Stage stage){
        this.stage = stage;
    }

    public void show(){
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        // Judul resep
        Label title = new Label("Sup Ikan Tomat");
        title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        Label bahanLabel = new Label("Bahan-bahan:");
        bahanLabel.setStyle("-fx-font-weight: bold;");

        Label bahanDetailLabel = new Label(
                "- 500 gram fillet ikan (misalnya kakap atau nila), potong menjadi dadu\n"
                        + "- 2 buah tomat, potong dadu\n"
                        + "- 1 buah wortel, iris tipis\n"
                        + "- 1 buah bawang bombay, cincang halus\n"
                        + "- 2 siung bawang putih, cincang halus\n"
                        + "- 1 liter kaldu ikan\n"
                        + "- 2 sendok makan minyak sayur\n"
                        + "- 1 sendok teh gula\n"
                        + "- 1 sendok makan saus ikan\n"
                        + "- Garam secukupnya\n"
                        + "- Lada secukupnya\n"
                        + "- Daun bawang, iris halus (untuk hiasan)"
        );

        // Membuat label untuk cara membuat
        Label caraLabel = new Label("Cara membuat:");
        caraLabel.setStyle("-fx-font-weight: bold;");

        Label caraDetailLabel = new Label(
                "1. Panaskan minyak dalam panci, tumis bawang bombay dan bawang putih hingga harum.\n"
                        + "2. Tambahkan wortel dan tomat, tumis hingga sedikit layu.\n"
                        + "3. Masukkan potongan ikan dan kaldu ikan. Masak hingga ikan matang dan bumbu meresap.\n"
                        + "4. Tambahkan gula, saus ikan, garam, dan lada sesuai selera. Aduk rata.\n"
                        + "5. Sajikan sup ikan tomat dalam mangkuk, taburi dengan daun bawang iris.\n"
                        + "6. Nikmati sup ikan tomat hangat dengan nasi atau roti."
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
