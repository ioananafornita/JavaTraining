package Tema;

import java.util.Scanner;

public class Tema2
{
     /* b) Structures

            EXERCISES

    Clasa noua creeate
    Rezolvam urmatoarele:
            -Citim 3 numere cu valori diferite.Daca suma primelor 2 numere este mai mare decat al 3 lea numar afisam un
             mesaj corespunzator +valoarea sumei, altfel afisam contrariul
-Afiseaza de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre
-Problema de mai sus intr-un alt fel rezolvata
-Primele 5 numere divizibile cu 3
            -Primele 3 numere dibizibile cu 5
            -Primele 4 numere pozitive si pare
-Suma numerelor pana la 10
            -Produsul numerelor pana la 5
            -Problemele de mai sus le rescriem si in for/while in functie de ce abordare a avut fiecare

    */
    public static void main(String[] args)
    {
//        Cerinta1();
        Cerinta2();
        Cerinta3();
        Cerinta4();
        Cerinta5();
        Cerinta4si5(5, 3);
        System.out.println();
        Cerinta4si5(3, 5);
        System.out.println();
        Cerinta6(4, 0); //par
        System.out.println();
        Cerinta6(10, 1); //impare
        System.out.println();
        Cerinta7(10);
        Cerinta8(5);
        Cerinta7v1(10);
        Cerinta8v1(5);
    }

    public static void Cerinta1()
    {
        int Nr1;
        int Nr2;
        int Nr3;

        // Librarie care ne ajuta sa citim de la consola diferite tipuri de date
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduceti primnul numar: ");
        // Nr1 va avea valoarea primului numar intreg scris in consola
        Nr1 =  reader.nextInt();
        System.out.println("Introduceti al 2-lea numar: ");
        Nr2 = reader.nextInt();
        System.out.println("Introduceti al 3-lea numar: ");
        Nr3 = reader.nextInt();

        // if logic here
        int sum = Nr1 + Nr2;
        if (sum > Nr3)
        {
            System.out.println("Suma primelor doua numere este mai mare decat numarul al treilea si este egala cu " + sum );
        }
        else
        {
            System.out.println("Suma primelor doua numere este egala cu " + sum + " si nu este mai mare decat numarul al treilea" );
        }
    }
    static final String da = "DA";
    static final String spatiu = " ";
    static int i;
    static int numar;
    static int sum;
    public static void Cerinta2()
    {
        System.out.println(da + spatiu + da + spatiu + da + spatiu + da + spatiu + da);
    }

    public static void Cerinta3()
    {
        int index = 0;
        while (index < 5)
        {
            System.out.print(da + spatiu);
//            index = index + 1;
//            index++;
            index+=1;
        }
        System.out.println();
    }
    public static void Cerinta4()
    {
        i = 0;
        numar = 1;
        while (i < 5)
        {
           if (numar % 3 == 0)
           {
               System.out.print(numar + spatiu);
               i++;
           }
           numar++;
        }
    }

    public static void Cerinta5()
    {
        i = 0;
        numar = 1;
        while (i < 3)
        {
            if (numar % 5 == 0)
            {
                System.out.print(numar + spatiu);
                i++;
            }
            numar++;
        }
    }

    public static void Cerinta4si5(int numberOfTimes, int divisibleBy)
    {
        i = 0;
        numar = 1;
        while (i < numberOfTimes)
        {
            if (numar % divisibleBy == 0)
            {
                System.out.print(numar + spatiu);
                i++;
            }
            numar++;
        }
    }

    public static void Cerinta6(int numberOfTimes, int expectedResult)
    {
        i = 0;
        numar = 0;
        while (i < numberOfTimes)
        {
            if (numar % 2 == expectedResult && numar >= 0)
            {
                System.out.print(numar + spatiu);
                i++;
            }
            numar++;
        }
    }

    public static void Cerinta7(int sumUpTo)
    {
        i = 1;
        sum = 0;
        while (i <= sumUpTo)
        {
            sum = sum + i;
            i++;
        }
        System.out.println("Suma numerelor pana la " + sumUpTo + " este: " + sum);
    }

    public static void Cerinta8(int prodUpTo)
    {
        int prod = 1;
        for (i = 1; i <= prodUpTo; i++)
        {
           prod = prod * i;
        }
        System.out.println("Produsul numerelor pana la " + prodUpTo + " este: " + prod);
    }
    public static void Cerinta7v1(int sumUpTo)
    {
        int sum = 0;
        for (i = 1; i <= sumUpTo; i++)
        {
            sum = sum + i;
        }
        System.out.println("Suma numerelor pana la " + sumUpTo + " este: " + sum);
    }

    public static void Cerinta8v1(int prodUpTo)
    {
        i = 1;
        int prod = 1;
        while (i <= prodUpTo)
        {
            prod = prod * i;
            i++;
        }
        System.out.println("Produsul numerelor pana la " + prodUpTo + " este: " + prod);
    }
}
