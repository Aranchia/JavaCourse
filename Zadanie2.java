package JavaBasic.src;

/* Zadanie 2
Stałe i operatory — obliczanie podatku łatwe
Zadeklaruj stałą VAT_RATE = 0.23 (23%). Zadeklaruj zmienną netPrice = 250.00. Oblicz kwotę podatku i cenę brutto. Wyświetl wszystkie trzy wartości. */

public class Zadanie2 {
    public static void main(String[] args) {
    final double VAT_RATE = 0.23;
    double netPrice = 250.00;
    double grossPrice = VAT_RATE * netPrice + netPrice;

        System.out.println("Cena netto:"  + netPrice + "PLN");
        System.out.println("Podatek VAT:" + VAT_RATE * netPrice + "PLN");
        System.out.println("Cena brutto:" + grossPrice + "PLN");


    }
}
