package Tema;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Tema3
{
    public static void main(String[] args){

    ReteteIngrediente();
    Toshin();
    }

    public static void ReteteIngrediente(){
        List<String> Carbonara = new ArrayList<>();
        Carbonara.add("Penne");
        Carbonara.add("Oua");
        Carbonara.add("Guanciale");
        Carbonara.add("Granna Padano");


        List<String> GarlicBread = new ArrayList<>();
        GarlicBread.add("Paine");
        GarlicBread.add("usturoi");
        GarlicBread.add("unt");
        GarlicBread.add("parmezan");
        GarlicBread.add("patrunjel");


        List<String> DrobVegetarian = new ArrayList<>();
        DrobVegetarian.add("linte");
        DrobVegetarian.add("ulei");
        DrobVegetarian.add("ceapa");
        DrobVegetarian.add("usturoi");
        DrobVegetarian.add("ciuperci");
        DrobVegetarian.add("morcovi");
        DrobVegetarian.add("marar");
        DrobVegetarian.add("patrunjel");
        DrobVegetarian.add("oua");
        DrobVegetarian.add("spanac");


        HashMap<String, List<String>> HashReteteIngrediente = new HashMap<>();

        HashReteteIngrediente.put("Carbonara", Carbonara);
        HashReteteIngrediente.put("Drob Vegetarian", DrobVegetarian);
        HashReteteIngrediente.put("Garlic Bread", GarlicBread);

        for (String key: HashReteteIngrediente.keySet())
        {
            System.out.println("Reteta este " + key);
            System.out.println("Ingredientele pentru  " + key + " sunt " + HashReteteIngrediente.get(key));
        }
    }
    //se da un sir de numere citite din consola de la 1 la n; printeaza numerele pare
    public static void Toshin()
    {
        int n;

        Scanner reader = new Scanner(System.in);
        System.out.println("Introduceti o valoare pentru n : ");
        n =  reader.nextInt();

        int[] Variable = new int[n];

        for (int index = 0; index < n ; index++)
        {
            Variable [index] = reader.nextInt();
        }
        for (int index = 0; index < n ; index++)
        {

            if (Variable[index] % 2 ==0)
            {
                System.out.print(Variable[index] + " ");
            }
        }

    }


}

