package quiz;

public class Quiz {

    public static void main(String[] args) {
        Sporgsmaal sporgsmaal1 = new Sporgsmaal();
        sporgsmaal1.setSporgsmaalsTekst("Hvor Gammel er Rasmus?");
        Svar[] svar = new Svar[2];
        svar[0] = new Svar("19");
        svar[1] = new Svar("21");
        svar[2] = new Svar("30");
        sporgsmaal1.setSvar(svar);
        sporgsmaal1.setPoint(10);
        sporgsmaal1.setRigtigtSvarIndex(1);


    }
}
