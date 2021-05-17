package br.com.holz;

import java.util.Scanner;

public class VetorDeDados {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner (System.in);
		int idade [] = {5, 18, 16, 21, 20, 4, 28, 32};
		int aux;
		
		for (int i = 0; i < idade.length; i ++) {
			System.out.println(idade [i]);	
}
		
		String addNovo = "s";
		do {
			System.out.print("Informe o index do vetor: ");
			for (int i = 0; i < idade.length; i++) {
			System.out.print(i + " | ");
		}
			System.out.print("-> ");
			int index = tec.nextInt();
			
			System.out.println("----------------------------------------------------------------------");
			System.out.print("Informe a idade: ");
			idade[index] = tec.nextInt(); 
			
			System.out.print("Deseja informa uma nova idade? [s/n] -> ");
			addNovo = tec.next();
			System.out.println("----------------------------------------------------------------------");
			
			
		} while(addNovo.equalsIgnoreCase("s"));
		System.out.println("----- Vetor Ordenado -----");
		for (int i = 0; i < idade.length; i++){
				for(int c = i + 1; c < idade.length; c++){
					if(idade[i] > idade[c]){
						aux = idade[i];
						idade[i] = idade[c];
						idade[c] = aux;
				}
			}
			System.out.println("- > " + idade [i]);
		}
	}
}