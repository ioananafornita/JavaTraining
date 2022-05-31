package OOP_Interfete;

public class PersoanaSomer extends Persoana_Interfata implements Somer
{
    public PersoanaSomer(String nume, String prenume, String meserie)
    {
        super(nume, prenume, meserie);
    }

    @Override
    public void Someaza()
    {
        System.out.println("Somerul " + getNume() + " " + getPrenume() + " nu munceste.");

    }

    @Override
    public void PrimesteAjutorSocial()
    {
        System.out.println("Somerul " + getNume() + " " + getPrenume() + " primeste ajutor social.");

    }
}
