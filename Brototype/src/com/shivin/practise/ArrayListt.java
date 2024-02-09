package com.shivin.practise;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListt {
	
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(6);
		nums.add(4);
		nums.add(7);
		nums.add(9);
		nums.remove(2);
		//nums.contains(4);
		System.out.println(nums.contains(4));
		
		System.out.println(nums);
		
	}

}
