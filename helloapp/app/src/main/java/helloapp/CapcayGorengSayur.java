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

public class CapcayGorengSayur {
    private Stage stage;

    public CapcayGorengSayur(Stage stage){
        this.stage = stage;
    }

    public void show(){
        ImageView imageView = new ImageView("/backgroundresep/CapcayGorengSayur.png");
        imageView.setFitWidth(350);
        imageView.setFitHeight(600);
        
        // Judul resep
        Label title = new Label("Capcay Goreng Sayur");
        title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        Label bahanLabel = new Label("Bahan-bahan:");
        bahanLabel.setStyle("-fx-font-weight: bold;");

        Text bahanDetailLabel = new Text(
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

        Text caraDetailLabel = new Text(
                "1. Panaskan minyak dalam wajan, tumis bawang putih hingga harum.\n"
                        + "2. Masukkan wortel, buncis, paprika merah, paprika hijau, dan kol. Tumis hingga sayuran layu.\n"
                        + "3. Tambahkan saus tiram, kecap manis, garam, dan merica bubuk. Aduk rata dan masak hingga sayuran matang sempurna.\n"
                        + "4. Sajikan capcay goreng sayur sebagai lauk pendamping nasi."
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
