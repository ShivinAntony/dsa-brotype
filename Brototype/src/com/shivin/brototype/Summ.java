package com.shivin.brototype;

import java.util.Scanner;

public class Summ {
	int sum=0;
	public static void main(String[] args) {
		
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		
		for(int i=1;i<=a;i++) {
		 sum=sum+i;
		}
		System.out.println(sum);
	}

}
