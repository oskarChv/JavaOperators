package com.sample.spread.operator;

public class SpreadOperatorSample {
	static void multiAddition(int ... params) {
		int result = 0;
		for(int i : params) {
			result += i;
		}
		System.out.println("Multi addition >> "+result);
	}
	public static void main(String[] args) {
		multiAddition(1,2,3,4,5);
		multiAddition(1,2);
		multiAddition(1);
	}

}
