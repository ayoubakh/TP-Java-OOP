package ex1q1;

public class Test {
    public static void main(String[] args) {

        EmpTechnique  empT  = new EmpTechnique("Ahmed", 2000);
        EmpAdministratif  empA  = new EmpAdministratif("Samir", 2000);

        System.out.println(empT);
        System.out.println(empA);

        double ct = empT.calculerCotisation();
        double ca = empA.calculerCotisation();

        System.out.println(ct);
        System.out.println(ca);


    }
}
