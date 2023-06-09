package helloapp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class MenuScene {
    private Stage stage;
    private ListView<String> recipeListView;
    private ObservableList<String> recipeList;
    
    MenuScene(Stage stage){
        this.stage = stage;
    }
    
    public void show(){
        TextField searchField = new TextField();
        searchField.setPrefWidth(300);
        searchField.setMaxWidth(300);
        searchField.setMaxHeight(40);
        searchField.setMinHeight(40);
        // searchField.setStyle("-fx-background-color: yellow;");
        searchField.setId("SEARCHFIELD");
        searchField.setStyle("-fx-background-radius: 20px;");
        searchField.setAlignment(Pos.CENTER);
        searchField.setPromptText("Search Recipe");
        searchField.setOnKeyReleased(event -> {
            String keyword = searchField.getText().trim().toLowerCase();
            ObservableList<String> filterList = FXCollections.observableArrayList();
            if (searchField.getText().isEmpty()){
                recipeListView.setVisible(false);
            } else{
                recipeListView.setVisible(true);
            }
            
            for (String recipe : recipeList) {
                if (recipe.toLowerCase().contains(keyword)) {
                    filterList.add(recipe);
                }
            }
            recipeListView.setItems(filterList);
        });
        
        recipeListView = new ListView<>();
        recipeListView.setMaxWidth(289);

        recipeListView.setVisible(false);
        recipeListView.setMaxHeight(50);
        recipeListView.setCellFactory(param -> {
            ListCell<String> cell = new ListCell<>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty || item == null) {
                        setText(null);
                        setGraphic(null);
                    } else {
                        setText(item);
                    }
                }
            };
            
            
            cell.setOnMouseClicked(event -> {
                String selectedRecipe = cell.getItem();
                if (selectedRecipe != null) {
                    if (selectedRecipe.equals("Ayam Goreng Tepung")){
                        AyamGorengTepung ayamGorengTepung = new AyamGorengTepung(stage);
                        ayamGorengTepung.show();
                    } else if (selectedRecipe.equals("Ayam Szechuan Pedas")){
                        AyamSzechuanPedas ayamSzechuanPedas = new AyamSzechuanPedas(stage);
                        ayamSzechuanPedas.show();
                    } else if (selectedRecipe.equals("Rendang Daging Padang")){
                        RendangDagingPadang rendangDagingPadang = new RendangDagingPadang(stage);
                        rendangDagingPadang.show();
                    } else if (selectedRecipe.equals("Steak Daging Black Paper")){
                        SteakDagingBlackPapper steakDagingBlackPapper = new SteakDagingBlackPapper(stage);
                        steakDagingBlackPapper.show();
                    } else if (selectedRecipe.equals("Daging Tumis Buncis")){
                        DagingTumisBuncis dagingTumisBuncis = new DagingTumisBuncis(stage);
                        dagingTumisBuncis.show();
                    } else if (selectedRecipe.equals("Ikan Bakar Bumbu Bali")){
                        IkanBakarBumbuBali ikanBakarBumbuBali = new IkanBakarBumbuBali(stage);
                        ikanBakarBumbuBali.show();
                    } else if (selectedRecipe.equals("Ikan Goreng Tepung Asam Manis")){
                        IkanGorengTepungAsamManis ikanGorengTepungAsamManis = new IkanGorengTepungAsamManis(stage);
                        ikanGorengTepungAsamManis.show();
                    } else if (selectedRecipe.equals("Sup Ikan Tomat")){
                        SupIkanTomat supIkanTomat = new SupIkanTomat(stage);
                        supIkanTomat.show();
                    } else if (selectedRecipe.equals("Capcay Goreng Sayur")){
                        CapcayGorengSayur capcayGorengSayur = new CapcayGorengSayur(stage);
                        capcayGorengSayur.show();
                    } else if (selectedRecipe.equals("Tumis Kangkung Bawang Putih")){
                        TumisKangkungBawangPutih tumisKangkungBawangPutih = new TumisKangkungBawangPutih(stage);
                        tumisKangkungBawangPutih.show();
                    } else if (selectedRecipe.equals("Sayur Lodeh")){
                        SayurLodeh sayurLodeh = new SayurLodeh(stage);
                        sayurLodeh.show();
                    }
                }
            });
            return cell;
        });
        Label label1 = new Label("What would you");
        label1.setStyle(" -fx-font-family:poppins;-fx-font-size: 25px; -fx-text-fill: #000000; -fx-font-weight: medium");
        Label label2 = new Label("like to Cook?");
        label2.setStyle(" -fx-font-family:poppins;-fx-font-size: 25px; -fx-text-fill: #000000; -fx-font-weight: medium");
        Label label3 = new Label("            Populer Recipes");
        label3.setStyle(" -fx-font-family:InriaSansBold700;-fx-font-size: 25px; -fx-text-fill: #000000; -fx-font-weight: bold");


        Label labelGambar1 = new Label("Ayam Goreng Tepung");
        labelGambar1.setStyle(" -fx-font-family:poppins;-fx-font-size: 14px; -fx-text-fill: #000000; -fx-font-weight: bold");
        labelGambar1.setAlignment(Pos.CENTER);


        Label labelGambar2 = new Label("   Ikan Asam Manis");
        labelGambar2.setStyle(" -fx-font-family:poppins;-fx-font-size: 14px; -fx-text-fill: #000000; -fx-font-weight: bold");
        labelGambar2.setAlignment(Pos.CENTER);
        

        Image image2 = new Image("/icon/ayam.png");
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitWidth(64);
        imageView2.setFitHeight(75);

        Image image3 = new Image("/icon/ikan.png");
        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitWidth(64);
        imageView3.setFitHeight(75);
        
        Image image4 = new Image("/icon/sayur.png");
        ImageView imageView4 = new ImageView(image4);
        imageView4.setFitWidth(64);
        imageView4.setFitHeight(75);
        
        Image image5 = new Image("/icon/daging.png");
        ImageView imageView5 = new ImageView(image5);
        imageView5.setFitWidth(64);
        imageView5.setFitHeight(75);

        Image image6 = new Image("/image/ayam1.2.jpg");
        ImageView imageView6 = new ImageView(image6);
        imageView6.setFitWidth(135);
        imageView6.setFitHeight(200);

        Image image7 = new Image("/image/ikan2.1.jpg");
        ImageView imageView7 = new ImageView(image7);
        imageView7.setFitWidth(135);
        imageView7.setFitHeight(200);
        // imageView7.setId("GAMBAR");

        Image image8 = new Image("/image/foodieshaven.png");
        ImageView imageView8 = new ImageView(image8);

        Image image9 = new Image("/image/whatwillyoucooktoday.png");
        ImageView imageView9 = new ImageView(image9);
        
        Rectangle rectangle = new Rectangle(135,200);
        rectangle.setArcWidth(25);
        rectangle.setArcHeight(25);

        Rectangle rectangle1 = new Rectangle(135,200);
        rectangle1.setArcWidth(25);
        rectangle1.setArcHeight(25);
        
        imageView6.setClip(rectangle1);
        imageView7.setClip(rectangle);


        Button buttonAyam = new Button();
        buttonAyam.setId("BUTTONJENISBAHAN");
        buttonAyam.setGraphic(imageView2);
        buttonAyam.setOnAction(V -> {
            Ayam ayam = new Ayam(stage);
            ayam.show();       
        });

        Button buttonIkan = new Button();
        buttonIkan.setGraphic(imageView3);
        buttonIkan.setId("BUTTONJENISBAHAN");
        buttonIkan.setOnAction(V -> {
            Ikan ikan = new Ikan(stage);
            ikan.show();
        });

        Button buttonSayur = new Button();
        buttonSayur.setGraphic(imageView4);
        buttonSayur.setId("BUTTONJENISBAHAN");
        buttonSayur.setOnAction(V -> {
            Sayur sayur = new Sayur(stage);
            sayur.show();
        });

        Button buttonDaging = new Button();
        buttonDaging.setGraphic(imageView5);
        buttonDaging.setId("BUTTONJENISBAHAN");
        buttonDaging.setOnAction(V -> {
            Daging daging = new Daging(stage);
            daging.show();
        });

        Button buttonImage1 = new Button();
        buttonImage1.setStyle("-fx-background-radius: 10");
        buttonImage1.setGraphic(imageView6);
        buttonImage1.setMaxWidth(100);
        buttonImage1.setMaxHeight(200);
        buttonImage1.setId("BUTTONJENISBAHAN");
        buttonImage1.setOnAction(V -> {
            AyamGorengTepung ayamGorengTepung = new AyamGorengTepung(stage);
            ayamGorengTepung.show();
        });
        buttonImage1.setViewOrder(10);

        Button buttonImage2 = new Button();
        buttonImage2.setStyle("-fx-background-radius: 10");
        buttonImage2.setGraphic(imageView7);
        buttonImage2.setMaxWidth(100);
        buttonImage2.setMaxHeight(200);
        buttonImage2.setId("BUTTONJENISBAHAN");
        buttonImage2.setOnAction(V -> {
            IkanGorengTepungAsamManis ikanGorengTepungAsamManis = new IkanGorengTepungAsamManis(stage);
            ikanGorengTepungAsamManis.show();
        });

        

        recipeList = FXCollections.observableArrayList(
            "Ayam Goreng Tepung", "Ayam Szechuan Pedas", "Capcay Goreng Sayur", "Daging Tumis Buncis", "Ikan Bakar Bumbu Bali","Rendang Daging Padang", "Steak Daging Black Papper", "Daging Tumis Buncis", "Ikan Goreng Tepung Asam Manis", "Sup Ikan Tomat", "Capcay Goreng Sayur", "Tumis Kangkung Bawang Putih", "Sayur Lodeh");

        HBox hBox = new HBox(5);
        hBox.getChildren().add(buttonAyam);
        hBox.getChildren().add(buttonIkan);
        hBox.getChildren().add(buttonDaging);
        hBox.getChildren().add(buttonSayur);
        hBox.setAlignment(Pos.CENTER);
        
        VBox vBoxGambar1 = new VBox();
        vBoxGambar1.getChildren().add(buttonImage1);
        vBoxGambar1.getChildren().add(labelGambar1); 

        VBox vBoxGambar2 = new VBox();
        vBoxGambar2.getChildren().add(buttonImage2);
        vBoxGambar2.getChildren().add(labelGambar2);

        HBox hBox2 = new HBox(5);
        hBox2.getChildren().add(vBoxGambar1);
        hBox2.getChildren().add(vBoxGambar2);
        hBox2.setAlignment(Pos.CENTER);

        VBox root = new VBox(10);
        root.getChildren().addAll(searchField, recipeListView);
        root.setAlignment(Pos.CENTER);

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(imageView8,0,0);
        gridPane.add(imageView9,0,1);
        gridPane.add(root,0,3);
        gridPane.add(hBox,0,4);
        gridPane.add(label3,0,5);
        gridPane.add(hBox2,0,6);
        gridPane.setAlignment(Pos.TOP_CENTER);
        gridPane.setStyle("-fx-background-color:white;");
        
        
        Scene scene = new Scene(gridPane, 350, 600);
        scene.getStylesheets().add(getClass().getResource("/CSS/menuscene.css").toExternalForm());
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    } 
}
