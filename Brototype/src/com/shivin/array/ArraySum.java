package com.shivin.array;

import java.util.Scanner;

public class ArraySum {
	
	public static void main(String[] args) {
		
		int limit,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		limit=s.nextInt();
		System.out.println("Enter Values");
		int a[]=new int[100];
		for(int i=0;i<limit;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<limit;i++) {
			sum=sum+a[i];
		}
		System.out.println("Result:"+sum);
	}

}
