package day2;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=s.nextInt();
		int [] a=new int[size];
		System.out.println("Enter the elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the size2 :");
		int size2=s.nextInt();
		int []b=new int [size2];
		System.out.println("Enter the elements:");
		for(int i=0;i<b.length;i++)
		{
			b[i]=s.nextInt();
		}
		int []c=new int [size+size2];
		
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
		    if (a[i] <= a[j]) {
		        c[k++] = a[i++];
		    } else {
		        c[k++] = b[j++];
		    }
		}

		// Handle remaining elements of arr1
		while (i < a.length) {
		    c[k++] = a[i++];
		}

		// Handle remaining elements of arr2
		while (j < a.length) {
		    c[k++] = a[j++];
		}
		System.out.println("Sorted merged array:");
		for (int element : c) {
		    System.out.print(element + " ");
		}
	}

}
