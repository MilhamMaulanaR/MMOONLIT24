package helloapp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GoToRecipeScene {
    private Stage stage;
    private String recipe;
    
    GoToRecipeScene(String recipe){
        this.recipe = recipe;
    }

    public void show(){
        Label recipeLabel = new Label(recipe);
        Button backButton = new Button("Back");
        backButton.setOnAction(event -> {
            MenuScene pencarianScene = new MenuScene(stage);
            pencarianScene.show();
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(recipeLabel, backButton);
        Scene scene = new Scene(layout, 200, 200);
        stage.setScene(scene);
    }
}
