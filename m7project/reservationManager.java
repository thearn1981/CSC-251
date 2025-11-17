import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class reservationManager extends Application {
    @Override
    public void start(Stage stage) {
        Parent root = UI.createMainLayout(stage);
        Scene scene = new Scene(root, 900, 600);
        stage.setTitle("Tables & Chairs - Reservation Manager");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
