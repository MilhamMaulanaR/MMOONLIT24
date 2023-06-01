package helloapp;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    
    @Override
    public void start(Stage primaryStage) {
        LoginScene loginScene = new LoginScene(primaryStage);
        primaryStage.setTitle("Recipe Finder");
        loginScene.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
       

