package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
	public static int sumIntArray(int[] values) {
    	int ans = 0;
    	for (Integer i : values) {
    		ans += i;
    	}
        return ans;
    }

    //2. Complete the method so that it returns the average of all
    //   of the integers in the array being passed in
    public static double averageIntArray(int[] values) {
    	double ans = 0;
    	int sum = 0;
    	int count = 0;
    	for (Integer i : values) {
    		sum += i;
    		count++;
    	}
    	ans = sum/count;
        return ans;
    }


    //3. Complete the method so that it returns true if the integer
    //   array contains the value specified by the second parameter.
    //   It should otherwise return false.
    public static boolean containsIntValue(int[] array, int value) {
    	boolean ans = false;
    	for (Integer i : array) {
    		if (i == value) {
    			ans = true;
    		}
    	}
        return ans;
    }

    //4. Complete the method so that it returns the index of the,
    //   first instance that the specified value occurs in the array.
    //   If the array does not contain the specified value, it should return -1.
    public static int getIndex(int[] arr, int value) {
    	int index = -1;
    	for (int i = 0; i < arr.length; i++) {
    		if (arr[i] == value) {
    			index = i;
    		}
    	}
        return index;
    }
    public static void printString(String[] arr) {
    	for (String s : arr) {
    		System.out.println(s);
    	}
    }
    public static void revString(String[] arr) {
    	for (int i = arr.length - 1; i >= 0; i++) {
    		System.out.println(arr[i]);
    	}
    }
    public static void otherString(String[] arr) {
    	for (int i = 0; i < arr.length; i+=2) {
    		System.out.println(arr[i]);
    	}
    }
    public static void ranString(String[] arr) {
    	Random random = new Random();
    	int rand = random.nextInt(arr.length + 1);
    }
    //1. Create a main method to test the other methods you write.
	public static void main (String[] args) {
		
	}


    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.



    //4. Write a method that takes an array of Strings and prints every other String in the array.


    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.


}
