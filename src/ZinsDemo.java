public class ZinsDemo {
    public static void main(String[] args) {

        double kontostand = 1000;
        double zinsen = 2.25;

        double kontostand1 = 2000;
        double zinsen2 = 5.2;


        System.out.println("Der Kontostand ist: "+Kontostand(kontostand, zinsen));
        System.out.println("Der Kontostand ist: "+Kontostand(kontostand1, zinsen2));

    }

    public static double Kontostand(double kontostand, double zinsen){

        double intermediate = kontostand * zinsen / 100;
        double newKontostand = kontostand + intermediate;

        return newKontostand;
    }




}
