package com.shivin.brototype;

import java.util.Arrays;

public class Sort {
	
	public static int [] insertionSort(int[] array) {
		
		for(int i=1;i<=array.length-1;i++) {
			int current = array[i];
			int j = i-1;
			while(j>=0 && array[j] > current) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=current;
		}
		return array;
		
	}
	
	public static int[] bubbleSort(int[] array2) {
		
		for(int i=0;i<array2.length-1;i++) {
			for(int j=0;j<array2.length-i-1;j++) {
				if(array2[j]>array2[j+1]) {
					int temp = array2[j];
					array2[j]= array2[j+1];
					array2[j+1]=temp;
					
				}
			}
		}
		return array2;
		
	}
	
	public static int[] selectionSort(int[] array3) {
		for(int i=0;i<array3.length-1;i++) {
			int minIndex =i;
			for(int j=i+1;j<array3.length;j++) {
				if(array3[j]<array3[minIndex]) {
					minIndex=j;
				}
			}
			int temp = array3[i];
			array3[i] = array3[minIndex];
			array3[minIndex] = temp;
		}
		return array3;
	}
	
	public static int [] quickSort(int [] array4){
		quickSortHelper(array4, 0, array4.length-1);
		return array4;
	}
	
	public static void quickSortHelper(int [] array4,int startIdx,int endIdx) {
		if(startIdx>=endIdx) {
			return;
		}
		int pivotIdx = startIdx;
		int leftIdx  = startIdx+1;
		int rightIdx  = endIdx;
		
		while(leftIdx <= rightIdx) {
			if(array4[leftIdx] > array4[pivotIdx] && array4[rightIdx] < array4[pivotIdx]) {
				swap(array4, leftIdx, rightIdx);
				leftIdx ++;
				rightIdx --;
			}
			if(array4[leftIdx] <= array4[pivotIdx]) {
				leftIdx ++;
			}
			if(array4[rightIdx] >= array4[pivotIdx]) {
				rightIdx --;
			}
		}
		swap(array4,rightIdx,pivotIdx);
		quickSortHelper(array4, startIdx, rightIdx-1);
		quickSortHelper(array4, rightIdx+1, endIdx);
	}
	
	private static void swap(int[] array4,int i,int j) {
		int temp = array4[i];
		array4[i] = array4[j];
		array4[j] = temp;
		
	}
	
	public static void main(String[] args) {
		int[] array = {30,2,41,56,12,11,22,41};
		int [] array2= {40,3,23,54,1,29};
		int [] array3= {5,2,9,1,5,6};
		int [] array4= {32,41,16,2,3,64,2,10};
		int[] result =insertionSort(array);
		//Arrays.stream(result).forEach(System.out::println);
		for(int i=0;i<1;i++) {
			System.out.println(Arrays.toString(result));
		}
			int[] result2 = bubbleSort(array2);
			for(int i=0;i<1;i++) {
				System.out.println(Arrays.toString(result2));
			}
			
			int[] result3=selectionSort(array3);
			for(int i=0;i<1;i++) {
				System.out.println(Arrays.toString(result3));
			}
			
			int[] result4 =quickSort(array4);
			for(int i=0;i<1;i++) {
				System.out.println(Arrays.toString(result4));
			}
			
			
		
	}

}
