package com.egurnee.projecteuler;
/**
 * Work for Project Euler Problem 3
 * 
 * @author Eddie Gurnee
 * @version 0.0.1, 10/01/13
 *
 */
public class Problem003 {

	public static void main(String[] args) {
		long target = 600851475143L;
		long limit = (long)Math.sqrt(target);
		long solution = 0;
		for (long x = 3; x <= limit; x += 2) {
			if (target % x == 0) {
				if (isPrime(x)) {
					solution = x;
				}
			}
		}
		System.out.println(solution);
	}
	public static boolean isPrime(long n) {
		if (n % 2 == 0) {
			return false;
		}
        for (int i = 3; i < Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }        
        return true;
    }
}