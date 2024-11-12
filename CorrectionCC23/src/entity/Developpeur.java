package entity;

public class Developpeur {
    public int idDev;
    public String nomDev;

    public Developpeur(int idDev, String nomDev) {
        this.idDev = idDev;
        this.nomDev = nomDev;
    }

    @Override
    public String toString() {
        return "Developpeur [idDev=" + idDev + ", nomDev=" + nomDev + "]";
    }
}