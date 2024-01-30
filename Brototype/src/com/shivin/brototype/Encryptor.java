package com.shivin.brototype;

public class Encryptor {
	
	public static String change(String str, int key) {
		int newKey = key %26;
		char[] charArray = new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			int letterPosition = str.charAt(i) + newKey;
			if(letterPosition <= 122) {
				charArray[i] = (char) letterPosition;
			}else {
				charArray[i] = (char) (96+letterPosition%122);
			}
		}
		return new String(charArray);
		
	}
	public static void main(String[] args) {
		String value ="hai";
		System.out.println(change(value, 2));
	}

}
