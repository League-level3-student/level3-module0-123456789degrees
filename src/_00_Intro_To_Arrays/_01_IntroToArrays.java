package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String[] arr = {"Joshua", "Joleen", "Jonathan", "Paul", "Sally"};
        // 2. print the third element in the array
    	System.out.println(arr[2]);
        // 3. set the third element to a different value
    	arr[2] = "Joshua Rules!!!";
        // 4. print the third element again
    	System.out.println(arr[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	for (int i = 0; i < 5; i++) {
    		arr[i] = "qwerty";
    	}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	for (int i = 0; i < arr.length; i++) {
    		System.out.println(arr[i]);
    	}
        // 7. make an array of 50 integers
    	Integer[] ints = new Integer[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
    	for (int i = 0; i < 50; i++) {
    		Random rand = new Random();
    		int random = rand.nextInt(101);
    		ints[i] = random;
    	}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	int ans = 1234567890;
    	for (int i = 0; i < 50; i++) {
    		if (ints[i] < ans) {
    			ans = ints[i];
    		}
    	}
    	System.out.println(ans);
        // 10 print the entire array to see if step 8 was correct
    	for (Integer i : ints) {
    		System.out.print(i + " ");
    	}
        // 11. print the largest number in the array.
    	int ans2 = -902319;
    	for (int i = 0; i < 50; i++) {
    		if (ints[i] > ans2) {
    			ans2 = ints[i];
    		}
    	}
    	
    	System.out.println("\n" + ans2);
        // 12. print only the last element in the array
    	System.out.println(ints[49]);
    }
}
