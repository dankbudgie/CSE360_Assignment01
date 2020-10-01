package cse360assignment02;

/**
 * This is a defined package for CSE360 Assignment 01, on version control.
 * The AddingMachine class includes methods that add or subtract values from a given total.
 * You can also return a history of what has been added/subtracted.
 *
 * @author Zachary Her
 * @version 1.0
 * @since 2020-09-30
 */

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