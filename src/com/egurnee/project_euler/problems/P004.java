package com.egurnee.project_euler.problems;
/**0
 * Work for Project Euler Problem 4
 * 
 * @author Eddie Gurnee
 * @version 0.0.1, 10/01/13
 *
 */
public class P004 {

	public static void main(String[] args) {
		int target = 999;
		//int limit = (int)Math.pow(target, 2);
		String solution = "0";
		String formula = "a";
		//int w = 0;
		int z = target * target + 1;
		theLoop: 
		for (int x = target; x > 99; x--) {
			for (int y = target; y > 99; y--) {
				//System.out.println(x + " " + y);
				String pal = "" + (x * y);
				StringBuilder sb = new StringBuilder(pal);
				String rPal = new String(sb.reverse());
				
				if (pal.equals(rPal)) {
					formula = " " + " " + x + " x " + y;
					//System.out.println(formula);
					//break theLoop;
					if (Integer.parseInt(pal) > Integer.parseInt(solution)) {
						solution = pal;
						formula = " " + x + " x " + y + " = " + pal;
						System.out.println(formula);
						//break theLoop;
						
					}
				}
				for (int w = x; w < target && ; w++) {
					if ((w * y) > (x * x) && (x < w) && ((w * y) < (y * y))) {
						System.out.println("DUDE!");
						x = w;
						break;
					}
				}
				z = x * y;
			}
			
		}
		
//		for (int x = 9; x > 0; x++) {
//			for (int y = 9; y > ; y--) {
//				if (x * y < )
//				formula = " " + x + " x " + y + " = " + (x * y);
//				System.out.println(formula);
//			}
//		}
		System.out.println(solution);
		System.out.println(formula);
	}
}

//printMultiples();
//for (int x = target; ; x--) {
//	for (int y = x; ; y--) {
//
//	}
//}
//for (int x = target; !found; x--) {
//	for (int y = x; ; y--) {
//		solution = "" + (x * y);
//		StringBuilder sb = new StringBuilder(solution);
//		String rPal = new String(sb.reverse());
//
//		if (solution.equals(rPal)) {
//			System.out.println(solution);
//		}
//	}
//}
//public static void printMultiples() {
//	int limit = 5;
//
//
//	for (int x = 1; x <= limit; x++) {
//		for (int y = x; y <= limit; y++) {
//			System.out.println(x + " x " + y + " = " + (x * y));
//		}
//
//
//		int y = x;
//		while (x < (x+1) * x) {
//
//			x++
//		}
//
//		System.out.println(x);
//
//	}
//}
//}