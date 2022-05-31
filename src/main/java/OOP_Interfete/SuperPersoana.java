package OOP_Interfete;

public class SuperPersoana extends Persoana_Interfata implements Student, Angajat, Somer
{

    public SuperPersoana(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    @Override
    public void Munceste()
    {
        System.out.println("Super persoana " + getNume() + " " + getPrenume() + " munceste.");

    }

    @Override
    public void PrimesteSalar()
    {
        System.out.println("Super persoana " + getNume() + " " + getPrenume() + " primeste salar.");

    }

    @Override
    public void Someaza()
    {
        System.out.println("Super persoana " + getNume() + " " + getPrenume() + " nu munceste.");

    }

    @Override
    public void PrimesteAjutorSocial()
    {
        System.out.println("Super persoana " + getNume() + " " + getPrenume() + " primeste ajutor social.");

    }

    @Override
    public void Invata()
    {
        System.out.println("Super persoana " + getNume() + " " + getPrenume() + " invata.");

    }

    @Override
    public void PrimesteBursa()
    {
        System.out.println("Super persoana " + getNume() + " " + getPrenume() + " primeste bursa.");

    }
}
