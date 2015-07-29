package sk.fiit.stuba.danielnovak.model;

/**
 * Created by Daniel on 29.7.2015.
 */
public class Model {

    private int summation;

    public void add(int firstNumber, int secondNumber) {
        summation = firstNumber + secondNumber;
    }

    public int getSummation() {
        return summation;
    }
}
