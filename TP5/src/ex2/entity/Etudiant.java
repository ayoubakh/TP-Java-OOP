package ex2.entity;
import java.util.*;

public class Etudiant {

    public int code;
    public String nom, prenom, filiere;

    public Etudiant(){
        super();

    }
    public Etudiant(int code, String nom, String prenom, String filiere) {
        super();
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.filiere = filiere;
    }

    @Override
    public String toString() {
        return "Etudiant [code=" + code + ", nom=" + nom + ", prenom=" + prenom + ", filiere=" + filiere + "]";
    }

    public static boolean rechercheParCode(List<Etudiant> l, int codeRech) {
        for (Etudiant e : l) {
            if(e.code == codeRech) {
                return true;
            }
        }
        return false;
    }

    public static void affichage(List<Etudiant>  liste){
        for (Etudiant e : liste) {
            System.out.println(e);
        }
    }

    public static LinkedList<Etudiant> trierListe(LinkedList<Etudiant> liste){
        Collections.sort(liste, new Comparator<Etudiant>() {
            @Override
            public int compare(Etudiant o1, Etudiant o2) {
                //return o1.code - o2.code;
                 return Integer.compare(o1.code, o2.code);
            }
        });
        return liste;
    }

    public static LinkedList<Etudiant> trierListeV2(LinkedList<Etudiant> liste){
        Collections.sort(liste, new EtudiantComparator());
        return liste;
    }


   // @Override
   // public int compare(Etudiant o1, Etudiant o2) {
    //    return o1.code - o2.code;
    //}

  //  public static LinkedList<Etudiant> trierListeV2(LinkedList<Etudiant> liste){
    //    Collections.sort(liste, new Etudiant());
      //  return liste;
   // }


}