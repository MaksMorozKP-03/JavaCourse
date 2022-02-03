package rectangles;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int xa1 = 0, ya1 = 0, xb1 = 0, yb1 = 0, xa2 = 0, ya2 = 0, xb2 = 0, yb2 = 0;
		Scanner in = new Scanner(System.in);
		System.out
				.println("Print integer coordinates(xa1,ya1,xb1,yb1,xa2,ya2,xb2,yb2)" + " using Enter after each one");
		try {
			xa1 = in.nextInt();
			ya1 = in.nextInt();
			xb1 = in.nextInt();
			yb1 = in.nextInt();
			xa2 = in.nextInt();
			ya2 = in.nextInt();
			xb2 = in.nextInt();
			yb2 = in.nextInt();
			in.close();
			if (xa1 >= xb1 || ya1 >= yb1 || xa2 >= xb2 || ya2 >= yb2) {
				System.out.println("A coordinates must be lower than B coordinates.");
				throw new Exception();
			}
		} catch (Exception ex) {
			System.out.println("Wrong argument!");
			System.exit(1);
		}

		if (yb1 == ya2 || ya1 == yb2) {
			if (xa1 <= xa2) {
				if (xb1 > xa2) {
					System.out.println("I can see horizontal line.");
					System.exit(0);
				} else if (xb1 == xa2) {
					System.out.println("I can see dot.");
					System.exit(0);
				}
			} else if (xa1 > xa2) {
				if (xb2 > xa1) {
					System.out.println("I can see horizontal line.");
					System.exit(0);
				} else if (xb2 == xa1) {
					System.out.println("I can see dot.");
					System.exit(0);
				}
			}
		} else if (yb1 < ya2 || yb2 < ya1) {
			System.out.println("Our rectangles don`t intersect with each other.");
			System.exit(0);
		} else { 
			if (xa1 <= xa2 && xb1 < xa2) {
				System.out.println("Our rectangles don`t intersect with each other.");
				System.exit(0);
			} else if (xa1 > xa2 && xb2 < xa1) {
				System.out.println("Our rectangles don`t intersect with each other.");
				System.exit(0);
			}
		}
		if (xa1 == xb2 || xb1 == xa2) {
			if (ya1 < ya2) {
				if (yb1 > ya2) {
					System.out.println("I can see vertical line.");
					System.exit(0);
				}
			} else if (ya1 > ya2) {
				if (yb2 > ya1) {
					System.out.println("I can see vertical line.");
					System.exit(0);
				}

			}
		}
		System.out.println("I can see rectangle.");

	}

}
