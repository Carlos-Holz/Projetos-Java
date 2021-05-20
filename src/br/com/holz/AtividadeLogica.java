package br.com.holz;

import java.util.Scanner;

public class AtividadeLogica {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner (System.in);
		String continuar = "s";
		int opcaoDoMenu;
		
		do {	
			System.out.println("|-----------Menu-----------|");
			System.out.println("|1 - Verificar Sexo e Idade|");
			System.out.println("|2 - Contagem de Valores   |");
			System.out.println("|3 - Tabuada               |");
			System.out.println("|4 - Cadastrar Cursos      |");
			System.out.println("|--------------------------|");
			System.out.println("\n");
			System.out.print("Informe a op��o desejada: ");
			opcaoDoMenu = tec.nextInt();
			
			System.out.println("\n");
			
			switch(opcaoDoMenu) {
			case 1:
				System.out.println("---- Verificar Sexo e Idade ----");
				String nome;
				int anoDeNascimento;
				String sexo;
				int idade;
				
				System.out.print("Informe seu nome: ");
				nome = tec.next();
				System.out.print("Informe seu ano de nascimento: ");
				anoDeNascimento = tec.nextInt();
				idade = 2021 - anoDeNascimento;
				System.out.print("Informe seu sexo [M/F]: ");
				sexo = tec.next();
				System.out.println("\n");
				while(!sexo.equals("m") && !sexo.equals("f")) {
					System.out.print("Sexo Inv�lido!!! Informe novamente o sexo [M/F]: ");
					sexo = tec.next();
				}
				
				System.out.println("\n");
				
				if(idade < 12) {
					System.out.println(nome+ ", voc� ainda � uma crian�a, tem " +idade+ " anos de idade");
				}
				else if (idade >= 12 && idade < 18) {
					System.out.println(nome+ ", voc� � jovem, tem " +idade+ " anos de idade");
				}
				else if (idade >= 18 && idade < 65) {
					System.out.println(nome+ ", voc� j� � adulto, tem " +idade+ " anos de idade");
				}
				else {
					System.out.println(nome+ ", voc� j� � um idoso, tem " +idade+ " anos de idade");
				}
				
				if(sexo.equalsIgnoreCase("m")) {
					System.out.println("� do sexo masculino");
				}
				else if (sexo.equalsIgnoreCase("f")) {
					System.out.println("� do sexo feminino");
				}

				if(idade < 16) {
					System.out.println("Voc� ainda n�o pode votar");
				}
				else if(idade >= 16 && idade < 18 || idade > 70) {
					System.out.println("Voc� pode votar, mas n�o � obrigat�rio");
				}
				else {
					System.out.println("Seu voto � obrigat�rio!!");
				}
				
				if(idade < 18) {
					System.out.println("E voc� ainda n�o pode tirar habilita��o");
				}
				else {
					System.out.println("E voc� j� pode tirar habilita��o");
				}
				break;
				
			case 2:
				System.out.println("---- Contagem de Valores ----");
				int primeiroValor;
				int segundoValor;
				
				System.out.print("Informe o primeiro valor: ");
				primeiroValor = tec.nextInt();
				System.out.print("Informe o segundo valor: ");
				segundoValor = tec.nextInt();
				
				System.out.println("\n");
				
				if(primeiroValor == segundoValor) {
					System.out.println("Valor igual ao primeiro, imposs�vel imprimir a sequ�ncia");
				}
			    if(primeiroValor > segundoValor) {
		    	System.out.println("\n");
			      while(segundoValor <= primeiroValor) {
			    	  System.out.println(segundoValor);
			          	segundoValor += 1;}
			     }
			    
			    else if(segundoValor > primeiroValor) {
		    	System.out.println("\n");
			    	while(primeiroValor <= segundoValor) {
			    		System.out.println(primeiroValor);
			                primeiroValor += 1;
			            }
			      }
				break;
				
			case 3:
				System.out.println("---- Tabuada ----");
				System.out.print("Informe o valor que deseja calcular a tabuada: ");
				int valor = tec.nextInt();
				int multiplicador = 0; 
				System.out.println("\n");
				while (multiplicador <= 10) {
					System.out.println(valor+ " X " + multiplicador + " = " + multiplicador * valor);
					multiplicador ++;
					}
				break;
				
			case 4:
				System.out.println("---- Cadastrar Cursos ----");
				String[] cursos = new String[5];
				String inserirCursos = "s";
				int aux = 0;
				
				while(inserirCursos.equalsIgnoreCase("s") && aux < cursos.length) {
					System.out.print("Informe o Curso que Deseja Cadastrar: ");
					cursos[aux] = tec.next();
					aux++;
					System.out.println("\n");
					System.out.print("Deseja Cadastrar um novo Curso? [S/N] -> ");
					inserirCursos = tec.next();
					System.out.println("\n");
				}
				
				for (int i = 0; i < cursos.length; i ++) {
					System.out.println(cursos [i]);	
		}
				break;
				
				default:
					System.out.println("Op��o Inv�lida.");
				break;
			}
		System.out.println("\n");
		System.out.print("Deseja realizar uma nova opera��o? [S/N] -> ");
		continuar = tec.next();
		System.out.println("\n");
		} while(continuar.equalsIgnoreCase("s"));
		
		System.out.println("Sistema Encerrado!!!");
	}
}