package ex1q2;

public class Test {
    public static void main(String[] args) {

        EmpTechnique  empT  = new EmpTechnique("Ahmed", 2000);
        EmpAdministratif  empA  = new EmpAdministratif("Samir", 2000);

        AbsCotisation[] tbl = {empA, empT};

        System.out.println("Abstraction");

        for (int i = 0; i < tbl.length; i++) {
            System.out.println(tbl[i].calculerCotisation());
        }
    }
}
