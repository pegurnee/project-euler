package com.egurnee.project_euler.problems;
/**
 * Work for Project Euler Problem 50
 * 
 * @author Eddie Gurnee
 * @version 0.0.1,
 *
 */
import java.util.Arrays;

public class P050 {
	private static long[] primes = new long[0];
	
	public static void main(String[] args) {
		long solution = 0;
		long limit = 100;
		
		addPrime(2L);
		for (long x = 3; x < limit; x +=2) {
			if (isPrime(x)) {
				addPrime(x);
			}
		}
		
		System.out.println(primes[0] + " " + primes[18]);
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
	public static void addPrime(long nextLong) {
		primes = Arrays.copyOf(primes, primes.length + 1);
		primes[primes.length - 1] = nextLong;
	}
}