import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double[] altura = new double[n];
		char[] genero = new char[n];

		for (int i = 0; i < altura.length; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da " +(i +1) +"a pessoa: ");
			genero[i] = sc.next().charAt(0);

		}

		double menorAltura = altura[0];
		for (int i = 1; i < altura.length; i++) {
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}

		double maiorAltura = altura[0];
		for (int i = 1; i < altura.length; i++) {
			if (altura[i]  > maiorAltura) {
				maiorAltura = altura[i];
			}
		}
		double sum = 0;
		int numHomen = 0;
		int numMulher = 0;
		for (int i = 0; i < altura.length; i++) {
			if(genero[i]=='F' || genero[i]=='f') {
				sum += altura[i];
				numMulher ++;
			}
			else {
				if(genero[i]=='M' || genero[i]=='m') {
					numHomen ++;
				}
			}
		}
		double mediaAltura = (numMulher > 0) ? sum / numMulher : 0.0;
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		if (numMulher > 0) {
            System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAltura);
        } else {
            System.out.println("Nao ha mulheres no grupo.");
        }
		System.out.printf("Numero de homens = %d", numHomen);
		sc.close();
	}

}
