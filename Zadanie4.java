package JavaBasic.src;

/* Zadanie 4
Inkrementacja — licznik odwiedzin łatwe
Zadeklaruj visitorCount = 0. Zasymuluj 5 odwiedzin używając inkrementacji (każda odwiedzina to osobna linia). Potem zasymuluj że 2 osoby wyszły (dekrementacja). Wyświetl końcowy wynik. */

public class Zadanie4 {
    public static void main(String[] args) {
        int visitorCount = 0;
        visitorCount ++;
        //System.out.println(visitorCount);

        visitorCount ++;
        //System.out.println(visitorCount);

        visitorCount ++;
        //System.out.println(visitorCount);

        visitorCount ++;
        //System.out.println(visitorCount);

        visitorCount ++;
        //System.out.println(visitorCount);

        visitorCount --;
        //System.out.println(visitorCount);

        visitorCount --;
        //System.out.println(visitorCount);

        System.out.println("TOTAL:" + " " + visitorCount + " " + "osoby");

    }
}
