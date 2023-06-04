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

public class SteakDagingBlackPapper {
    private Stage stage;

    public SteakDagingBlackPapper(Stage stage){
        this.stage = stage;
    }

    public void show(){
        ImageView imageView = new ImageView("/backgroundresep/steakblackpaper.png");
        imageView.setFitWidth(350);
        imageView.setFitHeight(600);


        // Judul resep
        Label title = new Label("Steak Daging Black Papper");
        title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        // Bahan-bahan
        Label bahanLabel = new Label("Bahan-bahan:");
        bahanLabel.setStyle("-fx-font-weight: bold;");

         Text bahanDetailLabel = new Text(
                "- 2 iris daging sapi bagian tenderloin atau sirloin (masing-masing tebal sekitar 2 cm)\n"
                        + "- 2 sendok makan minyak zaitun\n"
                        + "- 2 siung bawang putih, cincang halus\n"
                        + "- 2 sendok teh lada hitam kasar\n"
                        + "- 2 sendok makan saus tiram\n"
                        + "- 1 sendok makan saus Worcestershire\n"
                        + "- 1 sendok teh garam\n"
                        + "- 1 sendok teh gula\n"
                        + "- Daun peterseli cincang (untuk hiasan)"
        );
        bahanDetailLabel.setWrappingWidth(270);

        // Membuat label untuk cara membuat
        Label caraLabel = new Label("Cara membuat:");
        caraLabel.setStyle("-fx-font-weight: bold;");

        Text caraDetailLabel = new Text(
                "1. Campurkan minyak zaitun, bawang putih, lada hitam, saus tiram, saus Worcestershire, garam, dan gula dalam sebuah wadah.\n"
                        + "2. Lumuri daging sapi dengan campuran bumbu hingga merata. Diamkan selama 30 menit agar meresap.\n"
                        + "3. Panaskan wajan dengan api sedang-tinggi. Panggang steak daging sesuai selera (medium rare, medium, atau well-done).\n"
                        + "4. Angkat dan biarkan sebentar sebelum diiris.\n"
                        + "5. Sajikan steak daging black pepper dengan saus steak, nasi atau kentang, dan sayuran panggang."
        );
        caraDetailLabel.setWrappingWidth(270);

        Button button = new Button();
        button.setText("<--Back");
        button.setOnAction(V -> {
            MenuScene pencarianScene = new MenuScene(stage);
            pencarianScene.show(); });

        // Menambahkan komponen ke dalam layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(200,20,20,20));
        layout.getChildren().addAll(title, bahanLabel, bahanDetailLabel, caraLabel, caraDetailLabel);
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
