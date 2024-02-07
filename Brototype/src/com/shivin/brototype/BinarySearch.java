package com.shivin.brototype;

public class BinarySearch {
	
	public static int binaryIter(int[] array, int target) {
		int startIdx = 0;
		int endIdx = array.length -1;
		while(startIdx<= endIdx) {
			int middle = startIdx+(endIdx-startIdx)/2;
			if(array[middle]==target) {
				return middle ;
			}
			else if(array[middle]> target) {
				endIdx = middle-1;
			}else if(array[middle]< target) {
				startIdx = middle +1;
			}
		}
		
		return -1;
	}
	
	public static int binaryRec(int[] array,int target) {
		return binaryRecHelper(array, target, 0, array.length-1);
		
	}
	
	public static int binaryRecHelper(int[] array,int target,int startIdx, int endIdx) {
		if(startIdx > endIdx) {
			return -1;
		}
		int middle = startIdx+(endIdx-startIdx)/2;
		if(array[middle]== target) {
			return middle;
		}else if(array[middle]> target) {
			return binaryRecHelper(array, target, startIdx, middle-1);
		}else if(array[middle]< target) {
			return binaryRecHelper(array, target, middle+1, endIdx);
		}
		return target;
	}
	
	public static void main(String[] args) {
		int [] array= {1,2,3,4,5,6,7};
		
		System.out.println(binaryRec(array, 9));
		
	}

}
