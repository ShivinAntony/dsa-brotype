package mathclass;

import java.text.NumberFormat;

public class Main {
	public static void main(String[] args) {
		//int result = Math.round(1.1F);
		
		//int a= (int) Math.floor(1.1F);
		//System.out.println(a);
		NumberFormat percent=  NumberFormat.getPercentInstance();
		String result =percent.format(0.1);
		System.out.println(result);
	}

}
