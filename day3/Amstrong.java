package day3;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153,sum=0,rem,cube,x=n;
		while(n!=0)
		{
			rem=n%10;
			cube=rem*rem*rem;
			sum=sum+cube;
			n=n/10;
		}
		if(x==sum)
		{
			System.out.println("Amstrong");
		}
		else
		{
			System.out.println("not Amstrong");
		}

	}

}
