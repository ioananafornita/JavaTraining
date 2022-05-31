package OOPMostenire;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SportTest
{
    @Test
    public void mostenireTest(){
//        facem un obiect copil pentru fotbal
//        List<String> reguliFotbal = new ArrayList<>();
//        reguliFotbal.add("Nu ai voie sa atingi mingea cu mana");
//        reguliFotbal.add("Nu ai voie sa faci fault");
//        reguliFotbal.add("Nu ai voie sa iti dai tricoul jos");
//        Fotbal fotbalSport = new Fotbal("Fotbal", "Sport de echipa",
//                true, 11,  true, 3, reguliFotbal);
//        fotbalSport.infoSport();
//        fotbalSport.infoFotbal();


        List<String> reguliBaschet = new ArrayList<>();
        List<String> echipa1 = new ArrayList<>();
        List<String> echipa2 = new ArrayList<>();
        Baschet baschetSport = new Baschet("Baschet", "Sport de echipa", true,5,
                true, 5, reguliBaschet, echipa1, echipa2, 15);
        baschetSport.score(1, 5);
        baschetSport.score(2, 3);
        baschetSport.score(2,3);
        baschetSport.score(1,5);
        baschetSport.score(2,4);
        baschetSport.score(2,7);
        baschetSport.score(1,3);
    }

}
