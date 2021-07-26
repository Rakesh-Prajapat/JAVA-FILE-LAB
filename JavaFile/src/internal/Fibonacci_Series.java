package internal;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		fib(n);
	}

	public static void fib(int n) {
		int a = 0, b = 1;
		for (int i = 1; i <= n; i++) {
			System.out.println(a);
			int c = a + b;
			a = b;
			b = c;
		}
	}
}
