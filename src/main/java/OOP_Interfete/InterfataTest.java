package OOP_Interfete;

import org.junit.Test;

public class InterfataTest {

    @Test
    public void metodaInterfata() {

//       persoana angajat
        PersoanaAngajat persoanaAngajat = new PersoanaAngajat("nafornita","Ioana", "angajat");
        persoanaAngajat.Munceste();
        persoanaAngajat.PrimesteSalar();


//        persoana student
        PersoanaStudent persoanaStudent = new PersoanaStudent("nafornita", "Ioana", "student");
        persoanaStudent.Invata();
        persoanaStudent.PrimesteBursa();

//        persoana angajat student
        PersoanaStudentAngajat persoanaStudentAngajat = new PersoanaStudentAngajat("Nume3", "prenume3",
                "angajat-student");
        persoanaStudentAngajat.Invata();
        persoanaStudentAngajat.Munceste();
        persoanaStudentAngajat.PrimesteBursa();
        persoanaStudentAngajat.PrimesteSalar();

//        persoana somer
        PersoanaSomer persoanaSomer = new PersoanaSomer("nafornita", "Ioana", "somer");
        persoanaSomer.PrimesteAjutorSocial();
        persoanaSomer.Someaza();
    }
}