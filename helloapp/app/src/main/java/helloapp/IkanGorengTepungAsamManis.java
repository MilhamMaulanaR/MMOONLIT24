package helloapp;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class IkanGorengTepungAsamManis {
    private Stage stage;

    public IkanGorengTepungAsamManis(Stage stage){
        this.stage = stage;
    }

    public void show(){
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        // Judul resep
        Label title = new Label("Ikan Goreng Tepung Asam Manis");
        title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        Label bahanLabel = new Label("Bahan-bahan:");
        bahanLabel.setStyle("-fx-font-weight: bold;");

        Label bahanDetailLabel = new Label(
                "- 500 gram ikan fillet (misalnya ikan tenggiri atau nila), potong menjadi bagian-bagian\n"
                        + "- 1/2 sendok teh garam\n"
                        + "- 1/4 sendok teh merica bubuk\n"
                        + "- 1 sendok teh air jeruk nipis\n"
                        + "- 100 gram tepung terigu\n"
                        + "- 50 gram tepung maizena\n"
                        + "- Minyak goreng secukupnya"
        );

        Label sausLabel = new Label("Bahan untuk saus asam manis:");
        sausLabel.setStyle("-fx-font-weight: bold;");

        Label sausDetailLabel = new Label(
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

        Button button = new Button();
        button.setText("<--Back");
        button.setOnAction(V -> {
            MenuScene pencarianScene = new MenuScene(stage);
            pencarianScene.show(); });

        // Menambahkan komponen ke dalam layout
        layout.getChildren().addAll(title, bahanLabel, bahanDetailLabel, sausLabel, sausDetailLabel);

        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 350, 600);
        stage.setScene(scene);
        stage.show();
    }  
}
