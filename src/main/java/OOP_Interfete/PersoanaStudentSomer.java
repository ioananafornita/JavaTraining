package OOP_Interfete;

public class PersoanaStudentSomer extends Persoana_Interfata implements Student, Somer
{
    public PersoanaStudentSomer(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    @Override
    public void Someaza()
    {
        System.out.println("Studentul somer " + getNume() + " " + getPrenume() + " nu lucreaza.");
    }

    @Override
    public void PrimesteAjutorSocial()
    {
        System.out.println("Studentul somer " + getNume() + " " + getPrenume() + " primeste ajutor social.");

    }

    @Override
    public void Invata()
    {
        System.out.println("Studentul somer " + getNume() + " " + getPrenume() + " invata.");

    }

    @Override
    public void PrimesteBursa()
    {
        System.out.println("Studentul somer " + getNume() + " " + getPrenume() + " primeste bursa.");

    }
}
