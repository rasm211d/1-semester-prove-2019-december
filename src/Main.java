import org.w3c.dom.ls.LSOutput;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Main {

    //Main uskriver udfaldet af hello metoden.
    public static void main(String[] args) {
        System.out.println(hello(""));
    }

    //Denne metode modtager et navn af typen String, i metoden tjekkes der for om navn er tom eller hvad der er skrevet og sender det retur.
    public static String hello(String navn) {
        if (navn.equals("")) {
            return "Hello World!";
        }
        else {
            return "Hello " + navn + "!";
        }

    }


}
