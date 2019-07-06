/*
W pliku `Main6.java` stwórz trzy zmienne o nazwach: `nr1, nr2, result`.

1. Dwie pierwsze niech przechowują dowolne liczby.
2. Za pomocą odpowiedniego operatora, sprawdź, czy pierwsza liczba jest większa od drugiej i zapisz wynik w zmiennej ```result```.
3. Wypisz zmienną ```result``` w konsoli.
*/

public class Main6 {

	public static void main(String[] args) {
		double nr1, nr2;
		boolean result;
		nr1 = 244.4353;
		nr2 = 43.56645;
		result = (nr1 > nr2);
		if (result) {
			System.out.println("Liczba " + nr1 + " jest większa od " + nr2 + ".");
		} else {
			System.out.println("Liczba " + nr1 + " jest mniejsza od " + nr2 + ".");
		}
		// System.out.println(result);
	}

}
