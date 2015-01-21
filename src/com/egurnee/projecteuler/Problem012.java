package com.egurnee.projecteuler;
/**
 * Work for Project Euler Problem 12
 * 
 * @author Eddie Gurnee
 * @version 0.0.1, 10/01/13
 *
 */

public class Problem012 {

	public static void main(String[] args) {
		long triangle = 0;
		int numFactors = 0;
		for (int i = 1; numFactors < 500; i++) {
			triangle += i;
			numFactors = 0;
			if (isPerfectSquare(triangle)) {
				numFactors++;
			}
			for (int j = 1; j <= Math.sqrt(triangle); j++) {
				if (triangle % j == 0) {
					numFactors += 2;
				}
			}
		}
		System.out.println(triangle);
	}	
	public static boolean isPerfectSquare(long n) {	 
		long root = (long)Math.sqrt(n);
		return (root * root) == n;
	}
}