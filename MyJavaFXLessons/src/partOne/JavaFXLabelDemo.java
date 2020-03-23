package partOne;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXLabelDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("JavaFXLabelDemo");

        FlowPane rootNode = new FlowPane();

        Scene scene = new Scene(rootNode, 300, 200);

        stage.setScene(scene);

        //Label mylab = new Label("This is a JavaFX label.");

        rootNode.getChildren().addAll( new Label());

        stage.show();
    }
}
