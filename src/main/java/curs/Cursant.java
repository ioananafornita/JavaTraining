package curs;
import org.junit.Assert;
import org.junit.Test;

public class Cursant
{
    //comentariu
    /* alfel de comentariu
    class= o colectie de variabile si metode
    intr-un fisier JAva, putem avea mai multe clase
    recunoastem o clasa dupa cuvantul cheie "class"
    structura class: public class "nume" {}
    orice structura invatam trebuie scrisa in interiorul unei clase (Java)
     */

    // variabila= atributul/proprietatea unei clase
    // o clasa poate avea n variabile sau deloc
    // tipuri de variabile: globale sau locale
    // o variabila trebuie sau nu sa primeasca o valoare
    // structura variabilei globale= public "tip variabila" "nume"
    // dam o valoare unei variabile cu "="

    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public String Ocupatie;
    public Character Sex;
    public Double Inaltime;
    public Boolean esteAngajat;

    //method= actiunea unei clase
    // tipuri de metode= void si return
    // structura metoda void= public void "nume" ()
    // metodele pot sa nu contina parametri

    @Test
    public void AtribuireVariabile()
    // dam valori pentru variabilele de mai sus

    {
       Nume="Nafornita";
       Prenume= "Ioana";
       Varsta=21;
       Ocupatie="student";
       Sex='F';
       Inaltime=1.63;
       esteAngajat=false;

       //printam valoarea in consola
       System.out.print(Nume);
       System.out.print(" ");
       System.out.print(Prenume);
       System.out.print(" ");
       System.out.print(Varsta);
       System.out.print(" ");
       System.out.print(Ocupatie);
       System.out.print(" ");
       System.out.print(Inaltime);
       System.out.print(" ");
       System.out.print(esteAngajat);
       System.out.println();

       int smth = 5;
       //print vs println
        // print = printeaza si ramane pe acelasi rand
        //prinln= printeaza si sare la randul urmator
       PrintStuff("something else", smth);
    }

    public void PrintStuff(String prenume, int a)
    {
        System.out.print(Nume);
        System.out.print(" ");
        System.out.print(prenume);
        System.out.println();
        System.out.println(25 + a);
        int sum = Sum(10, a);
        System.out.println(sum);
        printeazaNota();
        System.out.println();
        promovareCurs();

        System.out.println(getSalarV2());
        System.out.println(getSalarV1());
    }

    public int Sum(int a, int b)
    {
        int sum = a + b;

        return sum;
    }


    public void cursTest()
    {
        String name = "ioana";
        Assert.assertEquals("ioana", name);
        Assert.assertNotNull(name);
        //PrintStuff();
    }

    // variabila locala= tip variabila nume
    public void printeazaNota()
    {
        Integer NotaManual=5;
        Integer NotaAutomation=10;

        System.out.print("Cursantul Ioana a luat notele:"+ NotaManual+","+NotaAutomation );
//concatenare= S1+S2

    }

    public void promovareCurs()
    {
        Boolean promovare=true;
        System.out.print("A promovat cursantul:"+Nume+" "+Prenume+ "?"+" ");
        System.out.println(promovare);

    }

    public String getSalarV2() {
        Integer Salariu=15000;
        String s=String.valueOf(Salariu)+" Lei";
        return s;
    }

    public Integer getSalarV1(){
        Integer salar=5000;
        return salar;
    }
}

// 12.05.2022
//Metoda Return= exprimare care contine "returneaza"
// Structura metoda return= public tip de data+ nume () {}
// exista o conventie in Java ca metodele cu return sa aiba in fata "get"
// returnam salariul dorit

//17.05.2022
// Structuri = sunt de 2 feluri
// Structuri alternative si repetitive
