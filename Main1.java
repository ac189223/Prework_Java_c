
/*
W pliku `Main1.java` stwórz dwie zmienne o nazwach: `first`, `second`.

1. Przypisz do nich dwie **różne** wartości logiczne jakie znasz. 
2. Porównaj je za pomocą operatora ```==```, a wynik porównania zapisz do trzeciej zmiennej – `isFirstEqualSecond`.
3. Wyświetl w konsoli zmienną `isFirstEqualSecond`, aby sprawdzić wynik.
4. Zmodyfikuj wartość zmiennej `second` na przeciwną i ponownie sprawdź wynik.
*/

public class Main1 {

	public static void main(String[] args) {
		boolean first, second;
		first = false;
		second = true;
		boolean isFirstEqualSecond = first == second;
		if (isFirstEqualSecond == true) {
			System.out.println("Zmienne logiczne mają tą samą wartość " + first + ".");
		} else {
			System.out.println("Zmienne logiczne mają różne wartości.");
		}	
		second = !second;
		isFirstEqualSecond = first == second;
		System.out.print("Po zmianie wartości jednej ze zmiennych z");
		if (isFirstEqualSecond == true) {
			System.out.println("mienne logiczne mają tą samą wartość " + first + ".");
		} else {
			System.out.println("mienne logiczne mają różne wartości.");
		}	
	}

}
