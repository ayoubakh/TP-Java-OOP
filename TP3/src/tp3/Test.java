package tp3;

public class Test {

    public static void main(String[] args) {
        
        // Création des instances de ResultatModule pour différents modules
        ResultatModule resModuleJava = new ResultatModule(10, 10, 10);
        ResultatModule resModuleUML = new ResultatModule(10, 10, 10);
        ResultatModule resModuleDatabase = new ResultatModule(1, 3, 10);
        ResultatModule resModuleC = new ResultatModule(10, 10, 10);
        
        // Exemple : Affichage et modification de la note d'examen du module Java
        System.out.println("La note d'examen du module Java = " + resModuleJava.getNoteExamen());
        resModuleJava.setNoteExamen(18);
        System.out.println("La note d'examen du module Java après modification = " + resModuleJava.getNoteExamen());
        
        // Calcul de la moyenne du module Java
        double moyenneModuleJava = resModuleJava.calcMoyenne();
        System.out.println("La moyenne du module Java = " + moyenneModuleJava);
        
        // Vérification de la validation du module Java
        boolean etatValidationModuleJava = resModuleJava.valideModule();
        if (etatValidationModuleJava) { // Vérification si le module est validé
            System.out.println("Le module est validé");
        } else {
            System.out.println("Le module n'est pas validé");
        }
        
        // Tableau contenant les résultats des modules pour un étudiant
        ResultatModule[] modulesEtudiant1 = new ResultatModule[20];
        modulesEtudiant1[0] = resModuleJava;
        modulesEtudiant1[1] = resModuleUML;
        modulesEtudiant1[2] = resModuleDatabase;
        modulesEtudiant1[3] = resModuleC;
        
        // Création d'une instance de AnneeEtudiant pour un étudiant
        AnneeEtudiant anneeEtudiant1 = new AnneeEtudiant(1, 4, modulesEtudiant1);
        
        // Affichage des informations concernant l'année de l'étudiant
        System.out.println("---------------------------------------------");
        System.out.println("Le nombre total des modules : " + anneeEtudiant1.getNombreModules());
        System.out.println("La moyenne de l'année : " + anneeEtudiant1 .moyenneAnnee());
        System.out.println("Le nombre de modules validés : " + anneeEtudiant1 .nombreValides());
    }
}
