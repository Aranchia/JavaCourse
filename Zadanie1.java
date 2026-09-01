package JavaBasic.src;

/* Zadanie 1
Zmienne i typy danych — profil użytkownika
Zadeklaruj zmienne opisujące profil użytkownika: imię (String), wiek (int), wzrost w metrach (double), czy ma konto premium (boolean). Przypisz wartości i wyświetl wszystko w konsoli w czytelnym formacie. */

public class Zadanie1 {
    public static void main(String[] args) {
       String name;
       name = "Gosia";

       int age;
       age = 49;

       double high;
       high = 1.63;

       boolean premium;
       premium = true;


        System.out.println("Imię:" + name);
        System.out.println("Wiek:" + age);
        System.out.println("Wzrost:" + high);
        System.out.println("Konto Premium:" + premium);
    }

}


