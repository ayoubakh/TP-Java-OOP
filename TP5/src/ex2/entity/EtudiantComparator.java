package ex2.entity;

import java.util.Comparator;

public class EtudiantComparator implements Comparator<Etudiant> {

    @Override
    public int compare(Etudiant o1, Etudiant o2) {
        return o1.code - o2.code;
    }


}
