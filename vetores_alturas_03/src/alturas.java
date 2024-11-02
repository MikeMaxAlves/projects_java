import java.util.Locale;
import java.util.Scanner;

public class alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[]  idade= new int[n];
		double[]  altura= new double[n];
		
		
		for(int i=0; i < n; i++) {
			System.out.println("Dados da "+ (i+1) +"a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += altura[i];
		}
		// Calculando a altura média.
		double media = soma / altura.length;
		System.out.println();
		System.out.printf("Altura média: %.2f%n",media);

		// Contando pessoas com menos de 16 anos.
		int contagem = 0;
		for(int i=0; i<n; i++) {
			if(idade[i] < 16) {
				contagem += 1;
			}
		}
		// Calculando o percentual.
		double percent = (contagem * 100.0) / n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
		
		// Exibindo os nomes das pessoas com menos de 16 anos
		for(int i=0; i<n; i++) {
			if(idade[i] < 16) {
				System.out.printf("%s\n", nome[i]);
			}
		}
		sc.close();
	}

}
