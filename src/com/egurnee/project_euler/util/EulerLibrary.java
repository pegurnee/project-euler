package com.egurnee.project_euler.util;

public class EulerLibrary {
	public static boolean isPerfectSquare(long n) {
		long root = (long) Math.sqrt(n);
		return (root * root) == n;
	}

	public static boolean isPrime(long n) {
		if ((n % 2) == 0) {
			return false;
		}
		for (int i = 3; i < Math.sqrt(n); i += 2) {
			if ((n % i) == 0) {
				return false;
			}
		}
		return true;
	}
}
