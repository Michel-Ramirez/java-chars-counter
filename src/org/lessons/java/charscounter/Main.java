package org.lessons.java.charscounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// DICHIARO LA MAPPA
		Map<Character, Integer> charts = new HashMap<>();

		System.out.print("Digita una parola: ");
		String word = in.nextLine().toLowerCase();

		System.out.println();

		// CREO UN CICLO CHE GIRA SULLA PAROLA "word"
		for (char c : word.toCharArray()) {

			// SE IL CARATTERE E' GIA' PRESENTE INCREMENTO LA SUA FREQUENZA
			if (charts.containsKey(c)) {

				charts.put(c, charts.get(c) + 1);

				// ALTRIMENTI AGGIUNGO IL CARATTERE ALLA MAPPA E SETTA LA SUA FREQUENZA AD 1
			} else {

				charts.put(c, 1);
			}
		}

		System.out.println(charts);

		System.out.println();

		// GIRO SU TUTTE LE CHIAVI PRESENTE NELLA MAPPA
		for (char key : charts.keySet()) {

			// ASSEGNO AD OGNI CHIAVE UN VALORE OTTENENDO KEY->VALUE
			int value = charts.get(key);
			System.out.println(key + "->" + value);
		}
	}

}
