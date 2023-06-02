package helloapp;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    
    @Override
    public void start(Stage primaryStage) {
        HomeScene homeScene = new HomeScene(primaryStage);
        primaryStage.setTitle("Recipe Finder");
        homeScene.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
       

