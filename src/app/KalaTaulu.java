package app;

import java.util.Scanner;

import data.Kala;

public class KalaTaulu {

	public static void main(String[] args) {

		Kala[] taulu = new Kala[3];

		for (int i = 0; i < taulu.length; i++) {
			taulu[i] = new Kala();
			lueKalanTiedot(taulu[i]);
		}

		tulostaKalat(taulu);

	}

	private static void lueKalanTiedot(Kala k) {
		Scanner sc = new Scanner(System.in);
		String s = "";
		boolean ok = false;

		do {
			System.out.print("ID: ");
			s = sc.nextLine();
			ok = k.setId(s);
		} while (!ok);

		System.out.print("Laji: ");
		s = sc.nextLine();
		k.setLaji(s);

		do {
			System.out.print("Paino: ");
			s = sc.nextLine();
			ok = k.setPaino(s);
		} while (!ok);

	}

	private static void tulostaKalat(Kala[] taulu) {

		for (int i = 0; i < taulu.length; i++) {
			System.out.println(taulu[i]);
		}
	}

}
