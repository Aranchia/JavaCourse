package JavaBasic.src;

public class WyznaczanieTrasy {

    public static void main(String[] args) {
        String zm1, zm2, zm3;
        zm1 = "Brockenhaus";
        zm2 = "Große Zeterklippe";
        zm3 =  "Stempelsbuche";
        //Brocken
        //String zm1 = "Brockenhaus";
        double SzerGeogr1 = 51.800529;
        double DlugGeogr1 = 10.615778;

        // Große Zeterklippe
        //String zm2 = "Große Zeterklippe";
        double SzerGeogr2 = 51.802639;
        double DlugGeogr2 = 10.643361;

        // Stempelsbuche
        //String zm3 = "Stempelsbuche";
        double SzerGeogr3 = 51.819363;
        double DlugGeogr3 = 10.627917;
// porównanie Brockenhaus i Große Zeterklippe
        if (SzerGeogr1 < SzerGeogr2) {
            System.out.println(zm1 + " " + SzerGeogr1 + " " + DlugGeogr1);
        }
        else {
            System.out.println(zm2 + " " + SzerGeogr2 + " " + DlugGeogr2);
        }

        // porównanie Brockenhaus i Stempelsbuche
        if (SzerGeogr1 < SzerGeogr3) {
            System.out.println(zm1 + " " + SzerGeogr1 + " " + DlugGeogr1);
        }
        else {
            System.out.println(zm3 + " " + SzerGeogr3 + " " + DlugGeogr3);
        }

        // porównanie Große Zeterklippe i Stempelsbuche
        if (SzerGeogr2 < SzerGeogr3) {
            System.out.println(zm2 + " " + SzerGeogr2 + " " + DlugGeogr2);
        }
        else {
            System.out.println(zm3 + " " + SzerGeogr3 + " " + DlugGeogr3);
        }

        // porównanie Große Zeterklippe i Brockenhaus
        if (SzerGeogr2 < SzerGeogr1) {
            System.out.println(zm2 + " " + SzerGeogr2 + " " + DlugGeogr2);
        }
        else {
            System.out.println(zm1 + " " + SzerGeogr1 + " " + DlugGeogr1);
        }

    }
}
