package com.company;

import java.util.Arrays;

public class Int_ConcatenateAndSortArrays {

    public static void main(String[] args) {
        // Define two arrays
        int[] array1 = {5, 2, 9, 1};
        int[] array2 = {8, 3, 7, 4};

        // Concatenate the two arrays
        int[] combinedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, combinedArray, 0, array1.length);
        System.arraycopy(array2, 0, combinedArray, array1.length, array2.length);

        // Sort the combined array in ascending order
        Arrays.sort(combinedArray);

        // Print the combined and sorted array
        System.out.println("Combined Array: " + Arrays.toString(combinedArray));
    }
}

