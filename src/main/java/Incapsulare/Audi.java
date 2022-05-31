package Incapsulare;

import java.util.List;

public class Audi extends Masina
{
    public List<String> dotariInterioare;
    public List<String> dotariexterioare;

    public Audi(String brand, String model, Integer pret)
    {
        super(brand, model, pret);
    }

    public void infoAudi()
    {
        System.out.println(getBrand());
        System.out.println(getModel());
        System.out.println(getPret());
    }

//    suprascriem o metoda din clasa paarinte
   @Override
    public void cumparaMasina(){
       System.out.println("Vreau sa cumpar un " + getBrand() + " " + getModel());
       super.cumparaMasina();
    }

//    polimorfism static

    public void afiseazaMasini(){
        System.out.println("Nu avem masini");
    }

    public void afiseazaMasini(String brand){
        System.out.println("Nu avem masini");
    }

    public void afiseazaMasini(String brand, Integer an){
        System.out.println("Nu avem masini");
    }

    public void afiseazaMasini(Integer pret){
        System.out.println("Nu avem masini");
    }

//    polimorfism static la metode cu return; se poate aplica numai la diferenta de paramtri.
//    nu conteaza numele parametrilor sau tipul lor
    public String getNume(){
        return "Ioana";
    }
    public String getNume(Integer parametru){
        return "Ioana";
    }
    public String getNume(String parametru){
        return "Ioana";
    }
}
