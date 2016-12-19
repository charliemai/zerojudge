package net.mai33.zerojudge.basic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Q7 {

	private static boolean[] primeLists = new boolean[50000];
	private static List primeNums = new ArrayList();

	// static boolean isPrime = false;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		findPrime(50000);

		while (scanner.hasNext()) {
			// isPrime = false;
			int input = scanner.nextInt();
			// method2(input);
			method1(input);
		}
//		long start = Calendar.getInstance().getTimeInMillis();
//		for (int i = 0; i < 200000; i++) {
//			method1(i);
//		}
//		System.out.println("Start: " + start);
//		System.out.println("End: " + Calendar.getInstance().getTimeInMillis());
	}

	private static void method1(int input) {
		// �J�Ԧ����S���z�k
		if (!isPrime(input)) {
			System.out.println("���");
		} else {
			System.out.println("�D���");
		}
	}

	private static void findPrime(int scope) {
		primeLists[0] = true;
		primeLists[1] = true;
		for (int i = 2; i < 50000; i++) {
			if (primeLists[i] == false) {
				for (int y = 2; y * i < 50000; y++) {
					primeLists[y * i] = true;
				}
			}
		}
		for (int i = 2; i < 50000; i++) {
			if (primeLists[i] == false) {
				primeNums.add(new Integer(i));
			}
		}
	}

	private static boolean isPrime(int input) {
		// int input2 = (int) Math.pow(input, 0.5);
		// for (int i = 2; i < input2; i++) {
		// if (input % i == 0 && input != i) {
		// return false;
		// }
		// }
		// return true;
		if (input >= 50000) {
			for (int i = 0; i < primeNums.size(); i++) {
				// System.out.println("primeNums.size(): " + primeNums.size());
				int num = ((Integer) primeNums.get(i)).intValue();
				if (input % num == 0) {
					return true;
				}
			}
			return false;
		} else {
			return primeLists[input];
		}
	}

	// private static void method2(int input) {
	// if (input != 2 && input % 2 == 0) {
	// // not prime
	// } else if (input == 1) {
	// // not prime
	// } else {
	// for (int i = 2; i <= Math.pow(input, 0.5); i++) {
	// if (input % i == 0) {
	// // not prime
	// isPrime = false;
	// break;
	// } else {
	// isPrime = true;
	// }
	// }
	// }
	// if (isPrime) {
	// System.out.println("���");
	// } else {
	// System.out.println("�D���");
	// }
	// }
}