package day2;


import java.util.Scanner;

public class Ascending {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Enter the size :");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the Elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Elements are: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
    //sorting
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
				  int	temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array: ");
		for(int i=0;i<arr.length;i++)
		{
		 System.out.print(arr[i]+" ");	
		}
	}

}
