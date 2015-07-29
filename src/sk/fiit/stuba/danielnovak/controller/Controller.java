package sk.fiit.stuba.danielnovak.controller;

import sk.fiit.stuba.danielnovak.model.Model;
import sk.fiit.stuba.danielnovak.view.View;

/**
 * Created by Daniel on 29.7.2015.
 */
public class Controller {
    View theView;
    Model theModel;

    public Controller(View theView, Model theModel) {
        this.theView = theView;
        this.theModel = theModel;

        theView.setViewListener(() -> {
            try {
                theModel.add(theView.getFirst(), theView.getSecond());
                theView.setSolution(theModel.getSummation());
            } catch (NumberFormatException e) {
                System.out.println(e);
                System.out.println("Error message: You need to enter two integers");
            }
        });

     /*   theView.setViewListener(new View.ViewListener() {
            @Override
            public void onButtonClicked() {

            }
        });*/
    }


}
