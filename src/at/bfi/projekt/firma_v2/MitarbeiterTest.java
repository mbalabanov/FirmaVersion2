package at.bfi.projekt.firma_v2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MitarbeiterTest {

	@Test
	void testMitarbeiterSucheNachID() {

		// Leeres Array fuer die Mitarbeiterliste
		Mitarbeiter[] mitarbeiter_liste = new Mitarbeiter[3];

		// Erstellung der Arbeiterobjekte
		Arbeiter arbeiter_0 = new Arbeiter(1, "Eckehard", 29.1, 109, 97.0, 94.4);
		Arbeiter arbeiter_1 = new Arbeiter(2, "Anselma", 31.7, 97, 98.0, 101.3);
		Arbeiter arbeiter_2 = new Arbeiter(3, "Fredericka", 17.2, 83, 99.0, 44.9);

		// Zuweisung der Objekte zum Array mit der Liste der Mitarbeiter
		mitarbeiter_liste[0] = arbeiter_0;
		mitarbeiter_liste[1] = arbeiter_1;
		mitarbeiter_liste[2] = arbeiter_2;

		// Suche nach Mitarbeiter anhand der ID
		Mitarbeiter gefundenerMitarbeiter = Mitarbeiter.suche(mitarbeiter_liste, 2);

		assertEquals(arbeiter_1.getName(), gefundenerMitarbeiter.getName());
	}

	@Test
	void testLeereMitarbeiterSucheNachID() {

		// Leeres Array fuer die Mitarbeiterliste
		Mitarbeiter[] mitarbeiter_liste = new Mitarbeiter[3];

		// Erstellung der Arbeiterobjekte
		Arbeiter arbeiter_0 = new Arbeiter(1, "Sibylle", 28.1, 101, 97.0, 74.4);
		Arbeiter arbeiter_1 = new Arbeiter(2, "Edsel", 30.7, 87, 98.0, 121.3);
		Arbeiter arbeiter_2 = new Arbeiter(3, "Roswitha", 16.2, 73, 99.0, 34.9);

		// Zuweisung der Objekte zum Array mit der Liste der Mitarbeiter
		mitarbeiter_liste[0] = arbeiter_0;
		mitarbeiter_liste[1] = arbeiter_1;
		mitarbeiter_liste[2] = arbeiter_2;

		// Suche nach nicht-vorhandenem Mitarbeiter anhand nicht-vorhandener ID
		Mitarbeiter gefundenerMitarbeiter = Mitarbeiter.suche(mitarbeiter_liste, 4);

		assertEquals(null, gefundenerMitarbeiter);
	}

	@Test
	void testAnzahlMitarbeiter() {

		// Leeres Array fuer die Mitarbeiterliste
		Mitarbeiter[] mitarbeiter_liste = new Mitarbeiter[7];

		// Erstellung der Arbeiterobjekte
		Arbeiter arbeiter_0 = new Arbeiter(1, "Klemens", 29.1, 109, 97.0, 94.4);
		Arbeiter arbeiter_1 = new Arbeiter(2, "Karoline", 31.7, 97, 98.0, 101.3);
		Arbeiter arbeiter_2 = new Arbeiter(3, "Lutz", 17.2, 83, 99.0, 44.9);

		// Erstellung der Angestelltenobjekte
		Angestellter angestellter_3 = new Angestellter(4, "Warinot", 2400.00, 1211.30, 97.0);
		Angestellter angestellter_4 = new Angestellter(5, "Kuno", 2800.00, 1309.80, 98.0);
		Angestellter angestellter_5 = new Angestellter(6, "Audo", 1812.23, 992.20, 99.0);
		Angestellter angestellter_6 = new Angestellter(7, "Aldric", 1903.67, 1489.10, 100.0);

		// Zuweisung der Objekte zum Array mit der Liste der Mitarbeiter
		mitarbeiter_liste[0] = arbeiter_0;
		mitarbeiter_liste[1] = arbeiter_1;
		mitarbeiter_liste[2] = arbeiter_2;

		mitarbeiter_liste[3] = angestellter_3;
		mitarbeiter_liste[4] = angestellter_4;
		mitarbeiter_liste[5] = angestellter_5;
		mitarbeiter_liste[6] = angestellter_6;

		int anzahlAngestellte = Mitarbeiter.getAnzAngestellterGesamt(mitarbeiter_liste);

		assertEquals(4, anzahlAngestellte);

	}
}
