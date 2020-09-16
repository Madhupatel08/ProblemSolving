import java.util.*;
import java.util.Arrays; 
import java.util.Collections; 
import java.util.Scanner;

public class Pep_JavaIP_1Arrays_5Zigzag_array {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		// solve_naive(arr);
        solve_optimized(arr);
	}
    private static void solve_naive(int[] arr) {
        // Time complexity: O(nlogn)
        //first sort the array and then swap from 1 index
        // Arrays.sort(arr, Collections.reverseOrder()); 
        for (int i = 1; i < arr.length - 1; i += 2) {
            swap(arr,i, i + 1);
        }

        for(int val: arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

	private static void solve_optimized(int[] arr) {
  // Time complexity: O(n)
    boolean lesser_than = true;
    for (int i = 0; i < arr.length - 1; i++) {
        if (lesser_than) {
            if (arr[i] > arr[i + 1]) {
                swap(arr,i, i + 1);
            }
        } else {
            if (arr[i] < arr[i + 1]) {
                swap(arr,i, i + 1);
            }
        }
        lesser_than = !lesser_than;
    }
		for(int val: arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
