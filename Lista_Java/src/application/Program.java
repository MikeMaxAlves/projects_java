package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Carlos");
		list.add("Joao");
		list.add("Pedro");
		list.add("Jorge");
		list.add("Augusto");
		list.add("Thiago");
		list.add("Bob");
		list.remove(2);
		for (String x : list) {
			System.out.println(x);
		}
		list.removeIf(x -> x.charAt(0) == 'M');
		System.out.println("##############################");
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("##############################");
		System.out.println("Index of bob: "+ list.indexOf("Bob"));//Quando nao encontra o elemento, Retorna -1.
		System.out.println("Index of bob: "+ list.indexOf("Marcio"));//Quando nao encontra o elemento, Retorna -1.
		System.out.println("##############################");
		List<String> Result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : Result) {
			System.out.println(x);
		}
		System.out.println("##############################");
		String name = list.stream().filter(x -> x.charAt(0) == 'X').findFirst().orElse(null);
		System.out.println(name);
		
		sc.close();
	}

}
