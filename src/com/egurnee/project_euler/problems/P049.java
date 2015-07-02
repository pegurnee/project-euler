package com.egurnee.project_euler.problems;
/**
 * Work for Project Euler Problem 20
 * 
 * @author Eddie Gurnee
 * @version 0.0.1, 10/02/13
 *
 */
public class P049 {

	public static void main(String[] args) {
		String formula = "";
		
		for (int x = 1001; x < 3339; x += 2) {
			if (isPrime(x)) {
				int y = x + 3330;
				if (isPrime(y)) {
					int z = y + 3330;
					if (isPrime(z)) {
						
					}
				}
			}
		}
	}

}
