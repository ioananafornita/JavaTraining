package ObiectConstructor;

import java.util.List;

public class Student {
    public String Nume;
    public String Prenume;
    public int Varsta;
    public double Inaltime;
    public char Sex;
    public Boolean areBursa;
    public List<Integer> noteMatematica;
    public List<Integer> noteRomana;
    public List<Integer> noteMaghiara;

    // un obiect reprezinta instanta unei clase; este copia unei clase
    // constructor = are ca rol sa initializeze variabilele unei clase
    // TIPURI CONSTRUCTOR = cu si fara parametri
    // by default avem un constructor fara parametri in orice clasa
    // intr-o clasa putem avea n constructori
    // structura constructor = public NumeleClasei (are sau nu parametri)
    // nu exista constructor cu return

    public Student(String Nume, String Prenume, int Varsta, double Inaltime, char Sex,
                   Boolean areBursa, List<Integer> noteMatematica, List<Integer> noteRomana){

        this.Nume = Nume;
        this.Prenume = Prenume;
        this.Varsta = Varsta;
        this.Inaltime = Inaltime;
        this.Sex = Sex;
        this.areBursa = areBursa;
        this.noteMatematica = noteMatematica;
        this.noteRomana = noteRomana;
    }

    //  Facem un alt constructor
    public Student(String Nume, String Prenume, int Varsta, double Inaltime, char Sex,
                   Boolean areBursa, List<Integer> noteMatematica){
        this.Nume = Nume;
        this.Prenume = Prenume;
        this.Varsta = Varsta;
        this.Inaltime = Inaltime;
        this.Sex = Sex;
        this.areBursa = areBursa;
        this.noteMatematica = noteMatematica;
    }

    public Student(String nume, String prenume, int varsta, double inaltime, char sex, Boolean areBursa,
                   List<Integer> noteMatematica, List<Integer> noteRomana, List<Integer> noteMaghiara) {
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
        Inaltime = inaltime;
        Sex = sex;
        this.areBursa = areBursa;
        this.noteMatematica = noteMatematica;
        this.noteRomana = noteRomana;
        this.noteMaghiara = noteMaghiara;
    }

    public void InfoStudent(){

        System.out.println("Numele studentului este " + Nume);
        System.out.println("Prenumele studentului este " + Prenume);
        System.out.println("Varsta studentului este " + Varsta);
        System.out.println("Sexul studentului este " + Sex);
        System.out.println("Inaltimea studentului este de " + Inaltime);
        System.out.println("Are studentul bursa? " + areBursa);
    }

    public void InfoNote(String Materie){

        if (Materie.equals("romana") || Materie.equals("Romana"))
        {

            System.out.println("Notele studentului la Romana sunt urmatoarele: ");
            for (Integer index = 0; index < noteRomana.size(); index++)
            {
                System.out.println(noteRomana.get(index));
            }
        }

        if (Materie.equals("matematica") || Materie.equals("Matematica"))
        {

            System.out.println("Notele studentului la Matematica sunt urmatoarele: ");
            for (Integer index = 0; index < noteMatematica.size(); index++)
            {
                System.out.println(noteMatematica.get(index));
            }
        }
        if (Materie.equals("maghiara") || Materie.equals("Maghiara"))
        {

            System.out.println("Notele studentului la Maghiara sunt urmatoarele: ");
            for (Integer index = 0; index < noteMaghiara.size(); index++)
            {
                System.out.println(noteMaghiara.get(index));
            }
        }
    }

    public void PrintNoteList(List<Integer> note)
    {
            for (Integer index = 0; index < note.size(); index++)
            {
                System.out.println(note.get(index));
            }
    }
// sa calculam media pt fiecare materie
    public float CalculareMedie(List<Integer> note) {
        Integer sum = 0;
        for (Integer nota : note)
        {
            sum += nota;
        }
        return (float) sum / note.size();
    }

    public void PrintareMesajMedie(String materie, float medie)
    {
        System.out.println("Media pentru materia " + materie + " este " + medie);
    }

//    public void CalculMedie (String Materie) {
//        if (Materie.equals("matematica") || Materie.equals("Matematica"))
//        {
//            System.out.println("Media studentului la Matematica este: ");
//            double sum = 0;
//            Integer nrElemente = noteMatematica.size();

//            for (Integer index = 0; index < noteMatematica.size(); index++)
//            {
//                sum =+ noteMatematica.get(index);
//            }
//            double medie = suma / nrelemente;
//            System.out.println(Medie);
//        }
//    }
}


