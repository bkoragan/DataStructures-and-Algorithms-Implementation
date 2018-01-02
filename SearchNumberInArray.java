package my.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* Binary Search of an Array - first 25 prime numbers, in order.
 * 
 * 
 * */
public class SearchNumberInArray {

	public static void main(String[] args) {
		// an array of first 25 prime integers
		int[] primeArray = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		int input = 79;
		
		int n = primeArray.length; 
		int min = 0;
		int max = n;
		if(findGuess(primeArray, min, max, input)){
			System.out.println("number found in array.");
		}else{
			System.out.println("number NOT found in array.");
		}
	}

	private static boolean findGuess(int[] primeArray, int min, int max, int n) {
		int guess = Math.round((min + max)/2);
		if(max < min){
			return false;
		}
		if(primeArray[guess] == n){
			return true;
		}
		if( primeArray[guess] < n){
			min = guess + 1;
			return findGuess(primeArray, min, max, n);
		}else{
			max = guess - 1;
			return findGuess(primeArray, min, max, n);
				
		}
	}

}
