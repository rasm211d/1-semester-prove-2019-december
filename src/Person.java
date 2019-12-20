import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 18/12/2019
 */

public class Person {

    // Datatyper er rettet
    String navn; // Test Testesen
    int alder; // 18
    String by; // Næstved
    int postNummer; // 4700
    String vej; // Femøvej
    String husnummer; // 3B
    String nationalitet; // Dansk
    String fritidsInteresser; // Snitning, LOL, strikke
    String smarthomeDevices; // Xbox, 3 Smartlamper, Køleskab m.m.
    double hojde; // 1.56 m
    double vaegt;  // 76 kg
    double karaktergennemsnit; // 5.33
    int eksamenskarakter[]; // 7, 12, -3, 4, 2, 10
    Date opdateretDato; // Sun Jan 08 00:00:00 CET 1978

    //Denne metode oversætter alle givne variabler til tekst.
    @Override
    public String toString() {
        return "Navn: " + navn + "\nAlder: " + alder + "\nBy: " + by + "\nVej: " + vej + "\nHusnummer: " + husnummer +
                "\nNationalitet: " + nationalitet + "\nFritidsinteresser " +fritidsInteresser
                + "\nSmarthomedevices: " + smarthomeDevices + "\nHøjde: " + hojde  + "m" + "\nVægt: " + vaegt + "kg" + "\nKaraktergennemsnit: " + karaktergennemsnit +
                "\nEksamenskarakter" + Arrays.toString(eksamenskarakter) + "\nOpdatereret Dato " + opdateretDato;
    }

    //her gives variable værdier og udskrives til sidst med toString metodekaldet.
    public static void main(String[] args) {

        Person person = new Person();
        person.navn = "Test Testesen";
        person.by = "Næstved";
        person.postNummer = (int) 4700.15;
        person.husnummer = "3B";
        person.nationalitet = "Dansk";
        person.fritidsInteresser = "Snitning";
        person.smarthomeDevices = "Ur";
        person.hojde = (int) 1.56;
        person.vaegt = (int) 89.6567;
        person.karaktergennemsnit = (int)5.33;
        person.eksamenskarakter = new int[]{7, 12, -3, 4, 2, 10};
        person.opdateretDato = new Date();
        System.out.println(person.toString());

    }

}
