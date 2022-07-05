package com.nguonchhay;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class JavaIntake4 {
    public static void main(String[] args) {

        // Task 1 solution
        /* 1. Ask user input score and store in variable => score
         * 2. Calculate grade
         *  if score greater than or equal 95 and score less than 100 then print A
         *  if score >= 90 and score < 95 then print B
         *  if score >= 80 and score < 90 then print C
         *  if score >= 65 and score < 80 then print D
         *  if score >= 50 and score < 65 then print E
         *  if score < 50 then print F
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter score: ");
//        int score = scanner.nextInt();
//        if (95 <= score && score < 100) {
//            System.out.println("Your grade is A");
//        } else if (90 <= score && score < 95) {
//            System.out.println("Your grade is B");
//        } else if (80 <= score && score < 90) {
//            System.out.println("Your grade is C");
//        } else if (65 <= score && score < 80) {
//            System.out.println("Your grade is D");
//        } else if (50 <= score && score < 65) {
//            System.out.println("Your grade is E");
//        } else if (score < 50) {
//            System.out.println("Your grade is F");
//        } else {
//            System.out.println("Your score is out of range 0-100");
//        }

        // Task 2 solution
        /**
         * Rectangle
         * - Area = width * height
         * - perimeter = 2 * (width + height)
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter width: ");
//        double width = scanner.nextDouble();
//
//        System.out.print("Enter height: ");
//        double height = scanner.nextDouble();
//
//        double area = width * height;
//        double perimeter = 2 * (width + height);
//        System.out.println("Area = " + area + ", Perimeter = " + perimeter);

        // Task 3 solution
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter first value: ");
//        int value1 = scanner.nextInt();
//
//        System.out.print("Enter second value: ");
//        int value2 = scanner.nextInt();
//
//        if (value1 == 30 || value2 == 30 || value1 + value2 == 30) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }

        // Task 4 solution
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input 1: ");
//        double input1 = scanner.nextDouble();
//
//        System.out.print("Input 2: ");
//        double input2 = scanner.nextDouble();
//
//        System.out.print("Input sign(+,-,*,/,%): ");
//        scanner.nextLine();
//        char sign = scanner.nextLine().charAt(0);
//        double result = 0.0;
//        boolean isSignValid = true;
//        switch(sign) {
//            case '+':
//                result = input1 + input2;
//                break;
//            case '-':
//                result = input1 - input2;
//                break;
//            case '*':
//                result = input1 * input2;
//                break;
//            case '/':
//                result = input1 / input2;
//                break;
//            case '%':
//                result = input1 % input2;
//            default:
//                isSignValid = false;
//                System.out.println("Invalid sign");
//        }
//        if (isSignValid) {
//            System.out.println("Result = " + result);
//        }

        // Task 5 solution
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter birth date (mm/dd/yyy): ");
//        String strBirthDate = scanner.nextLine();
//
//        Calendar calendar = Calendar.getInstance();
//        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyy", Locale.ENGLISH);
//
//        try {
//            Date birthDate = sdf.parse(strBirthDate);
//            long timeDiff = Math.abs(calendar.getTimeInMillis() - birthDate.getTime());
//            /**
//             * 1s = 1000ms
//             * 1m = 60s
//             * 1h = 60m
//             * 1d = 24h
//             */
//            long days = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
//            int age = (int)(days / 365);
//            int day = (int)(days % 365);
//
//            System.out.println(
//                String.format("Welcome to %s! you are %d year(s) old and days %d.", name, age, day)
//            );
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }

        // Task 6 solution
        /**
         * Input sentence: this is A SAMple SENtenCE
         * Output sentence: This Is A Sample Sentence
         * Solution:
         * 1. Convert string to lowercase => this is a sample sentence
         * 2. Cut string to input piece => this, is, a, sample, sentence
         * 3. Get the first letter => t, i, a, s, s
         * 4. Convert to uppercase => T, I, A, S, S
         * 5. Replace the first letter on piece => This, Is, A, Sample, Sentence
         * 6. Combine all piece with space => This Is A Sample Sentence
         */
//        System.out.print("Enter sentence to format: ");
//        Scanner scanner = new Scanner(System.in);
//        String inputSentence = scanner.nextLine();
//        String uppercase = inputSentence.toLowerCase();
//        String[] splitString = uppercase.split(" ");
//        int count = splitString.length;
//        String outputSentence = "";
//        for (int i = 0; i < count; i++) {
//            String firstLetter = splitString[i].substring(0, 1).toUpperCase();
//            String newWord = firstLetter + splitString[i].substring(1);
//            outputSentence += " " + newWord;
//        }
//        System.out.println("Input sentence = " + inputSentence);
//        System.out.println("Out sentence = " + outputSentence);

        // Task 7 solution
        /**
         * Sum the number from 1 to the input number
         * Example: inputNumber = 5 then sum = 1+2+3+4+5 = 15
         *          inputNumber = 3 then sum = 1+2+3 = 6
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            System.out.print(i);
            if (i < number) {
                System.out.print(" + ");
            }
            sum += i; // sum = sum + i;
        }
        System.out.print(" = " + sum);
//        int number, start, sum;
//        char answer;
//        do {
//            sum = 0;
//            start = 1;
//            System.out.print("\nEnter number: ");
//            number = scanner.nextInt();
//            while (start <= number) {
//                sum += start;
//                start += 1;
//            }
//            System.out.println("Sum = " + sum);
//            System.out.print("==> Press y to run again: ");
//            scanner.nextLine();
//            answer = scanner.nextLine().charAt(0);
//        } while(answer == 'y');
//        while (true) {
//            sum = 0;
//            start = 1;
//            System.out.print("Enter number: ");
//            number = scanner.nextInt();
//            while (start <= number) {
//                sum += start;
//                start += 1;
//            }
//            System.out.println("Sum = " + sum);
//            System.out.print("==> Press 'y' to run again: ");
//            scanner.nextLine();
//            answer = scanner.nextLine().charAt(0);
//            if (answer != 'y') {
//                break;
//            }
//        }
    }
}
