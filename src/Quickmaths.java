import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Quickmaths {
    Scanner input = new Scanner(System.in);

    //Main kalder start metoden.
    public static void main(String[] args) {
        new Quickmaths().start();
    }


    //start metoden er lavet med et while loop, der kører så længe brugeren indtaster andet end -1.
    //Den henter metoderne gennemsnit og sum der printes når brugeren har indtastet en a og en b værdi.
    public void start () {
        int a = 0;
        while (a != -1) {
            System.out.println("****Quickmaths****");
            System.out.print("Indtast A:");
            a = input.nextInt();
            System.out.print("Indtast B:");
            int b = input.nextInt();
            System.out.println("Sum: " + sum(a,b));
            System.out.println("Gennemsnit: " + gennemsnit(a,b));
            System.out.println("---------------");

        }


    }

    //simpel matematik, gennemsnit tager imod a og b af datatypen int, udregner gennemsnit og returnere det.
    public int gennemsnit(int a, int b) {
        return (a + b) / 2;
    }


    //simpel matematik, sum tager imod a og b af datatypen int, udregner summen og returnere den.
    public int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }




}
