package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//Olexiy Alex Tatarov +  Salah + James + Raman

//Alex did GUI and most of controller ckass
// Salah did parts of controller class and data/model
//James Defant did REST package, JSON and database code



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{


       Parent root = FXMLLoader.load(getClass().getResource("ExampleLayoutAlexOrigin.fxml"));
        primaryStage.setTitle("Hello Agent");
        primaryStage.setScene(new Scene(root));

        primaryStage.show();
        //below code will limit the program screen size  to be between 800x600 and 1800x720
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(800);
        primaryStage.setMaxHeight(720);
        primaryStage.setMaxWidth(1800);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
