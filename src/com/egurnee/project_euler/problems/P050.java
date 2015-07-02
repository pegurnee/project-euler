package com.egurnee.project_euler.problems;

/**
 * Work for Project Euler Problem 50
 *
 * @author Eddie Gurnee
 * @version 0.0.1,
 *
 */
import java.util.Arrays;

import com.egurnee.project_euler.util.EulerLibrary;
import com.egurnee.project_euler.util.EulerSolution;

public class P050 extends EulerSolution {
	private static long[] primes = new long[0];

	public static void addPrime(long nextLong) {
		primes = Arrays.copyOf(primes, primes.length + 1);
		primes[primes.length - 1] = nextLong;
	}

	public static void main(String[] args) {
		long solution = 0;
		long limit = 100;

		addPrime(2L);
		for (long x = 3; x < limit; x += 2) {
			if (EulerLibrary.isPrime(x)) {
				addPrime(x);
			}
		}

		final String solution1 = primes[0] + " " + primes[18];
		System.out.println(solution1);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}
