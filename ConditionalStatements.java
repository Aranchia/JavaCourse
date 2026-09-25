package JavaBasic.src.Training;

/*Zadanie 1 — użyj if
Zadeklaruj zmienną temperature = 38.5. Sprawdź czy temperatura jest wyższa niż 37.0 i wyświetl "Masz gorączkę!".

Dlaczego if? — sprawdzamy jeden warunek, nie potrzebujemy else.*/

/*public class ConditionalStatements {
    public static void main(String[] args) {
        double temperature = 38.5;

        if (temperature >= 37.5){
            System.out.print("Masz gorączkę" );
        }
    }
}*/
//

/* Zadanie 2 — użyj if / else
Zadeklaruj balance = 200.0 i withdrawal = 500.0. Sprawdź czy możesz wypłacić pieniądze z bankomatu. Wyświetl albo "Wypłacam [kwota] zł" albo "Brak środków!".

Dlaczego if/else? — są dwie ścieżki: albo wypłacamy, albo nie.*/

/*public class ConditionalStatements {
    public static void main(String[] args) {
        double balance = 2000.0;
        double withdrawal = 500.00;

        if (balance >= 500.00) {
            System.out.println("Wypłacam" + " " + withdrawal);
        } else {
            System.out.println("Brak środków!");
        }
    }
}*/

/*Zadanie 3 — użyj if / else if / else
Zadeklaruj score = 82. Wyświetl ocenę według skali:

90 i więcej → "Ocena: 5"
75 i więcej → "Ocena: 4"
60 i więcej → "Ocena: 3"
poniżej 60 → "Ocena: 2"

Dlaczego if/else if/else? — mamy wiele możliwych wyników do sprawdzenia po kolei.*/

/*public class ConditionalStatements {
    public static void main(String[] args) {
        double score = 100;

        if(score >= 90){
            System.out.println("Ocena 5");
        } else if(score >= 75){
            System.out.println("Ocena 4");
        } else if(score >= 60){
            System.out.println("Ocena 3");
        } else
            System.out.println("Ocena 2");
    }
}*/

/*Zadanie 4 — użyj operatora trójargumentowego
Zadeklaruj isRaining = true. Przypisz do zmiennej String advice wartość "Weź parasol!" lub "Nie bierz parasola!" używając operatora ? :. Wyświetl wynik.

Dlaczego ternary? — prosty wybór między dwiema wartościami, jedna linia.*/

public class ConditionalStatements {
    public static void main(String[] args) {
        boolean isRaining = true;
        String advice = (isRaining == true) ? "Weź parasol!" : "Nie bierz parasola";
        System.out.println(advice);
    }
}