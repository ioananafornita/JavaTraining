package OOPMostenire;

import java.util.List;

public class Fotbal extends Sport
{
    public Boolean capitan;
    public Integer nrEchipamente;
    public List<String> reguli;

    public Fotbal(String nume, String descriere, Boolean esteEchipa, Integer membri, Boolean capitan, Integer nrEchipamente, List<String> reguli) {
        super(nume, descriere, esteEchipa, membri);
        this.capitan = capitan;
        this.nrEchipamente = nrEchipamente;
        this.reguli = reguli;
    }

    public void infoFotbal(){
        System.out.println("Informatiile despre fotbal sunt: ");
        infoSport();
        System.out.println(capitan);
        System.out.println(nrEchipamente);
        System.out.println(reguli);
    }
}
