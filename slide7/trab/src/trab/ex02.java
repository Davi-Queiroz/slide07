package trab;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double taxa;
		int dia;

		System.out.println("Quantos dias ira ficar hospedado: ");
		dia = in.nextInt();

		if (dia <= 0) {
			System.err.println("Você é burro, seu besta!");
		} else {
			if (dia < 15) {
				taxa = (dia * 250) + (dia * 58);
			}

			else if (dia == 15) {
				taxa = (dia * 250) + (dia * 36);

			} else {
				taxa = (dia * 250) + (dia * 15.50);

			}
			System.out.println("vOCE VAI PAGAR R$: " + taxa);
		}

		in.close();
	}

}
