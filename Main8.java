/*
W pliku `Main8.java` wykonaj następujące zadania:

1. Zdefiniuj zmienną `black` – o wartości `16`, oraz zmienną `white` – o wartości `15`.
2. Zdefiniuj zmienną `blackOrWhite`, która będzie przechowywać **wartość logiczną** porównania czy `black` **<** `white`.
3. Zdefiniuj zmienną `good` – o wartości logicznej **prawda**, oraz zmienną `bad` – o wartości logicznej **fałsz**.
4. Zdefiniuj zmienną `goodOrBad`, która będzie przechowywać **wartość logiczną** porównania `good` **LUB (or)** `bad`.
5. Zdefiniuj zmienną `comparison`, która będzie przechowywać **wartość logiczną** porównania `blackOrWhite` **I (and)** `goodOrBad`.
6. Wyświetl w konsoli – w nowych liniach – kolejno zmienne: `blackOrWhite` , `goodOrBad` i `comparison`.
7. Przeanalizuj otrzymany wynik.
*/

public class Main8 {

	public static void main(String[] args) {
		short black = 16, white = 15;
		boolean blackOrWhite;
		blackOrWhite = black < white;			// false bo tak
		boolean good = true, bad = false;
		boolean goodOrBad;
		goodOrBad = good || bad;			// true bo jeden true
		boolean comparison;
		comparison = blackOrWhite && goodOrBad;		// false bo jeden false
		System.out.println(blackOrWhite);
		System.out.println(goodOrBad);
		System.out.println(comparison);
	}

}
