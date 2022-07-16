package com.nguonchhay;

import java.util.Arrays;
import java.util.Scanner;

public class Week3Demo {
    public void task1() {
        int[] numbers = {1, 4, 6, 2, 3};
//        int maxValue = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            if (maxValue < numbers[i]) {
//                maxValue = numbers[i];
//            }
//        }
        int maxValue = findMaxValueFromIntArray(numbers);
        System.out.println("Maxvalue = " + maxValue);

        int[] anotherArray = {2, 5, 8, 19};
        maxValue = findMaxValueFromIntArray(anotherArray);
        System.out.println("Maxvalue = " + maxValue);
    }

    int findMaxValueFromIntArray(int[] numArray) {
        int maxValue = numArray[0];
        for (int i = 1; i < numArray.length; i++) {
            if (maxValue < numArray[i]) {
                maxValue = numArray[i];
            }
        }
        return maxValue;
    }

    void printArray(int[] numArray) {
        for (int number : numArray) {
            System.out.print(" " + number);
        }
    }

    public void task2() {
        int[] numbers = {1, 4, 6, 2, 3};
        System.out.println("Before sort");
        printArray(numbers);

        Arrays.sort(numbers);
        System.out.println("\nAfter sort");
        printArray(numbers);
    }

    public void task2_1() {
        int[] numbers = {8, 2, 7, 5, 3};
        System.out.println("Before sort");
        printArray(numbers);

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int k = i + 1; k < numbers.length; k++) {
                if (numbers[i] > numbers[k]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[k];
                    numbers[k] = temp;
                }
            }
        }

        System.out.println("\nAfter sort");
        printArray(numbers);
    }

    int getSumFromIntArray(int[] numArray) {
        int sum = 0;
        for (int num : numArray) {
            sum += num;
        }
        return sum;
    }

    public void task3() {
        int[] numbers = {1, 4, 6, 2, 3};
        printArray(numbers);
        System.out.println("\nSum of array: " + getSumFromIntArray(numbers));
    }

    public void task4() {
        int[] numbers = {1, 4, 6, 2, 6};
        System.out.println("Before delete item");
        printArray(numbers);

        int deleteValue = 6;
        int countDelete = 0;
        for (int number: numbers) {
            if (deleteValue == number) {
                countDelete++;
            }
        }

        int[] newArray = new int[numbers.length - countDelete];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != deleteValue) {
                newArray[index] = numbers[i];
                index++;
            }
        }

        System.out.println("\nAfter delete item = " + deleteValue);
        printArray(newArray);
    }

    public void task5() {
        int[] numbers = {8, 1, 4, 8, 3, 8};

        Arrays.sort(numbers);
        printArray(numbers);

        int secondMax = 0;
        int index = numbers.length - 2;
        while (index >= 0) {
            secondMax = numbers[index];
            if (secondMax < numbers[numbers.length - 1]) {
                break;
            } else {
                index--;
            }
        }
        System.out.println("\nSecond max = " + secondMax);
    }

    public void task5_1() {
        int[] numbers = {1, 6, 6, 2, 6};
        int firstMaxValue = numbers[0];
        int secondMaxValue = numbers[1];
        if ( numbers[0] < numbers[1]) {
            firstMaxValue = numbers[1];
            secondMaxValue = numbers[0];
        }
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] > firstMaxValue) {
                secondMaxValue = firstMaxValue;
                firstMaxValue = numbers[i];
            } else {
                if (numbers[i] > secondMaxValue && numbers[i] < firstMaxValue) {
                    secondMaxValue = numbers[i];
                }
            }
        }
        System.out.println("First max: " + firstMaxValue + ", second max: " + secondMaxValue);
    }

    public void task6() {
        Scanner scanner = new Scanner(System.in);
        char answer = ' ';
        String[] names = new String[100];
        double[] unitPrices = new double[100];
        int[] quantities = new int[100];
        int index = 0;

        do {
            System.out.print("Product name: ");
            names[index] = scanner.nextLine();

            System.out.print("Unit price: ");
            unitPrices[index] = scanner.nextDouble();

            System.out.print("Quantity: ");
            quantities[index] = scanner.nextInt();

            scanner.nextLine();
            System.out.print("\nPress y to continue shopping: ");
            answer = scanner.nextLine().charAt(0);

            index++;
        } while(answer == 'y' || answer == 'Y');

        System.out.println("\n                              Invoice                        ");
        System.out.println("\n--------------------------------------------------------------");
        double total = 0.0;
        for (int i = 0; i < index; i++) {
            double subTotal = unitPrices[i] * quantities[i];
            total += subTotal;
            System.out.println((i + 1) + ". Name: " + names[i] + ", Unit Price: " + unitPrices[i] + ", Quantity: " + quantities[i] + ", Total: " + subTotal);
        }
        System.out.println("\n--------------------------------------------------------------");
        System.out.println("\n                                                  Total: " + total);
    }
}
