package com.ScottHorsburgh;

import java.util.Scanner;

class Calculator {
    private Scanner input = new Scanner(System.in);
    private int num1;
    private int num2;
    private int numberAmount;
    private int result;

    /**Default Constructor displays all calculated results from the users numbers .
     */
    Calculator(){
   }
   public void askForNumbers(){
        askUserForNumbers();
   }
   public void calculate(){
        displayResults();
   }

    /**Ask user for two numbers to calculate and two or more numbers to average
     * Takes numbers from user and stores into variables num1, num2, numberAmount
     */
    private void askUserForNumbers(){
        //Asking user to input two numbers and storing in variables
        System.out.print("\nEnter first number: ");
        num1 = (int) Math.round(input.nextDouble());
        System.out.print("Enter second number: ");
        num2 = (int) Math.round(input.nextDouble());
        System.out.print("How many numbers to find average? ");
        numberAmount = input.nextInt();
        if(numberAmount > 1) {
            setAverage();
        }else {
            System.out.println("**Enter two of more numbers for average");
            System.out.print("\nHow many numbers to find average? ");
            numberAmount = input.nextInt();
            setAverage();
        }
        input.close();
    }

    /**Takes the two numbers and calculates sum.
     * @return result of the sum of numbers
     */
   private int getSum(){
       return Math.addExact(num1, num2);
   }

    /**Takes the two numbers and calculates the difference.
     * @return result of difference
     */
    private int getDifference() {
        if (num1 > num2) {
            return Math.subtractExact(num1, num2);
        } else
            return Math.subtractExact(num2, num1);
    }

    /**Takes the two numbers and calculates product.
     * @return result of product
     */
    private int getProduct(){
        return Math.multiplyExact(num1, num2);
    }

    /**Takes at least two numbers and calculates average.
     * stores numbers in array and loops through based on length.
     */
    private void setAverage(){
        /* Declaring array of numberAmount of elements, the value
         * of numberAmount is provided by the user
         */
        int[] arr = new int[this.numberAmount];
        int total = 0;

        //For loop asking for numbers and storing based on length of array
        for(int i = 0 ; i < arr.length; i++){
            System.out.print("Enter " + (i+1) + " number: ");
            arr[i] = input.nextInt();
        }
        //for each loop taking values and storing in total variable
        for (int value : arr) {
            total = total + value;
        }
        //taking total number of variable and dividing length of array or inputs from user
        this.result = total / arr.length;
    }

    /** Returns the result of average from numbers given by user.
     * @return result for average of numbers.
     */
    private int getAverage(){
        return result;
    }

    /** Finds the difference between two numbers from user and gets absolute.
     * @return result from difference of two numbers and making absolute
     */
    private int getAbsolute(){
        return  Math.abs(num1 - num2);
    }

    /** Takes the two numbers from user and gets the max value.
     * @return value that is max number.
     */
    private int getMax(){
       return Math.max(num1, num2);
    }

    /** Takes the two numbers from user and gets the min value.
     * @return value that is min number.
     */
    private int getMin(){
        return Math.min(num1, num2);
    }

    /** Takes results from each method and displays results.
     * Formats numbers so they are aligned with each other
     */
    private void displayResults(){
        System.out.println("\n------- Results -------");
        System.out.printf("Sum:      %13d%n", getSum());
        System.out.printf("Difference:  %10d%n", getDifference());
        System.out.printf("Product:   %12d%n", getProduct());
        System.out.printf("Average:   %12d%n", getAverage());
        System.out.printf("Distance(abs): %8d%n", getAbsolute());
        System.out.printf("Max number:  %10d%n", getMax());
        System.out.printf("Min number:  %10d%n", getMin());
    }
}
