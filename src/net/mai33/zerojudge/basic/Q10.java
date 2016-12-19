package net.mai33.zerojudge.basic;

import java.util.Scanner;

public class Q10 {
	// static boolean flag = true;
	// static int count = 0;
	// static String result = "";

	// public static void main(String[] args) {
	// Scanner scanner = new Scanner(System.in);
	//
	// while (scanner.hasNext()) {
	// int input = scanner.nextInt();
	// flag2 = false;
	// cal(input);
	// }
	// }

	public static void main(String[] args) {
		int n = 0;
		int count;
		Scanner scanner = new Scanner(System.in);
		// System.out.print("�п�J�@�Ӥj��s�����:");
		while (scanner.hasNext()) {
			n = scanner.nextInt();
			System.out.println("");
			// System.out.println("n=" + n);// �L�X�ҿ�J����

			for (int i = 2; i <= n; i++) {
				count = 0;

				while (n % i == 0) {
					count = 1;
					n /= i;
					System.out.print(i);

					while (n % i == 0) {
						n /= i;
						count++;
					}
					if (count == 1) {
						System.out.print("");
					} else {
						System.out.print("^" + count);
					}

				}// end while
				if (n > 2 & count > 0) {
					System.out.print(" * ");
				}

			}// for
		}

	}

	// static boolean flag2 = false;

	// private static void cal(int input) {
	// for (int i = 2; i <= input; i++) {
	// count = 0;
	// if (input % i == 0) {
	// for (int y = i; y < input; y = y * y) {
	// // System.out.println(y);
	// count++;
	// int rest = input / (int) Math.pow(i, count);
	// if (rest % y != 0 && (input == rest * Math.pow(i, count))
	// && count > 1) {
	// // System.out.println("1");
	// System.out.println(i + "^" + count + "*" + rest);
	// flag2 = true;
	// } else if (count == 1 && rest > 0) {
	// // System.out.println("2");
	// // System.out.println("count: " + count);
	// // System.out.println("rest: " + rest);
	// // System.out.println("i: " + i);
	// // System.out.println("y: " + y);
	// if (rest % i != 0) {
	// System.out.println(i + "*" + rest);
	// flag2 = true;
	// }
	//
	// }
	// }
	//
	// if (!flag2 && input == i) {
	// System.out.println(i);
	// }
	// // System.out.println(i + "^" + count + "*" + rest);
	// // System.out.println("===========");
	// }
	// }
	// }
}