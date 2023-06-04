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

public class DagingTumisBuncis {
    private Stage stage;

    public DagingTumisBuncis(Stage stage){
        this.stage = stage;
    }

    public void show(){
        ImageView imageView = new ImageView("/backgroundresep/DagingTumisbuncis.png");
        imageView.setFitWidth(350);
        imageView.setFitHeight(600);

        // Judul resep
        Label title = new Label("Daging Tumis Buncis");
        title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        // Bahan-bahan
        Label bahanLabel = new Label("Bahan-bahan:");
        bahanLabel.setStyle("-fx-font-weight: bold;");

        Text bahanDetailLabel = new Text(
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

        Text caraDetailLabel = new Text(
                "1. Panaskan minyak dalam wajan, tumis bawang putih hingga harum.\n"
                        + "2. Tambahkan daging sapi, tumis hingga berubah warna.\n"
                        + "3. Masukkan bawang bombay, buncis, wortel, dan paprika merah. Tumis hingga sayuran sedikit layu.\n"
                        + "4. Tuangkan saus tiram, kecap manis, merica bubuk, dan garam. Aduk rata dan masak hingga semua bahan matang sempurna.\n"
                        + "5. Sajikan daging tumis buncis dengan nasi putih hangat."
        );
        caraDetailLabel.setWrappingWidth(270);

        Button button = new Button();
        button.setText("<--Back");
        button.setOnAction(V -> {
            MenuScene pencarianScene = new MenuScene(stage);
            pencarianScene.show(); });

        // Menambahkan komponen ke dalam layout
        VBox layout = new VBox(10);
        layout.setId("LAYOUTRESEP");
        layout.setPadding(new Insets(200,20,20,20));
        layout.getChildren().addAll(title, bahanLabel, bahanDetailLabel, caraLabel, caraDetailLabel);
        layout.getChildren().add(button);
        layout.setAlignment(Pos.BOTTOM_LEFT);

        StackPane stackPaneImage = new StackPane();
        stackPaneImage.getChildren().addAll(imageView, layout);
        StackPane.setAlignment(imageView, Pos.TOP_CENTER);
        
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
