//if two or more people have the same maximum height, the first one encountered
//if two or more people have the same maximum weight, the first one encountered
//your task is to find and rerun the string denoting two integers separated by a space.
//the first integer represents the maximum height and the second integer represents the maximum weight.
//Input: n=5 , arr=[10,100,20,50,8,200,60,80,10,40] like 10is height and 100 is weight
//Output: Maximum height: 4 Maximum weight: 3
import java.util.*;
public class maxheightweight {
    public static void main(String[]args){
        int[] arr = {10,100,20,50,8,200,60,80,10,40};
        int n = arr.length;
        int maxheight=arr[0];
        int maxweight=arr[1];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (arr[i] > maxheight) {
                    maxheight = arr[i];
                }
            } else {
                if (arr[i] > maxweight) {
                    maxweight = arr[i];
                }
            }
        }
        System.out.println("Maximum height: " + maxheight + " Maximum weight: " + maxweight);
    }
}

// The code defines a class named `maxheightweight` that contains a main method.
// Inside the main method, an integer array `arr` is initialized with a set of values representing heights and weights.
// The length of the array is stored in the variable `n`.
// Two integer variables, `maxheight` and `maxweight`, are initialized to 0.
// A for loop iterates through the array, checking if the index is even or odd.
// If the index is even, it compares the current height value with `maxheight`.
// If the current height is greater than `maxheight`, it updates `maxheight`.
// If the index is odd, it compares the current weight value with `maxweight`.
// If the current weight is greater than `maxweight`, it updates `maxweight`.
// Finally, it prints the maximum height and weight found in the array.