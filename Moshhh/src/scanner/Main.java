package scanner;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.print("Name: ");
		String name=s.nextLine();
		System.out.print("Age: ");
		int age=s.nextInt();
		System.out.print("Salary : ");
		double salary=s.nextDouble();
		System.out.println("Your are "+ name);
		System.out.println("You are "+  age);
		System.out.println("You are "+ salary);
		
	}

}
