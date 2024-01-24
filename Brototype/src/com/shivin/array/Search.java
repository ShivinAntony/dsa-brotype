package com.shivin.array;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		int limit,searchKey,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limit");
		limit=s.nextInt();
		System.out.println("Enter the Values");
		int a[]=new int[100];
		for(int i=0;i<limit;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Search Key");
		searchKey=s.nextInt();
		for(int i=0;i<limit;i++) {
			if(searchKey==a[i]) {
				flag=1;
				System.out.println("Value Found at Position :"+(i+1));
				break;
			}
		}
		if(flag==0) {
			
			System.out.println("Not Found"); 
		}
	}

}
