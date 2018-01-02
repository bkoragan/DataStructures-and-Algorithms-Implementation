package my.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* Binary Search of an Array.
 * 
 * 
 * */
public class SearchNumberInArray {

  // Returns either the index of the location in the array,
  // or -1 if the array did not contain the targetValue
  public static int doSearch(int[] array, int targetValue) {
    int min = 0;
    System.out.println(Arrays.toString(array));
    int max = array.length - 1;
    return findNumber(array, max, min, targetValue);
  }
  private static int findNumber(int[] array, int max, int min, int input){
    if(max<min)
        return -1;
    int guess = Math.round((max+min)/2);
    if(array[guess] == input)
        return guess;
    else if(array[guess] < input)
        min = guess + 1;
    else 
        max = guess - 1;
    return findNumber(array, max, min, input);
  }

	/********** sample inputs tested above code: ****************/
	// input								output	
	//doSearch([2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 		20
		//41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97], 73)	
	//doSearch([22, 44, 66, 88], 88)					3
	//doSearch([99, 100], 101)						-1
	/******************* */
}
