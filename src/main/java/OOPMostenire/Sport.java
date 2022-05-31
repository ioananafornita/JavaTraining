package OOPMostenire;

public class Sport
{
    public String nume;
    public String descriere;
    public Boolean esteEchipa;
    public Integer membri;

    public Sport(String nume, String descriere, Boolean esteEchipa, Integer membri) {
        this.nume = nume;
        this.descriere = descriere;
        this.esteEchipa = esteEchipa;
        this.membri = membri;
    }
    // OOP Mostenire = principiul pe baza caruia clasa parinte poate sa fie mostenita de n clase copii
    // ex: casa bunicilor cu nepotii
    // in Java putem mosteni o singura clasa
    // in momentul in care clasa copil mosteneste clasa parinte trebuie sa apelam constructorul din clasa parinte

    public void infoSport(){
        System.out.println(nume);
        System.out.println(descriere);
        System.out.println(esteEchipa);
        System.out.println(membri);
    }
}
