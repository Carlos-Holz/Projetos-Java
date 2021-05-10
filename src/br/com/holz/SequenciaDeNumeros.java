/*  Crie uma nova classe que solicite ao usu�rio que informe dois valores
 * e em seguida imprima na tela a sequ�ncia do primeiro valor at� o segundo 
 * valor. Caso o primeiro valor seja maior que o segundo,
 * apresentar o incremento da sequ�ncia at� o segundo valor. Caso o primeiro
 * valor seja menor que o segundo, apresentar o decremento da sequ�ncia at� o segundo valor
 * Em seguida apresente quantos n�meros pares possui na sequ�ncia e quantos n�meros �mpares possuem na sequ�ncia. 
 */

package br.com.holz;

import java.util.Scanner;

public class SequenciaDeNumeros {
	public static void main(String[] args) {
		System.out.println("---- Incrementos ----");
		Scanner tec = new Scanner (System.in);
		System.out.print("Informe o 1� valor: ");
		int numero1 = tec.nextInt();
		System.out.print("Informe o 2� valor: ");
		int numero2 = tec.nextInt();
		int par = 0;
		int impar = 0;
		if(numero1 < numero2) {
			while(numero1 <= numero2) {
				if (numero1 % 2 == 0) {
					par ++;	
				}
				else {
					impar ++;
				}
				System.out.println(numero1);
				numero1 = numero1 + 1;
			}
		}
		else if(numero1 > numero2) {
			while(numero1 >= numero2) {
				if(numero1 % 2 == 0) {
					par ++;
				}
				else {
					impar ++;
				}
			System.out.println(numero1);
			numero1 = numero1 - 1;
			}
		}
		System.out.println("Pares: " + par);
		System.out.println("�mpares: " + impar);
	}
}