package JavaBasic.src;

/* Scanner + operatory — kalkulator BMI średnie
Napisz program który pyta o wagę (kg) i wzrost (m). Oblicz BMI = waga / (wzrost * wzrost). Wyświetl wynik. Sprawdź czy BMI jest mniejsze niż 25 (norma) i wyświetl komunikat.*/

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoją wagę: ");
        double weight = scanner.nextDouble();

        System.out.print("Podaj swój wzrost w metrach: ");
        double heigh = scanner.nextDouble();

        System.out.println("Twoje BMI: " + weight / (heigh * heigh));

       // nie wiem jak to zrobić



    }
}
