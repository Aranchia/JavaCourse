package JavaBasic.src;

/* Zadanie 5
Operatory porównania — sprawdzanie temperatury łatwe
Zadeklaruj temperature = 38.5. Sprawdź czy temperatura jest wyższa niż 37.0 (gorączka) i wyświetl odpowiedni komunikat. Sprawdź też czy temperatura jest różna od 36.6 (norma).*/

public class Zadanie5 {
    public static void main(String[] args) {
        double temperature1;
        temperature1 = 38.5;

        double temperature2;
        temperature2 = 37.0;

        double temperature3;
        temperature3 = 36.6;

        if (temperature1 > temperature2) {
            System.out.println("Masz gorączkę!");
        }

        if (temperature1 != temperature3) {
            System.out.println("Temperatura różna od normy.");
        }


    }
}
