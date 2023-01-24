package NewAssignment;

import java.util.Arrays;

public class ArraysProblem {
	
	// Driver function
	public static void main(String argc[]){
	int[] arr = new int []{1, 2, 3, 4, 5, 6, 7};
	int size = 7;
	rearrangeArr(arr, size);

	}

	public static void rearrangeArr(int arr[], int n){
// total even positions
             int evenPos = n / 2;

// total odd positions
              int oddPos = n - evenPos;
             int[] tempArr = new int [n];


               for (int i = 0; i < n; i++)// copy original array in an  	// auxiliary array
            
                      tempArr[i] = arr[i];
                 Arrays.sort(tempArr);    // sort the auxiliary array
                          int j = oddPos - 1;

// fill up odd position in  . original array
                  for (int i = 0; i < n; i += 2) {
                            arr[i] = tempArr[j];
                                     j--;
                             }

                                   j = oddPos;

// fill up even positions in   original array
                    for (int i = 1; i < n; i += 2) {
                           arr[i] = tempArr[j];
                                      j++;
                                }

// display array
                        for (int i = 0; i < n; i++)
                         System.out.print(arr[i] + " ");
                        }
                    }
