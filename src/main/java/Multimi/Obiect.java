package Multimi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Obiect {

    @Test
    public void Object()
    {
    // Array - reprezinta un vector intr-o multime de elemente de acelasi fel
    // Lista -
    // Hashmap -
    PrintNumeArray();
    System.out.println();
    PrintamNumeleList();
    PrindamValoriHashmap();
    TariOrase();
    }

    // Printam toate valorile dintr-un array
    public void PrintNumeArray(){
        String[] sir = new String[4];
        sir[0] = "Ana";
        sir[1] = "Alex";
        sir[2] = "Bogdan";
        sir[3] = "Rares";

        for (Integer index = 0; index < sir.length; index++) {
            System.out.println(sir[index]);
        }
    }

    // Printam toate valorile cu LIST
    public void PrintamNumeleList(){
        List<String> Lista = new ArrayList<>();
        Lista.add("Ana");
        Lista.add("Alex");
        Lista.add("Bogdan");
        Lista.add("Rares");

        for (Integer index = 0; index <Lista.size(); index++){
            System.out.println(Lista.get(index));
        }
    }

    // Printam toate valorile cu Hashmap
    // In Hashmmap - for Each
    public void PrindamValoriHashmap(){
        HashMap<String, String> Hhb = new HashMap<>();
        Hhb.put("Fruct", "Mar");
        Hhb.put("Haina", "Pantalon");
        Hhb.put("Leguma", "Cartof");

        for (String key: Hhb.keySet()){
            System.out.println("Cheia este " + key);
            System.out.println("Valoarea este " + Hhb.get(key));
        }
    }
    //  pentru o anumita cheie atribuim cateva valori in HashMap
    public void TariOrase(){
        List<String> OraseRomania = new ArrayList<>();
        OraseRomania.add("Dej");
        OraseRomania.add("Gherla");
        OraseRomania.add("Cluj");

        List<String> OraseItalia = new ArrayList<>();
        OraseItalia.add("Roma");
        OraseItalia.add("Torino");

        List<String> OraseSpania = new ArrayList<>();
        OraseSpania.add("Barcelona");
        OraseSpania.add("Madrid");
        OraseSpania.add("valencia");
        OraseSpania.add("Malaga");


        HashMap<String, List<String>> HashTariOrase = new HashMap<>();

        HashTariOrase.put("Romania", OraseRomania);
        HashTariOrase.put("Italia", OraseItalia);
        HashTariOrase.put("Spania", OraseSpania);

        for (String key: HashTariOrase.keySet()){
            System.out.println("Tara este " + key);
            System.out.println("Orasele din " + key + " sunt " + HashTariOrase.get(key));
        }
    }

}
