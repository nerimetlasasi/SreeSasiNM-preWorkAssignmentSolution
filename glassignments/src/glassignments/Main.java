package glassignments;

import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    //function to checkPalindrome
    public void checkPalindrome() {

        System.out.println("Enter a number to check for palindrome");
        int userInput = sc.nextInt();
        int reversedNumber = 0;
        int temp = userInput;
        while ((temp / 10) != 0) {
            reversedNumber = ((reversedNumber * 10) + temp % 10);
            temp = temp / 10;
        }
        if (temp / 10 == 0) {
            reversedNumber = ((reversedNumber * 10) + userInput % 10);
        }
        if (userInput == reversedNumber)
            System.out.println(userInput + " is a palindrome");
        else
            System.out.println(userInput + " is not a palindrome");
    }

    //function to printPattern
    public void printPattern() {
        System.out.println("Enter a number to print the stars triangle in descending order");
        int starCount = sc.nextInt();
        if (starCount > 0) {
            for (int outerIndex = 0; outerIndex <= starCount; outerIndex++) {
                for (int innerIndex = starCount; innerIndex >= 0; innerIndex--) {
                    if (innerIndex <= outerIndex) {

                        if (innerIndex != 0)
                            System.out.print(" ");
                    } else
                        System.out.print("* ");
                }
                System.out.println();
            }
        } else
            System.out.println("Please enter the number greater than 0");
    }

    //function to check no is prime or not
    public void checkPrimeNumber() {
        System.out.println("Enter a number to check prime or not");
        long numberPrimeOrNot = sc.nextInt();
        boolean isPrime = true;
        for (int count = 2; count <= numberPrimeOrNot; count++) {
            if (count != numberPrimeOrNot && numberPrimeOrNot % count == 0) {
                isPrime = false;
            }
        }
        if (isPrime)
            System.out.println(numberPrimeOrNot + " is a prime number");
        else
            System.out.println(numberPrimeOrNot + " is not a prime number");
    }

    // function to print Fibonacci Series
    public void printFibonacciSeries() {

        //initialize the first and second value as 0,1 respectively.
        System.out.println("Enter a number to print Fibonacci series");
        int fiboNumber = sc.nextInt();
        int count = 3;
        int first = 0;
        int second = 1;
        int third = first + second;
        System.out.println("Fibonacci series from 0 to " + fiboNumber);
        System.out.print(first + " " + second + " " + third + " ");
        while (count != fiboNumber) {
            first = second;
            second = third;
            third = first + second;
            System.out.print(third + " ");
            count++;
        }
    }

    //main method which contains switch and do while loop
    public static void main(String[] args) {

        Main obj = new Main();
        int choice;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

                +
                "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

                +
                "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

            System.out.println();
            choice = sc.nextInt();
            switch (choice) {

                case 0:
                    choice = 0;
                    break;

                case 1:
                    {
                        obj.checkPalindrome();
                    }
                    break;

                case 2:
                    {
                        obj.printPattern();
                    }
                    break;

                case 3:
                    {
                        obj.checkPrimeNumber();
                    }
                    break;

                case 4:
                    {
                        obj.printFibonacciSeries();
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Enter a valid no.\n");
            }
        } while (choice != 0);

        System.out.println("Exited Successfully!!!");
        sc.close();
    }
}