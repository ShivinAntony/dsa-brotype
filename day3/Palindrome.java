package day3;

public class Palindrome {
	public static void main(String[] args) {
		int n=212,rem,rev=0,x=n;
		
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(x==rev)
		{
			System.out.println("its palindrome");
		}
		else
		{
			System.out.println("its not palindrome");
		}
	}

}
