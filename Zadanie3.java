package JavaBasic.src;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {


/* Zadanie 3
Skrócone operatory — konto bankowe łatwe
Zadeklaruj balance = 2000.0. Używając skróconych operatorów: dodaj wypłatę 3500, odejmij czynsz 1200, odejmij prąd 150, odejmij internet 60. Wyświetl stan po każdej operacji. */

        double  balance = 2000.00;
        balance += 3500;
        System.out.println("Stan konta RAZEM:" + balance + "zł");

        balance -= 1200;
        System.out.println("Stan konta po opłaceniu czynszu:" + balance + "zł");

        balance -= 150;
        System.out.println("Stan konta po opłaceniu prądu:" + balance + "zł");

        balance -= 60;
        System.out.println("Stan konta po opłaceniu internetu:" + balance + "zł");

        System.out.println("Stan konta - wynik końcowy:" + balance + "zł");



    }
}
