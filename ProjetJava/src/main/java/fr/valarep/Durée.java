package fr.valarep;

public class Durée {
    private int heures;
    private int minutes;

    public Durée(int heures, int minutes) {
        plusHeures(heures);;
        plusMinutes(minutes);
    }

    public Durée(double dec) {
        setDurée(dec);
    }

    public int getHeures() {
        return heures;
    }

    public int getMinutes() {
        return minutes;
    }

    public double getDec() {
        double dec = 0;
        dec += heures;
        dec += minutes / 60.0;
        return dec;
    }

    public void setDurée(double dec) {
        heures = (int) dec;
        double resteMinutes = dec - heures;
        minutes = (int) (60 * resteMinutes);
    }

    public void plusHeures(int h) {
        heures += h;
    }

    public void plusMinutes(int m) {
        minutes += m;
        while (minutes > 59) {
            minutes = minutes - 60;
            heures++;
        }
    }

    public void plusDurée(double dec) {
        setDurée(getDec() + dec);
    }

    public void plusDurée(int h, int m) {
        plusHeures(h);
        plusMinutes(m);
        
    }

    public void plusDurée(Durée... durées) {
        for (Durée durée : durées) {
            plusDurée(durée.getHeures(), durée.getMinutes());
        }

        // for (int i = 0; i < durées.length; i++) {
        // plusDurée(durées[i].getHeures(),durées[i].getMinutes());
        // }
    }
}