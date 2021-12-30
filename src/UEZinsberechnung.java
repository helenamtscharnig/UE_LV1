public class UEZinsberechnung {

    public static void main(String[] args) {
        int kontostand = 1000;
        double zinsen = 2.25;

        double erhalteneZinsen = kontostand*zinsen/100;

        System.out.println("Die erhaltenen Zinsen sind: "+erhalteneZinsen);
        System.out.println("Die erhaltenen Zinsen sind: "+zinsen(2000,2));
        System.out.println("Die erhaltenen Zinsen sind: "+zinsen(5000,3.5));
    }

    public static double zinsen(int kontost, double zinssatz){
        double zinsen = kontost*zinssatz/100;
        return zinsen;
    }



}
