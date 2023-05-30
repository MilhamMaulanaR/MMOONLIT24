package helloapp;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SayurLodeh {
    private Stage stage;

    public SayurLodeh(Stage stage){
        this.stage = stage;
    }

    public void show(){
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        // Judul resep
        Label title = new Label("Sayur Lodeh");
        title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        // Bahan-bahan
        Label bahanLabel = new Label("Bahan-bahan:");
        bahanLabel.setStyle("-fx-font-weight: bold;");

        Label bahanDetailLabel = new Label(
                "- 1 buah wortel, iris tipis memanjang\n"
                        + "- 1 buah buncis, potong-potong\n"
                        + "- 1 buah paprika merah, iris tipis\n"
                        + "- 1 buah paprika hijau, iris tipis\n"
                        + "- 1/2 buah kol, iris tipis\n"
                        + "- 3 siung bawang putih, cincang halus\n"
                        + "- 2 sendok makan saus tiram\n"
                        + "- 1 sendok makan kecap manis\n"
                        + "- 1/2 sendok teh garam\n"
                        + "- 1/4 sendok teh merica bubuk\n"
                        + "- Minyak goreng secukupnya"
        );

        // Membuat label untuk cara membuat
        Label caraLabel = new Label("Cara membuat:");
        caraLabel.setStyle("-fx-font-weight: bold;");

        Label caraDetailLabel = new Label(
                "1. Panaskan minyak dalam wajan, tumis bawang putih hingga harum.\n"
                        + "2. Masukkan wortel, buncis, paprika merah, paprika hijau, dan kol. Tumis hingga sayuran layu.\n"
                        + "3. Tambahkan saus tiram, kecap manis, garam, dan merica bubuk. Aduk rata dan masak hingga sayuran matang sempurna.\n"
                        + "4. Sajikan capcay goreng sayur sebagai lauk pendamping nasi."
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
