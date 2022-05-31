package Tema;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Tema1 {
    // sa facem cate o metoda pentru fiecare cerinta
    //toate cerintele sa fie chemate intr-o metoda de test


    @Test
    public void PrintareRezultat()
    {
       Cerinta1(BiletDePlecareGlobal);
       Cerinta2(BiletDePlecareGlobal);
       Cerinta3(BiletDePlecareGlobal);
       Cerinta4(BiletDePlecareGlobal);
       Cerinta5(BiletDePlecareGlobal);
       Cerinta6(BiletDePlecareGlobal);
       Double Sum = Cerinta7();
       int Result = Cerinta8();
       Cerinta9(Sum, Result);
       Cerinta10();
       Cerinta11();
       Cerinta12();
//       Cerinta12_1();
    }


    /* a) Variables
EXERCISES

Clasa noua creeata
Afiseaza pe ecran urmatoarele:
PENTRU FIECARE LINIE SE DECLARA VARIABILE NOI

- Hello World
- Varsta ta (numar)
- Numele si prenumele pe 2 randuri
- (Tot) Care ii data de astazi?
  1/13/2019
  18:30 PM
  Marti/Joi
- Cat face [2+(3*4)-3]/3 ?
  Rezultatul corect este: {rezultatul}
- afiseaza pe ecran suma a 3 numere double intr-o variabila de acelasi tip +mesaj
- afiseaza pe ecran produsu a 2 numere integer intr-o variabila de acelasi tip+mesaj
- concateneaza la valoarile rezultate de mai sus mesajul "Stiu ca am calculat bine" si afiseaza-l pe ecran cu tot cu rezultatul calculului
- Adauga la "Salut" caracterul "M" la final
- Adauga la "Hello" caracterul "H" la inceput
- Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la final caracterul "Z"
- Comenteaza cerinta 2 4 6
- Decomenteaza cerintele comentate
- Adauga la toate rezultatele obtinute " Poti pleca acasa dupa ce iti verific munca!"

     */
    public String Mesaj;
    public Integer Varsta;
    public String Nume;
    public String Prenume;
    public String DataActuala;
    public final String BiletDePlecareGlobal = "Poti pleca acasa dupa ce iti verific munca!" ;


    public void Cerinta1(String BiletDePlecare)
    {
        Mesaj = "Hello World";
        System.out.println(Mesaj + " " + BiletDePlecare);
    }

    public void Cerinta2(String BiletDePlecare)
    {
        Varsta = 21;
        System.out.println(Varsta + " " + BiletDePlecare);
    }

    public void Cerinta3(String BiletDePlecare)
    {
        Nume = "Nafornita";
        System.out.println(Nume + " " + BiletDePlecare);
    }

    public void Cerinta4(String BiletDePlecare)
    {
        Prenume = "Ioana";
        System.out.println(Prenume + " " + BiletDePlecare);
    }

    public void Cerinta5(String BiletDePlecare)
    {
        DataActuala = "Care este data de astazi?";
        System.out.println(DataActuala);
        LocalDate TodayDate = LocalDate.now();
        System.out.println(TodayDate);
        System.out.println(LocalTime.now());
        System.out.println(DayOfWeek.from(TodayDate) + " " + BiletDePlecare);
    }

    public void Cerinta6(String BiletDePlecare)
    {
        int Operation = (2+(3*4)-3)/3;
        System.out.println("Rezultatul corect este: " + Operation + " " + BiletDePlecare);
    }

    public Double Cerinta7()
    {
        Double Sum = 4.764 + 2.634 + 5.932;
        System.out.println("Sum of 3 Double numbers is: " + Sum + " " + BiletDePlecareGlobal);

        return Sum;
    }

    public int Cerinta8()
    {
        int Result = 21 * 50;
        System.out.println("Multiplication of 2 int numbers is: " + Result + " " + BiletDePlecareGlobal);

        return Result;
    }

    public void Cerinta9(Double Sum, int Result)
    {
        System.out.println("Stiu ca am calculat bine " + Sum + " " + Result + " " + BiletDePlecareGlobal);
    }

    public void Cerinta10()
    {
        Mesaj = "Salut";
        System.out.println( Mesaj + 'M' + " " + BiletDePlecareGlobal);
    }

    public void Cerinta11()
    {
        Mesaj = "Hello";
        System.out.println('H' + Mesaj + " " + BiletDePlecareGlobal);
    }

//    public void Cerinta12_1()
//    {
//        char[] vocale = new char[] {'a', 'e', 'i', 'o', 'u'};
//        String GradinaAnei = "Ana are mere, pere , prune, telefon";
//        for (int i = 0; i < GradinaAnei.length(); i = i + 1)
//        {
//            char character = GradinaAnei.charAt(i);
//            Character nextChar = null;
//            if (i + 1 < GradinaAnei.length())
//                nextChar = GradinaAnei.charAt(i + 1);
//            System.out.println(Arrays.asList(vocale).contains(character));
//            if (Arrays.asList(vocale).contains(character) && (nextChar == null || nextChar == ' ' || nextChar == ','))
//            {
//                GradinaAnei = addChar(GradinaAnei, 'Z', i);
//            }
//        }
//        System.out.println(GradinaAnei);
//        int[] intArray = new int[] {5, 10, 15, 20};
//        System.out.println(intArray[3]);
//        System.out.println();
//    }

    public void Cerinta12()
    {
        String litera = "Z ";
        System.out.println("Ana" + litera + "are" + litera + "mere" + litera + ", " + "pere" + litera + ", " + "prune" + litera + "." + " " + BiletDePlecareGlobal);
    }

//    private String addChar(String str, char ch, int position) {
//        StringBuilder sb = new StringBuilder(str);
//        sb.insert(position, ch);
//        return sb.toString();
//    }
}

