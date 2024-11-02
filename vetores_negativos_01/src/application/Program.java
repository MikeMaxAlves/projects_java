package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int num = sc.nextInt();
		int[] vect = new int[num];
		
		for( int i=0; i < vect.length; i++ ) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		System.out.print("numeros negativos: ");

		for(int i=0; i<vect.length; i++) {
			if(vect[i] < 0) {
				System.out.print(vect[i] +", " );
			}
		}
		
		sc.close();
	}

}
