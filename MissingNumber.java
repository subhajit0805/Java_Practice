package coreJava.Array;

public class MissingNumber {
	public static void main(String[] args) {
        int n = 11; // The expected range of numbers. I tried with 11, you can try with 100
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10, 11}; // the numbers should be in range of 1 to n(declared in the above line with 1 missing number)

        int expectedSum = (n * (n + 1)) / 2; // Sum of all numbers from 1 to n
        int arraySum = 0;

        for (int num : arr) {
            arraySum += num;
        }

        int missingNumber = expectedSum - arraySum;
        System.out.println("The missing number is: " + missingNumber);
    }
	
	
}






