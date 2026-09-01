package JavaBasic.src;


/* Zadanie 7
Rzutowanie — obliczanie średniej łatwe
Zadeklaruj totalPoints = 85 i numberOfSubjects = 6. Oblicz średnią jako double używając rzutowania. Wyświetl też wynik BEZ rzutowania żeby zobaczyć różnicę.*/


public class Zadanie7 {
    public static void main(String[] args) {

        int totalPoints;
        totalPoints = 85;

        int numberOfSubjects;
        numberOfSubjects = 6;

        int averagePoints1;
        averagePoints1 = totalPoints / numberOfSubjects;
        System.out.println("Bez rzutowania: " + averagePoints1);

        double averagePoints2;
        averagePoints2 = (double)totalPoints / numberOfSubjects;

        System.out.println("Z rzutowaniem:" + averagePoints2);
    }
}
