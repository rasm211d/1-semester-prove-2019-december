package quiz;

//Denne klasse bruges når der skal laves en svarliste til spørgsmålet ind i Quiz klassen.
public class Svar {
    private String svar = "";

    public Svar(String svar) {
        this.svar = svar;
    }

    public String getSvar() {
        return svar;
    }
}
