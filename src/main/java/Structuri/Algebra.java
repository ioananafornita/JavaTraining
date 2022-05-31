package Structuri;

import org.junit.Test;

public class Algebra {

    //    19.05.2022
    //    Structuri repetitive: for si while

    @Test
    public void AlgebraTest() {
        PrinteazaNumere();
        PrinteazaNumereWhile();
        PrinteazaPar(100);

    }
    //  Printam primele 50 de numere
    //  For - trebuie sa aiba 3 conditii: 1 conditie vine de la ce pozitie incepe, cond 2 vizeaza cat si cum trebuie sa mearga
    //  3. cum trebuie sa creasca indexul

    public void PrinteazaNumere() {
        for (int index = 0; index < 51; index++) {
            System.out.println(index);
        }
    }

    // index = 0
    // while () {}
    // index++
    //  Printam primele 50 de numere
    public void PrinteazaNumereWhile() {
        int i = 0;
        while (i < 51) {
            System.out.println(i);
            i++;
        }
    }

    // Printeaza numerele pare de la 0 pana la un numar

    public void PrinteazaPar(int capat) {
        for (int i = 0; i < capat; i++) {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }


}
