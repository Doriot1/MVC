package sk.fiit.stuba.danielnovak.view;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 * Created by Daniel on 29.7.2015.
 */
public class View extends GridPane {


    private Button button;
    private TextField number1;
    private TextField number2;
    private TextField result;

    private ViewListener viewListener;

    public View() {
        init();
        add();
    }

    private void init() {
        setGridLinesVisible(true);
        button = new Button("calculate");
        number1 = new TextField();
        number2 = new TextField();
        result = new TextField();

        button.setOnAction(e -> {
            viewListener.onButtonClicked();
        });
    }

    private void add() {
        add(number1, 0, 0);
        add(button, 1, 0);
        add(number2, 2, 0);
        add(result, 3, 0);
    }

    public int getFirst() {
        return Integer.parseInt(number1.getText());
    }

    public int getSecond() {
        return Integer.parseInt(number2.getText());
    }

    public void setSolution(int solution) {
        result.setText(Integer.toString(solution));
    }

    public void setViewListener(ViewListener listener) {
        this.viewListener = listener;

    }

    public interface ViewListener {
        void onButtonClicked();
    }

}
