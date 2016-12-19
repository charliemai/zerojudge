package net.mai33.zerojudge.basic;

import java.util.Scanner;

public class Q9 {

	static int[] inputNum;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int step = -7;
		while (scanner.hasNext()) {
			StringBuffer sb = new StringBuffer();
			String input = scanner.nextLine();
			inputNum = new int[input.length()];
			for (int i = 0; i < input.length(); i++) {
				inputNum[i] = input.charAt(i);
				// if (i == 0) {
				// step = '*' - inputNum[i];
				// System.out.println(step);
				// }
				sb.append((char) (inputNum[i] + step));
			}
			System.out.println(sb.toString());
		}
	}
}