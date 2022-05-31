package OOP_Interfete;

public class PersoanaStudentAngajat extends Persoana_Interfata implements Student, Angajat
{
    public PersoanaStudentAngajat(String nume, String prenume, String meserie)
    {
        super(nume, prenume, meserie);
    }

    @Override
    public void Munceste()
    {
        System.out.println("Studentul angajat " + getNume() + " " + getPrenume() + " munceste.");

    }

    @Override
    public void PrimesteSalar()
    {
        System.out.println("Studentul angajat " + getNume() + " " + getPrenume() + " primeste saluariu.");

    }

    @Override
    public void Invata()
    {
        System.out.println("Studentul angajat " + getNume() + " " + getPrenume() + " invata.");

    }

    @Override
    public void PrimesteBursa()
    {
        System.out.println("Studentul angajat " + getNume() + " " + getPrenume() + " primeste bursa.");

    }
}
