package app;

import java.util.ArrayList;
import java.util.Scanner;

import data.Kala;

public class KalatArrayList {

	public static void main(String[] args) {

		ArrayList<Kala> lista = new ArrayList<>();

		char lisaaUusi = 'e';
		do {
			Kala k = new Kala();
			kysyKalanTiedot(k);
			lista.add(k);

			lisaaUusi = lisataankoUusiKala();// Kysyt‰‰n k‰ytt‰j‰lt‰, haluaako lis‰t‰ uuden kalan
		} while (lisaaUusi == 'k');

		for (int i = 0; i < lista.size(); i++) {
			tulostaKalat(lista.get(i));
		}

	}

	private static void tulostaKalat(Kala k) {
		System.out.println(k);

	}

	private static void kysyKalanTiedot(Kala k) {
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

	private static char lisataankoUusiKala() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lis‰t‰‰nkˆ uusi kala? (k/e) ");
		String s = sc.nextLine();
		try {
			return s.charAt(0); // Jos k‰ytt‰j‰ antaa tyhj‰n, aiheuttaa s.charAt(0) poikkeuksen
		} catch (IndexOutOfBoundsException e) {
			return 'e';
		}
	}

}
