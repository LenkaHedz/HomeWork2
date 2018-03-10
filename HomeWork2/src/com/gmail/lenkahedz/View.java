package com.gmail.lenkahedz;

public class View {
    // Text's constants
    public static final String INPUT_INT_DATA = "Input INT value in diapazon: ";
    public static final String WRONG_INPUT_DATA =
            "Wrong input! Repeat please! ";
    public static final String WRONG_RANGE_DATA =
            "Number not in diapazon! Repeat please! ";
    public static final String OUR_INT = "You guessed the number: ";
    public static final String OUR_DELIMETER = " - ";
    public static final String OUR_ATTEMPTS = "Your attempts: ";

    public void printMessage(String message){
        System.out.println(message);
    }
}
