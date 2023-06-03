package helloapp;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AyamSzechuanPedas {
    private Stage stage;

    public AyamSzechuanPedas(Stage stage){
        this.stage = stage;
    }

    public void show(){
        ImageView imageView = new ImageView("/backgroundresep/ayamszechuan.png");
        imageView.setFitWidth(350);
        imageView.setFitHeight(600);

        
       

        // Judul resep
        Label title = new Label("Ayam Szechuan Pedas");
        title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        // Bahan-bahan
        Label bahanLabel = new Label("Bahan-bahan:");
        bahanLabel.setStyle("-fx-font-weight: bold;");

        Text bahanDetailLabel = new Text(
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

        Text caraDetailLabel = new Text(
                "1. Panaskan minyak dalam wajan, tumis bawang putih dan jahe hingga harum.\n"
                        + "2. Tambahkan potongan ayam dan tumis hingga berubah warna.\n"
                        + "3. Masukkan saus cabai Szechuan, saus tiram, minyak wijen, kecap asin, bubuk cabai, dan bubuk lada. Aduk rata.\n"
                        + "4. Masak hingga ayam matang sempurna dan bumbu meresap. Tambahkan daun bawang, aduk sebentar.\n"
                        + "5. Sajikan ayam Szechuan pedas dengan nasi putih hangat."
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
        layout.setAlignment(Pos.CENTER);

        
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
