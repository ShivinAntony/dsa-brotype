package day3;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prev=0,cur=1,next;
		System.out.println(prev+" "+cur);
		for(int i=0;i<10;i++)
		{
			next=prev+cur;
			System.out.println(next);
			prev=cur;
			cur=next;
		}

	}

}
