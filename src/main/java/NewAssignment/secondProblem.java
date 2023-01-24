package NewAssignment;

import java.util.Arrays;

public class secondProblem {
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7};
	        int n = arr.length;

	        rearrangeArray(arr, n);

	        System.out.println(Arrays.toString(arr));
	    }

	    static void rearrangeArray(int[] arr, int n) {
	        int max = arr[n - 1] + 1;

	        for (int i = 0; i < n; i++) {
	            if (i % 2 == 0) {
	                arr[i] += (arr[n - 1 - i] % max) * max;
	            } else {
	                arr[i] -= (arr[n - 1 - i] % max) * max;
	            }
	        }

	        for (int i = 0; i < n; i++) {
	            arr[i] = arr[i] / max;
	        }
	    }
	}

