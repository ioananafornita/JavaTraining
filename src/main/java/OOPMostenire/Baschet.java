package OOPMostenire;

import java.util.List;

public class Baschet extends Sport
{
    public Boolean capitan;
    public Integer nrEchipamente;
    public List<String> reguli;
    public List<String> membriEchipa1;
    public List<String> membriEchipa2;
    public Integer scorEchipa1;
    public Integer scorEchipa2;
    public Integer scorGameOver;


    public Baschet(String nume, String descriere, Boolean esteEchipa,
                   Integer membri, Boolean capitan, Integer nrEchipamente, List<String> reguli, List<String> membriEchipa1,
                   List<String> membriEchipa2, Integer scorGameOver) {
        super(nume, descriere, esteEchipa, membri);

        this.capitan = capitan;
        this.nrEchipamente = nrEchipamente;
        this.reguli = reguli;
        this.membriEchipa1 = membriEchipa1;
        this.membriEchipa2 = membriEchipa2;
        this.scorEchipa1 = 0;
        this.scorEchipa2 = 0;
        this.scorGameOver = scorGameOver;
    }
    public void infoBaschet(){
        System.out.println("Informatiile despre baschet sunt: ");
        infoBaschet();
        System.out.println(capitan);
        System.out.println(nrEchipamente);
        System.out.println(reguli);
        System.out.println(membriEchipa1);
        System.out.println(membriEchipa2);
        System.out.println(scorEchipa1);
        System.out.println(scorEchipa2);
        System.out.println(scorGameOver);

    }
    //        creem 2 fields cu scor echipa 1 si 2
    //        a new field numit "scor game over"
    //        facem o metoda care sa ti incrementeze scorul la o echipa si sa se opreasca jocul cand s-a ajuns la game over
    //        functionalitate finala cine a castigat si scorul

    public void score(Integer nrEchipa, Integer valoareCos)
    {
        if(nrEchipa == 1)
        {
           scorEchipa1 += valoareCos;
           if(scorEchipa1 >= scorGameOver)
           {
               PrintGameOver(nrEchipa, scorEchipa1);
           }
        }
        else if (nrEchipa == 2)
        {
           scorEchipa2 += valoareCos;
            if(scorEchipa2 >= scorGameOver)
            {
                PrintGameOver(nrEchipa, scorEchipa2);
            }
        }
    }

    void PrintGameOver(Integer nrEchipa, Integer scorEchipa)
    {
        System.out.println("GAME OVER: A castigat echipa " + nrEchipa + " cu scorul: " + scorEchipa);
    }

}
