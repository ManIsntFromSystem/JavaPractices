package partOne;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXSkel extends Application {
    public static void main(String[] args) {
        System.out.println("Starting JavaFX - application...");

        launch(args);
    }

    @Override
    public void init() throws Exception {
        System.out.println("In body init() method");
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("In body start() method");

        stage.setTitle("JavaFX Skeleton.");

        FlowPane rootNode = new FlowPane();

        Scene scene = new Scene(rootNode, 300, 200);

        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("In body stop() method");
    }
}
