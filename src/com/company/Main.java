package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = getIntegers(10);
        sortIntegers(intArray);
        printArray(intArray);
    }

//    takes user input in the form in int from console and return an array.
    public static int[] getIntegers(int len) {
        int[] numbers = new int[len];
        System.out.println("Enter " + len + " amount of numbers\r");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < len; i++) {
            int input = sc.nextInt();
            numbers[i] = input;
            sc.nextLine();
        }
        return numbers;userInput
    }

    public static void sortIntegers(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
//                swap if i is < j
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[] numbers) {
        int len = numbers.length;
        for (int i = 0; i < len; i++) {
            System.out.println(numbers[i]);
        }
    }
}

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.