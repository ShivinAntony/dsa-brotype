package day2;

import java.util.Arrays;

public class Merge {
	public static void main(String[] args) {
		int [] a= {1,23,24}; int ci=0;
		int [] b= {3,4,3,1,4};
		int [] c=new int[a.length+b.length];
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
