package br.com.holz;

import java.util.Scanner;

public class MenuRepete {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner (System.in);
		String opcao = "s"; // Water class
		//int idade = 17; Primitivo
		int opcaoDoMenu;
		
		do {
			
			System.out.println("---- Menu ----");
			System.out.println("1 - Tabuada com Do While");
			System.out.println("2 - Tabuada com For");
			System.out.println("3 - Editar");
			System.out.println("4 - Excluir");
			System.out.println("9 - Sair");
			System.out.println("----------------");
			System.out.print("Informe a opção desejada: ");
			opcaoDoMenu = tec.nextInt();
			
			switch(opcaoDoMenu) {
			case 1:
				System.out.println("---- Tabuada com Do While ----");
				int valor;
				int multiplicador = 0;
				
				System.out.print("Informe o valor que deseja calcular a tabuada: ");
				valor = tec.nextInt();
				
				do {
					System.out.println(valor + " X " + multiplicador + " = " + (multiplicador * valor));
					multiplicador ++;
				} while(multiplicador <= 10);
				
				break;
				
			case 2:
				System.out.println("---- Tabuada com For ----");
				int valor1;
				System.out.print("Informe o valor que deseja calcular a tabuada: ");
				valor1 = tec.nextInt();
				
				for(int i = 0; i <= 10; i ++) {
					System.out.println(valor1 + " X " + i + " = " + (i * valor1));
				}
				
				break;
				
			case 3:
				System.out.println("---- Editar ----");
				break;
			case 4:
				System.out.println("---- Excluir ----");
				break;
			case 9:
				opcao = "n";
				break;
				
				default:
					System.out.println("Opção Inválida.");
					break;
			}
			
		} while(opcao.equalsIgnoreCase("s"));
		
		System.out.println("Sistema Encerrado!!!");
	}
}

// Quando se é uma Water Class, não utilizamos o == para comparação.
// Utilizamos <variavel.equals("s");>