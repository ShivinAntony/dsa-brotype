package day1;



public class MergeArray {
	public static void main(String[] args) {
		int [] a= {1,2,3};
		int [] b= {4,5,6};
		int [] mergedArray =mergeArrays(a,b);//Merge Array
		
		System.out.print("Merged Array:  ");
		for(int element : mergedArray) {
			System.out.print(element+ " ");
		}
	}
	private static int[] mergeArrays(int []a,int []b) {
		int mergedLength = a.length+b.length;
		int [] mergedArray = new int [mergedLength];
		System.arraycopy(a, 0, mergedArray, 0, a.length);
		System.arraycopy(b, 0, mergedArray, a.length, b.length);
		//System.out.println(Arrays.toString(mergedArray));
		return mergedArray;
		
	}

}
