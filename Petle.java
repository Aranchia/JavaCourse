package JavaBasic.src.Training;

import java.util.Scanner;

/*Zadanie 1 — while
Odliczanie łatwe
Używając pętli while wyświetl liczby od 10 do 1, a na końcu "Start!"

        10 9 8 7 6 5 4 3 2 1 Start!*/

/*public class Petle {
    public static void main(String[] args) {
        int i = 10;
        while (i >=1) {
            System.out.println(i);
            i--;
        }
        System.out.println("START!");

    }
} */

//
/*
Zadanie 2 — while
Suma liczb parzystych średnie
Używając pętli while zsumuj wszystkie liczby parzyste od 1 do 20 i wyświetl wynik.
 */

/*public class Petle {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Suma liczb parzystych: " + sum);
    }
}
*/

/*
Zadanie 3 — do while
Walidacja danych średnie
Używając do while i Scanner — proś użytkownika o wpisanie liczby od 1 do 10. Powtarzaj pytanie dopóki nie wpisze poprawnej liczby.
 */

/*public class Petle {
    public static  void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.print("Wpisz liczbę (1-10): ");
            number = sc.nextInt();

            if (number < 1 || number > 10) {
                System.out.println("Zła liczba! Wpisz ponownie.");
            }

        }while  (number < 1 || number > 10);

        System.out.println("Poprawnie! Wpisałeś: " + number);
    }
}*/

/*
Zadanie 4 — for
Tabliczka mnożenia przez 7 łatwe
Używając pętli for wyświetl tabliczkę mnożenia przez 7 (od 1 do 10).

7 x 1 = 7 ... 7 x 10 = 70
 */

/*public class Petle {
    public static void main(String[] args) {

        for (int i = 1; i<=10; i++){
            System.out.println(" 7 x " + i + " =" + (7 * i));
        }

    }
}*/

/*
Zadanie 5 — for
Silnia średnie
Używając pętli for oblicz silnię liczby 6 (6! = 1×2×3×4×5×6). Wyświetl wynik.

6! = 720
 */

public class Petle {
    public static void main(String[] args) {
        int result = 1;

        for (int i = 1; i <= 6; i++) {
            result *= i;
        }
        System.out.println("6! = " + result);
    }
}