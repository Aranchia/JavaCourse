package JavaBasic.src;

/* Scanner — dane osobowe średnie
Napisz program który pyta użytkownika o imię, wiek i miasto. Potem wyświetla: "Cześć [imię]! Masz [wiek] lat i mieszkasz w [miasto]."*/

import java.lang.classfile.attribute.SourceDebugExtensionAttribute;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*String name;
        int age;
        String city;*/

        System.out.print("Podaj swoje imię: ");
        String name = scanner.nextLine();

        System.out.print("Podaj swój wiek: ");
        int age = scanner.nextInt();

        System.out.print("Podaj nazwę miasta zamieszkania (odmienioną): ");
        String city = scanner.nextLine();

        scanner.close();

        System.out.println("Cześć" + " " + name +" "+ "!"+ " "+"Masz" + " " + age + " " + "lat" +" "+ "i mieszkasz w" + " " + city);

    }
}
