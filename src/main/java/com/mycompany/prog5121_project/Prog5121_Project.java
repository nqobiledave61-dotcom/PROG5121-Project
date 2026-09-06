package com.mycompany.prog5121_project;
import javax.swing.JOptionPane;

/**
 * Practical Assessment: Methods in Java
 * Author: Nqobile
 * This program prompts the user for two numbers,
 * calculates their sum and average using methods,
 * and displays the results.
 */
public class Prog5121_Project {

    // Method to calculate the sum of two numbers
    public static int calculateSum(int number1, int number2) {
        return number1 + number2;
    }

    // Method to calculate the average of two numbers
    public static double calculateAverage(int number1, int number2) {
        return (number1 + number2) / 2.0; // use 2.0 for decimal precision
    }

    // Main method: program entry point
    public static void main(String[] args) {
        // Prompt user for input
        String num1 = JOptionPane.showInputDialog(null, "Enter the first number:");
        String num2 = JOptionPane.showInputDialog(null, "Enter the second number:");

        // Convert input from String to int
        int firstNum = Integer.parseInt(num1);
        int secondNum = Integer.parseInt(num2);

        // Call methods to calculate sum and average
        int sum = calculateSum(firstNum, secondNum);
        double average = calculateAverage(firstNum, secondNum);

        // Display results
        JOptionPane.showMessageDialog(null, 
            "The sum of the two numbers is: " + sum +
            "\nThe average of the two numbers is: " + average);
    }
}
