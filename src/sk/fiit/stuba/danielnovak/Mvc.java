package sk.fiit.stuba.danielnovak;

import javafx.application.Application;
import javafx.stage.Stage;
import sk.fiit.stuba.danielnovak.controller.Controller;
import sk.fiit.stuba.danielnovak.model.Context;
import sk.fiit.stuba.danielnovak.model.Model;
import sk.fiit.stuba.danielnovak.view.View;

/**
 * Created by Daniel on 29.7.2015.
 */
public class Mvc extends Application {
    private Context context;
    private Controller controller;
    private View view;
    private Model model;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        context = new Context(primaryStage);
        view = new View();
        model = new Model();
        context.switchScene(view);

        controller = new Controller(view, model);
    }
}
