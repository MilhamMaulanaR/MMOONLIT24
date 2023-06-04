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

public class IkanBakarBumbuBali {
    private Stage stage;

    public IkanBakarBumbuBali(Stage stage){
        this.stage = stage;
    }

    public void show(){
        ImageView imageView = new ImageView("/backgroundresep/IkanbakarbumbuBali.png");
        imageView.setFitWidth(350);
        imageView.setFitHeight(600);


        // Judul resep
        Label title = new Label("Ikan Bakar Bumbu Bali");
        title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        // Bahan-bahan
        Label bahanLabel = new Label("Bahan-bahan:");
        bahanLabel.setStyle("-fx-font-weight: bold;");

        Text bahanDetailLabel = new Text(
                "- 2 ekor ikan laut (gurami atau kakap),\n"
                        +" bersihkan dan sayat-sayat pada bagian sisi ikan\n"
                        + "- 6 siung bawang merah\n"
                        + "- 4 siung bawang putih\n"
                        + "- 5 buah cabai merah keriting\n"
                        + "- 4 buah cabai rawit (sesuai selera)\n"
                        + "- 2 cm jahe\n"
                        + "- 2 cm kunyit\n"
                        + "- 2 batang serai, memarkan\n"
                        + "- 2 lembar daun jeruk, sobek-sobek\n"
                        + "- 3 sendok makan minyak kelapa\n"
                        + "- 2 sendok makan air asam jawa\n"
                        + "- 1 sendok makan gula merah, serut\n"
                        + "- Garam secukupnya"
        );

        // Membuat label untuk cara membuat
        Label caraLabel = new Label("Cara membuat:");
        caraLabel.setStyle("-fx-font-weight: bold;");

        Text caraDetailLabel = new Text(
                "1. Haluskan bawang merah, bawang putih, cabai merah, cabai rawit, jahe, dan kunyit dengan blender atau ulekan.\n"
                        + "2. Panaskan minyak kelapa dalam wajan, tumis bumbu halus hingga harum.\n"
                        + "3. Masukkan serai, daun jeruk, air asam jawa, gula merah, dan garam. Aduk rata.\n"
                        + "4. Letakkan ikan di atas panggangan dan olesi dengan bumbu yang telah disiapkan.\n"
                        + "5. Bakar ikan hingga matang dan bumbu meresap, sambil sesekali diolesi sisa bumbu.\n"
                        + "6. Sajikan ikan bakar bumbu Bali dengan nasi putih dan plecing kangkung."
        );
        caraDetailLabel.setWrappingWidth(270);

        Button button = new Button();
        button.setText("<--Back");
        button.setOnAction(V -> {
            MenuScene pencarianScene = new MenuScene(stage);
            pencarianScene.show(); });

            VBox layout = new VBox(10);
            layout.setId("LAYOUTRESEP");
            layout.setPadding(new Insets(200,20,20,20));
            layout.getChildren().addAll(title, bahanLabel, bahanDetailLabel,caraLabel, caraDetailLabel);
            layout.getChildren().add(button);
            layout.setAlignment(Pos.BOTTOM_LEFT);
    
        
            StackPane stackPaneImage = new StackPane();
            stackPaneImage.getChildren().addAll(imageView, layout);
            StackPane.setAlignment(imageView, Pos.TOP_CENTER);

            ScrollPane scrollPane = new ScrollPane();
            scrollPane.setContent(stackPaneImage);
            scrollPane.setFitToWidth(true); 
            scrollPane.setFitToHeight(true); 
    
            Scene scene = new Scene(scrollPane, 350, 600);
            scene.getStylesheets().add(getClass().getResource("/CSS/backgroundresep.css").toExternalForm());
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
    }  
}
