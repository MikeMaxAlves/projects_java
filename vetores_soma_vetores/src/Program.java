import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		System.out.println("Digite os valores do vetor A? ");
		int[] A = new int[n];
		int[] B = new int[n];
		
		for(int i=0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println("Digite os valores do vetor B? ");
		for(int i=0; i < n; i++) {
			B[i] = sc.nextInt();
		}
		System.out.println("VETOR RESULTANTE:");
		int sum = 0;
		for(int i=0; i < n; i++) {
			sum = A[i] + B[i];
			System.out.println(sum);
		}
		
		sc.close();

	}

}
