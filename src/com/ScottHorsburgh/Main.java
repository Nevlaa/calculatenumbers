package com.ScottHorsburgh;

import java.util.Scanner;

public class Main {
    /** -------- Assignment Chapter 4 E4.4 && E4.5 --------*/
    public static void main(String[] args) {
        //Creating instance of Calculator class so object stores its data in instance variables
        var calculator = new Calculator();
        calculator.askForNumbers();
        calculator.calculate();
    }
}
