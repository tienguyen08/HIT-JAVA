package btvn;

import java.util.Scanner;

public class b1 {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
		double pi = 3.14;
		double r;
		do{
			r = scanner.nextDouble();
		}
		while(r <= 0 || r >= 1000);
		System.out.print((2*r*pi) + " " + (r*r*pi));
		}
	}
}
