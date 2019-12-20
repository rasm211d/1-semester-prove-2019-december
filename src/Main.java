import org.w3c.dom.ls.LSOutput;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Main {

    public static void main(String[] args) {
        System.out.println(hello(""));
    }

    public static String hello(String navn) {
        if (navn.equals("")) {
            return "Hello World!";
        }
        else {
            return "Hello " + navn + "!";
        }

    }


}
