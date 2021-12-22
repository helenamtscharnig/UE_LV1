public class ZinsDemo {
    public static void main(String[] args) {

        double kontostand = 1000;
        double zinsen = 2.25;

        double intermediate = kontostand * zinsen / 100;
        double newKontostand = kontostand + intermediate;

        System.out.println("Der Kontostand ist: "+newKontostand);

    }




}
