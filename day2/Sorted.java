package day2;

import java.util.Arrays;

public class Sorted {
	public static void main(String[] args) {
		int []a= {1,2,3,4}; int ci=0;
		int []b= {4,5,6,7,8,9};
		int []c= new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[ci]=a[i];
			ci++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[ci]=b[i];
			ci++;
			}
		System.out.println(Arrays.toString(c));
	}

}
				