package com.shivin.array;

import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limit");
		int limit=s.nextInt();
		System.out.println("Enter Values");
		int a[]=new int[100];
		for(int i=0;i<limit;i++) {
			a[i]=s.nextInt();
		}
			
		for(int i=0;i<limit-1;i++) {
			for(int j=i+1;j<limit;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("sorted Array: ");
		for(int i=0;i<limit;i++) {
		System.out.println(a[i]);
		}
		
	}

}
