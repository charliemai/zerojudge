package net.mai33.zerojudge.basic;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {

			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			double c = scanner.nextDouble();

			double x1 = (-b + Math.pow((b * b - 4.0 * a * c), 0.5)) / (2.0 * a);
			double x2 = (-b - Math.pow((b * b - 4.0 * a * c), 0.5)) / (2.0 * a);

			if (x1 == x2) {
				System.out.println("Two same roots x=" + (int) x1);
			} else {
				if (Double.isNaN(x1) || Double.isNaN(x2)) {
					System.out.println("No real root");
					return;
				}
				if (x1 < x2) {
					double temp = 0.0;
					temp = x1;
					x1 = x2;
					x2 = temp;
				}
				System.out.println("Two different roots x1=" + (int) x1
						+ " , x2=" + (int) x2);
			}
		}
	}
}