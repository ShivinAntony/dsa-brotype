package day3;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {4,5,2,8}; 
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		
		System.out.print(Arrays.toString(a));
	}

}
