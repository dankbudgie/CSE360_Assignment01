package cse360assignment02;

public class AddingMachine {
    private int total = 0;
    String history = "0";

    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }

    public int getTotal () {
        return total;
    }

    public void add (int value) {
        total += value;
        history = history + " + " + value;
    }

    public void subtract (int value) {
        total -= value;
        history = history + " - " + value;
    }

    public String toString () {
        return history;
    }

    public void clear() {
    }
}