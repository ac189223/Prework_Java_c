/*
W pliku `Main4.java` stwórz zmienną o nazwie ```counter```, wstaw do niej liczbę `145`.

1. Wypisz wartość zmiennej ```counter``` w konsoli.
2. Za pomocą inkrementacji zwiększ wartość zmiennej ```counter```.
3. Wypisz wartość zmiennej ```counter``` w konsoli.
4. Za pomocą dekrementacji zmniejsz wartość zmiennej ```counter```.
5. Wypisz wartość zmiennej ```counter``` w konsoli.
*/

public class Main4 {

	public static void main(String[] args) {
		short counter =145;
		System.out.println("Wartość początkowa to " + counter++);
		System.out.println("Wartość po zwiększeniu to " + counter--);
		System.out.println("Wartość po ostatecznym zmniejszeniu to " + counter);
	}

}
