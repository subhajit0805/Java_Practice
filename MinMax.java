package coreJava.Array;

public class MinMax {

	public static void main(String[] args) {
        int[] numbers = {5, 12, 42, 3, 8, 19, 25, 38, 10};

        if (numbers.length == 0) {
            System.out.println("The array is empty.");
            return;
        }

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
