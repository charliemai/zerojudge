package net.mai33.zerojudge.basic;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int year = scanner.nextInt();
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println("閏年");
			} else {
				System.out.println("平年");
			}
		}
	}
}