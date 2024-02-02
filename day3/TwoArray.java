package day3;

import java.util.Arrays;

public class TwoArray {
	public static void main(String[] args) {
		int [] a= {1,4,2};int	ci=0;
		int [] b= {7,6,9,5};
		int [] c= new int [a.length+b.length];
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
		System.out.print("Sorted Array: ");
		
		for(int j=0;j<c.length;j++)
		{
			for(int k=j+1;k<c.length;k++)
			{
				if(c[j]>c[k])
				{
					int temp=c[j];
					c[j]=c[k];
					c[k]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(c));
		
	}

}
