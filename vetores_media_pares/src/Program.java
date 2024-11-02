import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vet = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}

		double sum = 0;
		double npares = 0;
		for (int i = 0; i < n; i++) {
			if(vet[i] % 2 == 0) {
				npares += 1;
				sum += vet[i];
			}
		}
		if(npares == 0) {
			System.out.print("NENHUM NUMERO PAR");
			
		}else {
			double media = sum / npares;
			System.out.printf("MEDIA DOS PARES = %.1f", media);
		}
		
		sc.close();

	}

}
