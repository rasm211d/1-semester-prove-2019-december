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


    //Her oprettes et Array med 5 brugere
    private String brugere[] = {"Anders", "Birgit", "Carsten", "Dennis", "Esben"};

    /*public String[] getBrugere() {
        return brugere;
    }*/

    /*
    Her i main metoden aktiveres de andre metoder.
     */
    public static void main(String[] args) {
        Loops l = new Loops();
        l.printBrugereArr();
        System.out.println("*******");
        l.printBrugereReverseArr();
        System.out.println("*******");
        l.waitingFor0();
    }

    //Her udskrives brugene i konsollen ved et for loop der gennemgår Arrayet indtil det slutter, og udskriver hvert index.
    public void printBrugereArr() {
        for (int i = 0; i < brugere.length; i++) {
            System.out.println(brugere[i]);
        }
    }

    /*Her bruger jeg metoden Collections.reverse, der bytter om på rækkefølgen at det indsatte array. og derefter printer jeg det på samme måde
    som ovenfor*/
    public void printBrugereReverseArr() {

        Collections.reverse(Arrays.asList(brugere));
        for (int i = 0; i < brugere.length; i++) {
            System.out.println(brugere[i]);
        }

    }

    /* Her oprettes en variabel a af typen int. Denne er sat til 1. Herefter hopper den ind i loopet da a ikke er = 0.
    While loopet udskriver teksten og beder brugeren om at indtaste et tal, så længe brugeren ikke skriver 0 fortsætter dette loop. når brugeren
    skriver 0 afsluttes loopet da conditionen i while er false
     */
    public void waitingFor0() {

        int a = 1;
        while (a != 0) {
            System.out.print("Venter på 0! Skriv et tal: ");
            a = input.nextInt();
        }
 
    }
}
