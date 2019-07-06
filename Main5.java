/*
Otwórz plik `Main5.java`. 
Spróbuj – bez uruchamiania – odpowiedzieć na pytanie jaki będzie wynik programu zawartego w pliku.

Zweryfikuj własne przypuszczenia poprzez uruchomienie programu.

Opisz w komentarzu wyjaśnienie działania programu.
*/

public class Main5 {

	public static void main(String[] args) {
		int a = 1;
		int b;
		System.out.println(++a);		// Zwiększa a do 2 i drukuje 2.
		System.out.println(a++);		// Drukuje 2 i zwiększa a do 3.
		System.out.println(a);			// Drukuje a = 3.
		b=a++;					// Przypisuje b = 3 i zwiększa a do 4.
		System.out.println(b);			// Drukuje b = 3.
		b=++a;					// Zwiększa a do 5 i przypisuje b = 5.
		System.out.println(++a);		// Zwiększa a do 6 i drukuje 6.
	}

}

/*
Wynik działania to drukowane liczby:
2
2
3
3
6
*/
