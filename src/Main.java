import Default.JsonReader;
import Default.Weegsysteem_TaalkeuzeView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        FlowPane root = new FlowPane();
        Scene scene = new Scene(root, 600, 600);
        new Weegsysteem_TaalkeuzeView(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Interactieve handleiding");
        primaryStage.show();
        JsonReader jr = new JsonReader();
        jr.readJson();
    }

    public static void main(String[] args) {
        launch(args);
    }

}