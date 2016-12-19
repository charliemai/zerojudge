package net.mai33.zerojudge.basic;

import java.util.Scanner;

public class Q13 {

	private static String inputs[];
	private static int digits[] = new int[2];

	private static int abs;

	private static int mCount;
	private static int dCount;
	private static int cCount;
	private static int lCount;
	private static int xCount;
	private static int vCount;
	private static int iCount;

	private static String output = "";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String input = scanner.nextLine();
			if ("#".equals(input)) {
				break;
			} else {
				inputs = input.split(" ");
			}
			convertDigits();
			calAbs();
			shortenOutput();
		}
	}

	private static void shortenOutput() {
		if (abs == 0) {
			System.out.println("ZERO");
		} else {
			while (abs - 1000 >= 0) {
				abs = abs - 1000;
				mCount++;
			}
			while (abs - 500 >= 0) {
				abs = abs - 500;
				dCount++;
			}
			while (abs - 100 >= 0) {
				abs = abs - 100;
				cCount++;
			}
			while (abs - 50 >= 0) {
				abs = abs - 50;
				lCount++;
			}
			while (abs - 10 >= 0) {
				abs = abs - 10;
				xCount++;
			}
			while (abs - 5 >= 0) {
				abs = abs - 5;
				vCount++;
			}
			while (abs - 1 >= 0) {
				abs = abs - 1;
				iCount++;
			}

			for (int i = 0; i < mCount; i++) {
				output += "M";
			}

			for (int i = 0; i < dCount; i++) {
				output += "D";
			}
			while (cCount - 4 >= 0) {
				cCount = cCount - 4;
				output += "CD";
			}
			for (int i = 0; i < cCount; i++) {
				output += "C";
			}
			for (int i = 0; i < lCount; i++) {
				output += "L";
			}
			while (xCount - 4 >= 0) {
				xCount = xCount - 4;
				output += "XL";
			}
			for (int i = 0; i < xCount; i++) {
				output += "X";
			}
			for (int i = 0; i < vCount; i++) {
				output += "V";
			}

			while (iCount - 4 >= 0) {
				iCount = iCount - 4;
				output += "IV";
			}
			for (int i = 0; i < iCount; i++) {
				output += "I";
			}
			System.out.println(output);
		}
	}

	private static void calAbs() {
		abs = Math.abs(digits[0] - digits[1]);
	}

	private static void convertDigits() {
		if (inputs.length > 1) {
			for (int i = 0; i < inputs[0].length(); i++) {
				char c = inputs[0].charAt(i);
				digits[0] += convertRomaToInt(c);
			}
			for (int i = 0; i < inputs[1].length(); i++) {
				char c = inputs[1].charAt(i);
				digits[1] += convertRomaToInt(c);
			}
		}
	}

	private static int convertRomaToInt(char c) {
		switch (c + "") {
		case "I":
			return 1;
		case "V":
			return 5;
		case "X":
			return 10;
		case "L":
			return 50;
		case "C":
			return 100;
		case "D":
			return 500;
		case "M":
			return 1000;
		default:
			return 0;
		}
	}
}
