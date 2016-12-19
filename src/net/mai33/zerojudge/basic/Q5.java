package net.mai33.zerojudge.basic;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount;
		String[] ans = new String[0];
		while (scanner.hasNext()) {
			amount = scanner.nextInt();
			ans = new String[amount];
			for (int i = 0; i < amount; i++) {
				int a1 = scanner.nextInt();
				int a2 = scanner.nextInt();
				int a3 = scanner.nextInt();
				int a4 = scanner.nextInt();
				int a5 = 0;
				if ((a2 - a1) == (a4 - a3)) {
					// 等差
					a5 = a4 + (a2 - a1);
				} else {
					// 等比
					a5 = a4 * (a4 / a3);
				}
				ans[i] = a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5;
			}
			for (int y = 0; y < amount; y++) {
				System.out.println(ans[y]);
			}

		}

	}
}