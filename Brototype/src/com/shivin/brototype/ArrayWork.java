package com.shivin.brototype;

public class ArrayWork {
	
	public static int[] moveElementToEnd(int[]array,int target) {
		 
		int i=0;int j = array.length-1;
		while(i<j) {
			while(i<j && array[j]== target) {
				j--;
			}
			if(array[i]== target) {
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
			i++;
		}
		return array;
		
	}
	public static void main(String[] args) {
		int[] array = {6,1,6,8,10,4,1,5,6,3,9,5};
		int target =6;
		int[] result =moveElementToEnd(array,target);
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}

}
