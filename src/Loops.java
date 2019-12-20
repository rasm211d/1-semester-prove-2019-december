import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 17/12/2019
 */

public class Loops {
    Scanner input = new Scanner(System.in);

    private String brugere[] = {"Anders", "Birgit", "Carsten", "Dennis", "Esben"};

    /*public String[] getBrugere() {
        return brugere;
    }*/

    public static void main(String[] args) {
        Loops l = new Loops();
        l.printBrugereArr();
        System.out.println("*******");
        l.printBrugereReverseArr();
        System.out.println("*******");
        l.waitingFor0();
    }

    /**
     * Viser en liste med brugere i konsollen
     */
    public void printBrugereArr() {
        for (int i = 0; i < brugere.length; i++) {
            System.out.println(brugere[i]);
        }
    }

    /**
     * Viser en liste med brugere i konsollen i omvendt rækkefølge
     */
    public void printBrugereReverseArr() {

        Collections.reverse(Arrays.asList(brugere));
        for (int i = 0; i < brugere.length; i++) {
            System.out.println(brugere[i]);
        }

    }

    public void waitingFor0() {

        int a = 1;
        while (a != 0) {
            System.out.print("Venter på 0! Skriv et tal: ");
            a = input.nextInt();
        }
 
    }
}
