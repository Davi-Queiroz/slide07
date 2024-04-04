package trab;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c, cal1, cal2, delta;

		System.out.println("Valor de A: ");
		a = in.nextDouble();
		if (a == 0) {
			System.out.println("Valor eraddo, seu bobao");
		}
		else {
			System.out.println("Valor de B: ");
			b = in.nextDouble();

			System.out.println("Valor de C: ");
			c = in.nextDouble();

			delta = (Math.pow(b, 2) - 4 * a * c);
			if (delta < 0 || a <= 0) {
				System.out.println("Valores invalidos");
			} else {
				cal1 = (-b + Math.sqrt(delta)) / 2;
				cal2 = (-b - Math.sqrt(delta)) / 2;

				System.out.println(cal1);
				System.out.println(cal2);
			}
		}
		in.close();
	}

}
