package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		for(int i=1; i<n; i++) {
			System.out.println("Rent #"+ i +":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.next();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			vect[roomNumber] = new Rent(nome, email);
		}
		
		for(int i=0; i < 10; i++) {
			System.out.println(vect[i]);
		}
		
		sc.close();
	}
}
