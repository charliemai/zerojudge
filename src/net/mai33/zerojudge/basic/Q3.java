package net.mai33.zerojudge.basic;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int month = scanner.nextInt();
			int day = scanner.nextInt();
			int sum = (month * 2 + day) % 3;
			switch (sum) {
			case 0:
				System.out.println("普通");
				break;
			case 1:
				System.out.println("吉");
				break;
			case 2:
				System.out.println("大吉");
				break;
			}
		}
	}
}
