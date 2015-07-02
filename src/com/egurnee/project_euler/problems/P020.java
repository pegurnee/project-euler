package com.egurnee.project_euler.problems;
/**
 * Work for Project Euler Problem 20
 * 
 * @author Eddie Gurnee
 * @version 0.0.1, 10/02/13
 *
 */
import java.math.BigInteger;

public class P020 {

	public static void main(String[] args) {
		int solution = 0;		
		int limit = 100;
		BigInteger factorialized = new BigInteger("1");
		for (int i = 1; i <= limit; i++) {
			String num = "" + i;
			factorialized = factorialized.multiply(new BigInteger(num));
		}
		String str = "" + factorialized;
		for (int i = 0; i < str.length(); i++) {
			solution += Integer.parseInt(str.substring(i, i + 1));
		}
		System.out.println(solution);
	}
}