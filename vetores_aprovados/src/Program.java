import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		double[] A = new double[n];
		double[] B = new double[n];
		
		for(int i=0;i<nome.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " +(i +1) +"o aluno");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			A[i] = sc.nextDouble();
			B[i] = sc.nextDouble();
			
		}

		System.out.println("Alunos aprovados:");
		for(int i=0;i<nome.length; i++) {
			double media = A[i] + B[i] / 2.0;
			if(media >= 6) {
				System.out.println(nome[i]);
			}
		
		}
		sc.close();
	}

}
