import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for(int i=0;i<nome.length; i++) {
			System.out.println("Dados da "+(i +1) +"a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
		}
		int maisVelha = 0;
		for(int i=1;i<nome.length; i++) {
			if(idade[i] > idade[maisVelha]) {
				maisVelha = i;
			}
			
		}
		// Imprime a pessoa mais velha
		System.out.print("PESSOA MAIS VELHA: "+nome[maisVelha]);
		
		sc.close();
	}

}
