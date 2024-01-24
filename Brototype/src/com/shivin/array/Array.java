package com.shivin.array;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int limit;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array limit");
		limit=s.nextInt();
		System.out.println("Enter values");
		int a[]=new int[100];
		for(int i=0;i<limit;i++) {
		 a[i]=s.nextInt();
		}
		System.out.print("Enterd Values are:");
		for(int i=0;i<limit;i++) {
			System.out.print(a[i]+"\t");
		}
		
		}

}
