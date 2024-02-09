package com.shivin.practise;

public class TrianglePattern {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("SQURE");
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("LEFT TRIANGLE");
		
		 

	        for (int i = 1; i <= 5; i++) {
	            for (int j = 5; j > i; j--) {
	                System.out.print("  ");
	            }
	            for (int k = 1; k <= i; k++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
		
	}

}
