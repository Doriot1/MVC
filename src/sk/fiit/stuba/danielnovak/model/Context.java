package sk.fiit.stuba.danielnovak.model;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Daniel on 29.7.2015.
 */
public class Context {
    private Stage stage;
    private Scene scene;

    public Context(Stage stage) {
        this.stage = stage;
    }

    public void switchScene(Parent root) {
        scene = new Scene(root, 600, 200);
        stage.setScene(scene);
        stage.sizeToScene();
        stage.setTitle("MVC");
        stage.setResizable(false);
        stage.show();

    }
}
