package JavaBasic.src;

/* Operatory logiczne — warunki wejścia łatwe
Zadeklaruj: age = 20, hasTicket = true, isVIP = false. Wyświetl "Wejdź!" jeśli ma bilet I jest pełnoletni. Wyświetl "VIP lub bilet!" jeśli jest VIP LUB ma bilet. Wyświetl "Nie jest VIP" jeśli NIE jest VIP. */

public class Zadanie6 {
    public static void main(String[] args) {
        int age;
        age = 20;

        boolean hasTicket;
        hasTicket = true;

        boolean isVIP;
        isVIP = false;

        if (hasTicket && age >= 18){
            System.out.println( "Wejdź!");
        }

        if (!(isVIP) || hasTicket){
            System.out.println("VIP lub bilet");
        }

        //if (isVIP) {
            System.out.println("Nie jest VIP");
        //}

    }
}
