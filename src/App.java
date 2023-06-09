import controllers.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import views.MainPanel;

public class App extends Application {
    public static void main(String[] args) throws Exception { 
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        StackPane stackPanel = new StackPane();
        MainController mainController = new MainController();
        MainPanel mainPanel = mainController.getMainPanel();

        Scene scene = new Scene(mainPanel, 400, 300);
        stage.setScene(scene);
        stage.show();
    }
}
