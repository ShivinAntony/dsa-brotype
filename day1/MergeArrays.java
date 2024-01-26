package day1;

public class MergeArrays {
	
	    public static void main(String[] args) {
	        // Sample arrays
	        int[] array1 = {1, 2, 3};
	        int[] array2 = {4, 5, 6};

	        // Merge arrays
	        int[] mergedArray = mergeArrays(array1, array2);

	        // Display the merged array
	        System.out.print("Merged Array: ");
	        for (int element : mergedArray) {
	            System.out.print(element + " ");
	        }
	    }

	    private static int[] mergeArrays(int[] array1, int[] array2) {
	        // Determine the length of the merged array
	        int mergedLength = array1.length + array2.length;

	        // Create a new array to hold the merged elements
	        int[] mergedArray = new int[mergedLength];

	        // Copy elements from array1 to mergedArray
	        System.arraycopy(array1, 0, mergedArray, 0, array1.length);

	        // Copy elements from array2 to mergedArray
	        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

	        return mergedArray;
	    }
	}



