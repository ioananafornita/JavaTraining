package Structuri;

import org.junit.Test;

public class Matematica
{

    // Structuri = alternative si repetitive
    // Structuri alternative = IF ... THEN ... ELSE si Switch ... CASE

    @Test
    public void MatematicaTest() {
        numarMaiMareCa20();
        NumarPar();
        numarMaiMareCaUnNumar(68,18);
        numarMaiMareCaUnNumar(5, 10);
        VerificParitateNumar(21);
        VerificParitateNumar(64);
        VerificNumarImparDivizibil(5);
        VerificNumarImparDivizibil(10);
        VerificNumarImparDivizibil(14);
        VerificNumarImparDivizibil(9);
        PrinteazaZi("Duminica");
    }
    // Verificam daca un numar este mai mare ca 20
    public void numarMaiMareCa20()
    {
        if (38>20) {
            System.out.println("Numarul 38 este mai mare ca 20");
        }
        else {
            System.out.println("Numarul 38 este mai mic decat 20");
        }
    }

    public void numarMaiMareCaUnNumar(Integer Numar,Integer Comparatie)
    {
        if (Numar>Comparatie) {
            System.out.println("Numarul " +Numar+ " este mai mare ca " +  Comparatie);
        }
        else {
            System.out.println("Numarul " + Numar+ " este mai mic decat "+  Comparatie);
        }
    }

    // Verificam daca un numar este par
    // "/" este folosit in programare pt a reprezenta impartirea - se foloseste pentru cat
    // "%" se foloseste pentru rest
    public void NumarPar(){

        if (8%2==0){
           System.out.println("Numarul este par");
        }
        else {
            System.out.println("Numarul este impar");
        }
    }

    public void VerificParitateNumar(Integer Number){

        if (Number%2==0){
            System.out.println("Numarul " +Number + " este par");
        }
        else {
            System.out.println("Numarul " + Number + " este impar");
        }
    }

    // Verific daca un numar este impar si divizibil cu 5
    public void VerificNumarImparDivizibil(Integer Numar){

        if (Numar%2==1){
            if (Numar%5==0){
                System.out.println(Numar+ " este impar si divizibil cu 5");
            }
            else {
                System.out.println(Numar+ " este impar dar nu este divizibil cu 5");
            }
        }
        else {
            if (Numar%5==0){
                System.out.println(Numar+ " este par si divizibil cu 5");
            }
            else {
                System.out.println(Numar+ " este par dar nu este divizibil cu 5");
            }
        }
    }

    // Switch case pe zilele saptamanii
    public void PrinteazaZi(String ZiCurenta){
        switch (ZiCurenta){
            case "Duminica":
                System.out.println("Astazi este duminica");
                break;
            case "Luni":
                System.out.println("Astazi este luni");
                break;
            case "Marti":
                System.out.println("Astazi este marti");
                break;
        }
    }









}
