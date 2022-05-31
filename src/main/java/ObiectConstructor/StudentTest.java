package ObiectConstructor;

import Structuri.Matematica;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    // obiect = instanta unei clase
    // obiectul este strict legat de constructor
    // dintr-o clasa putem declara n obiecte
    // obiectele se diferentiaza pe baza numelui
    // structura obiect =  numeClasa numeObiect = new numeClasa (valori parametri)
    // recunoastem un obiect dupa covantul "new"

    @Test
    public void MetodaTest(){
        // primul obiect
        List<Integer> noteRomanaIoana = new ArrayList<>();
        noteRomanaIoana.add(7);
        noteRomanaIoana.add(8);
        noteRomanaIoana.add(10);
        noteRomanaIoana.add(7);

        List<Integer> noteMatematicaIoana = new ArrayList<>();
        noteMatematicaIoana.add(6);
        noteMatematicaIoana.add(6);
        noteMatematicaIoana.add(6);
        noteMatematicaIoana.add(9);




        Student Ioana = new Student( "Nafornita", "Ioana", 21, 1.63, 'F',
                false, noteMatematicaIoana, noteRomanaIoana );
        Ioana.InfoStudent();
        Ioana.InfoNote("Matematica");
        Ioana.Prenume = "Ariana";
        Ioana.InfoStudent();
        float medieRomana = Ioana.CalculareMedie(noteRomanaIoana);
        float medieMate = Ioana.CalculareMedie(noteMatematicaIoana);
        Ioana.PrintareMesajMedie("Romana", medieRomana);
        Ioana.PrintareMesajMedie("Matematica", medieMate);

        List<Integer> noteRomanaAlex = new ArrayList<>();
        noteRomanaAlex.add(6);
        noteRomanaAlex.add(5);
        noteRomanaAlex.add(5);
        noteRomanaAlex.add(7);

        List <Integer> noteMatematicaAlex = new ArrayList<>();
        noteMatematicaAlex.add(5);
        noteMatematicaAlex.add(2);
        noteMatematicaAlex.add(10);



        Student Alex = new Student( "Dorha", "Alex", 27, 1.80, 'M',
                false, noteMatematicaAlex, noteRomanaAlex );
        Alex.InfoNote("Matematica");
        Alex.InfoStudent();
        Alex.InfoNote("Romana");
//        Ioana.PrintareMesajMedie("Romana", medieRomana);


        // declaram un alt obiect doar cu note matematica

        List <Integer> noteMatematicaClau = new ArrayList<>();
        noteMatematicaClau.add(5);
        noteMatematicaClau.add(6);
        noteMatematicaClau.add(8);

        Student Claudiu = new Student( "Pop", "Claudiu", 23, 1.83, 'M',
                false, noteMatematicaClau);
        Claudiu.InfoNote("Matematica");
        Claudiu.InfoStudent();

        List<Integer> noteRomanaMarian = new ArrayList<>();
        noteRomanaMarian.add(6);
        noteRomanaMarian.add(5);
        noteRomanaMarian.add(5);
        noteRomanaMarian.add(7);

        List <Integer> noteMatematicaMarian = new ArrayList<>();
        noteMatematicaMarian.add(9);
        noteMatematicaMarian.add(8);
        noteMatematicaMarian.add(10);

        List <Integer > noteMaghiaraMarian = new ArrayList<>();
        noteMaghiaraMarian.add(8);
        noteMaghiaraMarian.add(2);
        noteMaghiaraMarian.add(4);
        noteMaghiaraMarian.add(5);

        Student Marian = new Student( "Laslo", "Marian", 26, 1.83, 'M',
                true, noteMatematicaMarian, noteRomanaMarian, noteMaghiaraMarian);
        Marian.InfoStudent();
        Marian.InfoNote("Matematica");
        Marian.InfoNote("Romana");
        Marian.InfoNote("Maghiara");
//        Marian.PrintareMesajMedie("Mate", medieMate);
//        Marian.CalculMedie("Matematica");
    }
}
// cum sa printeze valoarea cu tot cu 0?
