package com.egurnee.project_euler.problems;

import com.egurnee.project_euler.util.EulerLibrary;
import com.egurnee.project_euler.util.EulerSolution;

/**
 * Work for Project Euler Problem 3
 *
 * @author Eddie Gurnee
 * @version 0.0.1, 10/01/13
 *
 */
public class P003
extends EulerSolution {

	public static void main(String[] args) {
		long target = 600851475143L;
		long limit = (long) Math.sqrt(target);
		long solution = 0;
		for (long x = 3; x <= limit; x += 2) {
			if ((target % x) == 0) {
				if (EulerLibrary.isPrime(x)) {
					solution = x;
				}
			}
		}
		System.out.println(solution);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long target = 600851475143L;
		long limit = (long) Math.sqrt(target);
		long solution = 0;
		for (long x = 3; x <= limit; x += 2) {
			if ((target % x) == 0) {
				if (EulerLibrary.isPrime(x)) {
					solution = x;
				}
			}
		}
		this.solution = "" + solution;
	}

}
