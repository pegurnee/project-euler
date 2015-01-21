package com.egurnee.projecteuler;
/**
 * Work for Project Euler Problem 2
 * 
 * @author Eddie Gurnee
 * @version 0.0.1, 10/01/13
 *
 */
public class Problem002 {

	public static void main(String[] args) {
		long solution = 0;
		long limit = 4000000;
		long[] fib = {0, 1, 1};
		while (fib[1] < limit) {
			fib[2] = fib[0] + fib[1];
			if (fib[2] % 2 == 0) {
				solution += fib[2];
			}
			fib[0] = fib[1];
			fib[1] = fib[2];
		}
		System.out.println(solution);
	}
}