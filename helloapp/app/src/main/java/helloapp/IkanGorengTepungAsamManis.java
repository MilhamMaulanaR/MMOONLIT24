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

public class IkanGorengTepungAsamManis {
    private Stage stage;

    public IkanGorengTepungAsamManis(Stage stage){
        this.stage = stage;
    }

    public void show(){
        ImageView imageView = new ImageView("/backgroundresep/ikanasammanis.png");
        imageView.setFitWidth(350);
        imageView.setFitHeight(600);


        // Judul resep
        Label title = new Label("Ikan Goreng Tepung Asam Manis");
        title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        //Bahan bahan
        Label bahanLabel = new Label("Bahan-bahan:");
        bahanLabel.setStyle("-fx-font-weight: bold;");

        Text bahanDetailLabel = new Text(
                "- 500 gram ikan fillet (misalnya ikan tenggiri atau nila),\n"
                        + "    potong menjadi bagian-bagian\n"
                        + "- 1/2 sendok teh garam\n"
                        + "- 1/4 sendok teh merica bubuk\n"
                        + "- 1 sendok teh air jeruk nipis\n"
                        + "- 100 gram tepung terigu\n"
                        + "- 50 gram tepung maizena\n"
                        + "- Minyak goreng secukupnya"
        );

        Label sausLabel = new Label("Bahan untuk saus asam manis:");
        sausLabel.setStyle("-fx-font-weight: bold;");

        Text sausDetailLabel = new Text(
                "- 3 sendok makan saus tomat\n"
                        + "- 2 sendok makan saus cabai\n"
                        + "- 2 sendok makan kecap manis\n"
                        + "- 1 sendok makan air jeruk nipis\n"
                        + "- 1 sendok makan saus tiram\n"
                        + "- 1 sendok makan gula pasir\n"
                        + "- 1/2 sendok teh garam\n"
                        + "- 1/4 sendok teh merica bubuk\n"
                        + "- 100 ml air"
        );
        sausDetailLabel.setWrappingWidth(270);

        Label caraLabel = new Label("Cara membuat:");
        caraLabel.setStyle("-fx-font-weight: bold;");

        Text caraDetailLabel = new Text(
            
                    " 1. Lumuri potongan ikan dengan garam, merica, dan air jeruk nipis. Diamkan selama 15 menit.\n"
                        +"2. Campurkan tepung terigu dan tepung maizena dalam sebuah mangkuk.\n"
                        +"3. Gulingkan potongan ikan dalam campuran tepung hingga merata.\n"
                        +"4. Panaskan minyak dalam wajan, goreng ikan hingga kecokelatan dan matang. Tiriskan.\n"
                        +"5. Untuk saus asam manis, campurkan semua bahan saus dalam wajan. Masak hingga mendidih dan mengental.\n"
                        +"6. Letakkan ikan goreng dalam piring saji, tuang saus asam manis di atasnya.\n"
                        +"7. Sajikan ikan goreng tepung asam manis dengan nasi putih hangat.\n"
                        );
        caraDetailLabel.setWrappingWidth(270);

        Button button = new Button();
        button.setText("<--Back");
        button.setOnAction(V -> {
            MenuScene pencarianScene = new MenuScene(stage);
            pencarianScene.show(); 
        });

        VBox layout = new VBox(10);
        layout.setId("LAYOUTRESEPIKANASAMMANIS");
        // layout.setPadding(new Insets(20));
        layout.setPadding(new Insets(200,20,20,20));
        layout.getChildren().addAll(title, bahanLabel, bahanDetailLabel,sausLabel, sausDetailLabel,caraLabel,caraDetailLabel);
        layout.getChildren().add(button);


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

