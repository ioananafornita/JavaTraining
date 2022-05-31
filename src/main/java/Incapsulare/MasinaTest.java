package Incapsulare;

import org.junit.Test;

public class MasinaTest
{
    @Test
    public void masinaTest(){

        Audi AudiA6 = new Audi("Audi", "a6", 30000);
        System.out.println(AudiA6.getPret());
        AudiA6.setModel("R8");
        System.out.println(AudiA6.getModel());
        AudiA6.cumparaMasina();
        Jaguar jaguarNou = new Jaguar("Jaguar", "xf", 90000);
        jaguarNou.cumparaMasina();
    }
}
