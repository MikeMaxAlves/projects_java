package application;

import java.util.Locale;
import java.util.Scanner;

public class negativosMatriz {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vet = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		System.out.println();
		System.out.print("VALORES = ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%.2f  ", vet[i]);
		}

		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + vet[i];
		}
		double media = sum / n;
		System.out.println();
		System.out.println("SOMA = " + sum);
		System.out.println("MEDIA = " + media);

		sc.close();
	}

}
