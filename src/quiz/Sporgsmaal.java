package quiz;

import java.util.ArrayList;

public class Sporgsmaal {
    private String sporgsmaalsTekst;
    private int point;
    private Svar[] svar;
    private int rigtigtSvarIndex;

    public void setSporgsmaalsTekst(String sporgsmaalsTekst) {
        if (sporgsmaalsTekst.length() > 100) {
            throw new IllegalArgumentException("Spørgsmål må maks være 100 tegn!");
        } else
            this.sporgsmaalsTekst = sporgsmaalsTekst;
    }

    public String getSporgsmaalsTekst() {
        return sporgsmaalsTekst;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setSvar(Svar[] svar) {
        this.svar = svar;
    }

    public Svar[] getSvar() {
        return svar;
    }

    public void setRigtigtSvarIndex(int rigtigtSvarIndex) {
        this.rigtigtSvarIndex = rigtigtSvarIndex;
    }

    public int getRigtigtSvarIndex() {
        return rigtigtSvarIndex;
    }
}
