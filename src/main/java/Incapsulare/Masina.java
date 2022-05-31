package Incapsulare;

public class Masina
{
//    incapsulare = conceptul prin care tinem departe de exterior valorile variabilelor
//    private = access control care blocheaza valorile variabilelor sa fie vazute in afara clase in care au fost declarate
//    ca sa vedem / modificam valorile folosim conceptul de get si set
    private String brand;
    private String model;
    private Integer pret;

//    polimorfism este de 2 feluri: dinamic si static
//    polimorfismul dinamic = intr o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
//    polimorfismul static = mai multe metode cu acelasi nume se pot diferentia prin nr de parametri si tipul lor
//    polimorfismul dinamic = override
//    polimorfismul static = overload
//    polimorfismul static nu se poate aplica la metodele cu return - FALSE

    public Masina(String brand, String model, Integer pret) {
        this.brand = brand;
        this.model = model;
        this.pret = pret;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getPret() {
        return pret;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

//    definim o metoda pe care o vom suprascrie (override)
    public void cumparaMasina()
    {
        System.out.println("Vreau sa cumpar o masina ");
    }

    public void cumparaMasina(String mesaj)
    {
        System.out.println(mesaj);
    }

    public int testStaticPolymorphism(int a)
    {
        return a;
    }

    public int testStaticPolymorphism(int a, String c)
    {
        return a;
    }
}
