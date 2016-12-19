package net.mai33.zerojudge.basic;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int int1 = scanner.nextInt();
			int int2 = scanner.nextInt();
			int result = int1 + int2;
			System.out.println(result);
		}
	}
}
