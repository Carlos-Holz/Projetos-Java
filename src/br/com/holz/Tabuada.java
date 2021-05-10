/*
 * Crie uma nova classe chamada Tabuada e desenvolva um algoritmo que
 * receba uma entrada de dados, Scanner(), pedindo que o usuário
 * informe um número inteiro, em seguida apresente a tabuada do valor 
 * informado pelo usuário;
 */ 

package br.com.holz;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
	System.out.println("---- Calculando a Tabuada ----");
	Scanner tec = new Scanner (System.in);
	System.out.print("Informe o valor que deseja calcular a tabuada: ");
	int valor1 = tec.nextInt();
	int num1 = 0; 
	
	while (num1 <= 10) {
		System.out.println(valor1 + " X " + num1 + " = " + num1 * valor1);
		num1 ++;
		}
	System.out.println("Sistema Encerrado!");
	}
}