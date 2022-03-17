package br.com.sip.logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Informar quantidade de numeros
 * Ordenar 
 * • Primeiro os Pares Crescente
 * • Depois os Ímpares Decrescente
 * 
 * @author Marcos
 *
 */

public class Desafio1 {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			List<Integer> numeros = new ArrayList<Integer>();
			List<Integer> par = new ArrayList<Integer>();
			List<Integer> impar = new ArrayList<Integer>();

			int nlinhas = scanner.nextInt(); // quantidade de linhas

			/* percorrer quantidade de linhas informados */
			for (int j = 0; j < nlinhas; j++) {
				numeros.add(scanner.nextInt());
			}

			/* separar em lista de pares e impares */
			for (Integer num : numeros) {
				if (num % 2 == 0)
					par.add(num);
				else
					impar.add(num);
			}

			/* Ordenar em coleções */
			Collections.sort(par);
			Collections.sort(impar, Collections.reverseOrder());

			for (Integer p : par) {
				System.out.println(p);
			}

			for (Integer i : impar) {
				System.out.println(i);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}